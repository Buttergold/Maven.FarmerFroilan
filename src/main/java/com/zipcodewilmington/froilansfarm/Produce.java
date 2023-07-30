package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edibles.Edible;

public interface Produce<Food extends Edible> {

    public Food yield (boolean hasBeenFertilized);

    public Boolean hasBeenFertilized();
}
