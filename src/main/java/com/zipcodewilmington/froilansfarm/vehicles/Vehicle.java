package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.animals.people.Rider;

public interface Vehicle<RiderType extends Rider> {

    public void startEngine();

    public void turnOffEngine();
}
