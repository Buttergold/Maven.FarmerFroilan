package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.Rideable;

public interface Rider<RideableType extends Rideable> {
    void mount(RideableType);
    void dismount(RideableType);
}
