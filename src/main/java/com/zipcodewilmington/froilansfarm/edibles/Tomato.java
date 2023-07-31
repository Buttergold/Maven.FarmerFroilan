package com.zipcodewilmington.froilansfarm.edibles;

public class Tomato extends Edible {

    public Tomato(){
        this(false);
    }
    public  Tomato(boolean hasBeenEaten){
        super (hasBeenEaten);
    }
}
