package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;

public class Horse extends Animal<EarOfCorn> implements Rideable<Rider> {

    public Horse() {
        this("Max");
    }

    public Horse(String name) {
        super(name);
    }

    public Rider currentRider() {
        return null;
    }

    public boolean hasBeenRidenToday() {
        return false;
    }

    public String makeNoise() {
        return null;
    }

    public void ride() {

    }

    @Override
    public Rider getCurrentRider() {
        return null;
    }

    @Override
    public void setCurrentRider(Rider rider) {

    }

    public void eat() {

    }

    @Override
    public boolean isFull() {
        return false;
    }
}
