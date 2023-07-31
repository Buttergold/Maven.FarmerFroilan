package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;

public interface Vehicle<RiderType extends Rider> extends NoiseMaker, Rideable<RiderType> {

    public void startEngine();

    public void turnOffEngine();
}
