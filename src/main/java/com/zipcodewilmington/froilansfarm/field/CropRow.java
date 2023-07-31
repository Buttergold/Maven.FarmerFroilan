package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.field.crops.Crop;

import java.util.ArrayList;
import java.util.List;

public class CropRow<CropType extends Crop> extends ArrayList<CropType>{

    public CropRow(){
        super();
    }

    public boolean hasCrops(){
        return true;
    }
}
