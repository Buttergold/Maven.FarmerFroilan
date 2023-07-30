package com.zipcodewilmington.froilansfarm.edibles;

public abstract class Edible {
    protected boolean hasBeenEaten;

    public void Edible(){

    }
    public void Edible(boolean hasBeenEaten){
        this.hasBeenEaten = hasBeenEaten;
    }

    public boolean getHasBeenEaten() {return this.hasBeenEaten;}

    public void setHasBeenEaten(boolean hasBeenEaten){
        this.hasBeenEaten = hasBeenEaten;
    }

}
