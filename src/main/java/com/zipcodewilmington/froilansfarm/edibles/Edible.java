package com.zipcodewilmington.froilansfarm.edibles;

public abstract class Edible {
    protected boolean hasBeenEaten;

    public Edible(){
        this(false);
    }
    public Edible(boolean hasBeenEaten){
        this.hasBeenEaten = hasBeenEaten;
    }

    public boolean getHasBeenEaten() {return this.hasBeenEaten;}

    public void setHasBeenEaten(boolean hasBeenEaten){
        this.hasBeenEaten = hasBeenEaten;
    }

    @Override
    public boolean equals(Object o){
        Edible e = (Edible) o;
        return this.hasBeenEaten == e.hasBeenEaten;
    }
}
