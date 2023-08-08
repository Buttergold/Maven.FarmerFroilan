package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.shelters.Shelter;

import java.util.List;

public abstract class Person extends Animal<Edible>{
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
        if(farm != null){
            farm.addAnimalsToShelter(this);
        }
    }

    public Farm getFarm(){ return this.farm;}
    public boolean hasFarm(){
        return this.farm != null;
    }

//    @Override
//    public boolean isFull() {
//        return false;
//    }

    public <ShelterType extends Shelter> void feedAllAnimals(List<ShelterType> shelter){
        for(ShelterType s : shelter){
            for(Object o : s){
                if(o instanceof Animal){
                    Animal a = (Animal) o;
                    while(!a.isFull()) {
                        a.eat(new EarOfCorn());
                    }
                }
            }
        }
    }
}
