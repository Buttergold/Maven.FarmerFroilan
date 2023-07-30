package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {

    public Rider currentRider() {
        return null;
    }

    public boolean hasBeenRidenToday() {
        return false;
    }

}
