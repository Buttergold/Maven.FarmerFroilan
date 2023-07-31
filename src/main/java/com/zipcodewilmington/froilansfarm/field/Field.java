package com.zipcodewilmington.froilansfarm.field;

import java.util.ArrayList;

public class Field extends ArrayList<CropRow> {
    public Field(){
        super();
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

