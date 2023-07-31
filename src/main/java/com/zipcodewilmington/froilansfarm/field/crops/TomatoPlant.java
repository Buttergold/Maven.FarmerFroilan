package com.zipcodewilmington.froilansfarm.field.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;

public class TomatoPlant extends Crop<Tomato> {


    public TomatoPlant yield() {
        return null;
//        return tomato;
    }

    @Override
    public Tomato yield(boolean hasBeenFertilized) {
        return null;
    }

    @Override
    public Boolean hasBeenFertilized() {
        return null;
    }
}
