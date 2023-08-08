package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;

public class Horse extends Animal<EarOfCorn> implements Rideable<Rider> {
    private Rider currentRider;
    private boolean hasBeenRiddenToday;

    public Horse() {
        this("Max");
    }
    public Horse(String name) {
        super(name);
        currentRider = null;
        hasBeenRiddenToday = false;
    }

    @Override
    public void setCurrentRider(Rider rider) {
        currentRider = rider;
    }
    @Override
    public Rider getCurrentRider() {
        return currentRider;
    }

    public boolean hasBeenRiddenToday() {
        return hasBeenRiddenToday;
    }
    public void resetRiddenToday(){
        this.hasBeenRiddenToday = false;
    }

    public String makeNoise() {
        return "Neigh!";
    }

    public void ride() {
        hasBeenRiddenToday = true;
        // not sure what else to have here
    }

    @Override
    public void eat(EarOfCorn... horseFeed) {
        super.eat(horseFeed);
    }

    @Override
    public boolean isFull() {
        int count = 0;
        for(EarOfCorn feed : listOfFoodEaten){
            count++;
        }
        return count >= 3;
    }
}
