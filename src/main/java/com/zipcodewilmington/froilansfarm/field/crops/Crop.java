package com.zipcodewilmington.froilansfarm.field.crops;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Edible;

import java.util.ArrayList;
import java.util.List;

public abstract class Crop<Food extends Edible> implements Produce<Food> {
    protected boolean hasBeenHarvested;
    protected boolean hasBeenFertilized;
    protected double yieldRate;

    //Constructor
    protected Crop(){
        hasBeenFertilized = false;
        hasBeenHarvested = false;
        yieldRate = 0.;
    }
    protected Crop(double yieldRate){
        hasBeenFertilized = false;
        hasBeenHarvested = false;
        this.yieldRate = yieldRate;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public Boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public List<Food> yield(){
        List<Food> retVal = new ArrayList<Food>();
        int integerYieldRate = (int) yieldRate;
        for(int i = 0; i < integerYieldRate; i++){
            if(hasBeenHarvested) {
                Food theYield = yield(hasBeenFertilized);
                if (theYield != null) {
                    retVal.add(theYield);
                }
            }
        }
        return retVal;
    }
}
