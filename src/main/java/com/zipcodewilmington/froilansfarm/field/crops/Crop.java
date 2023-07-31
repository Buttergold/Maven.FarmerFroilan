package com.zipcodewilmington.froilansfarm.field.crops;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.edibles.Edible;

public abstract class Crop<Food extends Edible> implements Produce<Food> {
    protected boolean hasBeenHarvested;
    protected boolean hasBeenFertilized;
    protected double yieldRate;

    public boolean isHarvested() {
        return hasBeenHarvested;
    }

    public void setHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public boolean isFertilized() {
        return hasBeenFertilized;
    }

    public void setFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
