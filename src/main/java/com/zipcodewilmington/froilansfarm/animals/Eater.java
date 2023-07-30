package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.edibles.Edible;

import java.util.List;

public interface Eater<Food extends Edible> {

    public void eat(Edible...);


    public List<Food> (getListOfFoodEaten());

}
