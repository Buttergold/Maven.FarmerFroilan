package com.zipcodewilmington.froilansfarm.edibles;

public class EdibleEgg extends Edible {

    public EdibleEgg(){
        this(false);
    }

    public EdibleEgg(boolean hasBeenEaten){

        super(hasBeenEaten);
    }
}
