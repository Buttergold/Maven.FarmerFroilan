package com.zipcodewilmington.froilansfarm.shelters;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;

import java.util.List;

public class ChickenCoop extends Shelter<Chicken> {

    public boolean hasEggs(){
        return false;
    }

    public List<EdibleEgg> collectEggs(){
        return null;
    }
}
