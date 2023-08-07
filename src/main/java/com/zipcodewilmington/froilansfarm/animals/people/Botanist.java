package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;

public abstract class Botanist extends Person {
    public Botanist(String name){
        super(name);
    }

    abstract <CropType extends Crop> void plant(CropRow<CropType> row, CropType cropToBePlanted);
}
