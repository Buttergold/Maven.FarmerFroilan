package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;

public abstract class Botanist extends Person {
    public Botanist(String name, Farm farm){
        super(name, farm);
    }

    abstract <CropType extends Crop> void plant(CropRow<CropType> row, CropType cropToBePlanted);
}
