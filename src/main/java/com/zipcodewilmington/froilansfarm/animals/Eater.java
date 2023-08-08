package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Edible;

import java.util.List;

public interface Eater<Food extends Edible> {

    void eat(Food... foodToBeEaten);

    List<Food> getListOfFoodEaten();

}
