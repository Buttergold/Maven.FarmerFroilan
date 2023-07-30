package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.people.Rider;

public interface Rideable <RiderType extends Rider> {


    public void ride();
}
