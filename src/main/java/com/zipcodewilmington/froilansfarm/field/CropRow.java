package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow<CropType extends Crop> extends ArrayList<CropType>{
    public CropRow(){
        super();
    }

    public boolean hasCrops(){
        return !this.isEmpty();
    }

    public boolean hasBeenFertilized(){
        for(CropType crop : this){
            if(!crop.hasBeenFertilized()){
                return false;
            }
        }
        return true;
    }

    public void fertilize() {
        for(CropType crop : this){
            crop.setFertilized(true);
        }
    }

    public List<Edible> harvest() {
        List<Edible> yieldedCrops = new ArrayList<Edible>();
        for(CropType crop : this){
            crop.setHarvested(true);
            yieldedCrops.addAll(crop.yield());
        }
        return yieldedCrops;
    }
}
