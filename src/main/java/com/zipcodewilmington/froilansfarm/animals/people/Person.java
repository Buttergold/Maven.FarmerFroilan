package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.edibles.Edible;

public class Person extends Animal<Edible> { //does not like <Edible>
    Farm farm;

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
