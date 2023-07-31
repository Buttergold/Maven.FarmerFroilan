package com.zipcodewilmington.froilansfarm.field.crops;

import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;

public class CornStalk extends Crop<EarOfCorn>{

    public CornStalk yield(){
        return null;
//        return earOfCorn;
    }

    @Override
    public EarOfCorn yield(boolean hasBeenFertilized) {
        return null;
    }

    @Override
    public Boolean hasBeenFertilized() {
        return null;
    }
}
