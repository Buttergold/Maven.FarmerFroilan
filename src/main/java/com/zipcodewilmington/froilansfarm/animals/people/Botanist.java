package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;

public abstract class Botanist extends Person {
    public Botanist(String name){
        super(name);
    }

    abstract void plant(CropRow row, Crop cropToBePlanted);
}
