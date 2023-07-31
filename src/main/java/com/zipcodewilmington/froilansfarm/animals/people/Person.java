package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.edibles.Edible;

public abstract class Person extends Animal<Edible>{ //does not like <Edible>
    Farm farm;

    public Person() {
        this("", null);
    }

    public Person(String name) {
        this(name, null);
    }

    public Person(Farm farm) {
        this("", farm);
    }

    public Person(String name, Farm farm) {
        super(name);
        this.farm = farm;
    }

    public boolean hasFarm(){
        return this.farm != null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
