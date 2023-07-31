package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;

public class Chicken extends Animal<EarOfCorn> implements Produce<EdibleEgg> {
    // putting this here just in case
    private final double FERTILIZATION_RATE = 0.13;
    private boolean hasBeenFertilized;

    // Constructors
    public Chicken(){
        this("BOB");
    }
    public Chicken(String name){
        super.name = name;
        this.hasBeenFertilized = false;
    }

    public String makeNoise() {
        return "Bok BAWK!";
    }

    public EdibleEgg yield(boolean hasBeenFertilized) {
        return null;
    }

    public Boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }
    // not sure if i need this setter but there's a test for it so i'll put this in
    public void setFertilized(boolean hasBeenFertilized){
        this.hasBeenFertilized = hasBeenFertilized;
    }

    @Override
    public void eat(EarOfCorn... chickenFeed) {
        super.eat(chickenFeed);
    }

    public boolean isFull() {
        return false;
    }
}
