package com.zipcodewilmington.froilansfarm.field.crops;

import com.zipcodewilmington.froilansfarm.edibles.Tomato;

public class TomatoPlant extends Crop<Tomato> {
    //constructor
    public TomatoPlant(){
        // hard coding this in bc idk yet
        super(2.);
    }

//    public TomatoPlant yield() {
//        return null;
////        return tomato;
//    }

    @Override
    public Tomato yield(boolean hasBeenFertilized) {
        if(hasBeenFertilized){
            return new Tomato();
        }
        return null;
    }
}
