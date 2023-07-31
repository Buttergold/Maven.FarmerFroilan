package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal<Food extends Edible> implements NoiseMaker, Eater<Food> {
    protected String name;
    protected List<Food> listOfFoodEaten;

    // Constructors
    public Animal() {
        this("");
    }
    public Animal(String name){
        this.name = name;
        this.listOfFoodEaten = new ArrayList<Food>();
    }

    //Getters and Setters just in case
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Food> getListOfFoodEaten() {
        return listOfFoodEaten;
    }
    public void setListOfFoodEaten(List<Food> listOfFoodEaten) {
        this.listOfFoodEaten = listOfFoodEaten;
    }

    public void eat(Food... foodToBeEaten) {
        for(Food f : foodToBeEaten) {
            listOfFoodEaten.add(f);
        }
    }

    public abstract boolean isFull();
}
