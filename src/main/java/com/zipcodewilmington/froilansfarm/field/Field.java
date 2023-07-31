package com.zipcodewilmington.froilansfarm.field;

import java.util.ArrayList;

public class Field extends ArrayList<CropRow> {

    public Field(){
        this(5);
    }

    public Field(int numOfCropRows){
        super();
        for(int i = 0; i < numOfCropRows; i++){
            this.add(new CropRow(numOfCropRows));
        }
    }

    public boolean isClear() {
        for(CropRow cr : this){
            if(!cr.isEmpty()){
                return false;
            }
        }
        return true;
    }
}

