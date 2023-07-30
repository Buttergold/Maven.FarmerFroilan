package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;

public class CropDuster extends FarmVehicle implements Aircraft {
    Pilot currentDriver;
    boolean isEngineOn;
    public CropDuster(Rider currentDriver, boolean isEngineOn){
        super(currentDriver, isEngineOn);
    }
    @Override
    public void fly() {

    }

    @Override
    public void startEngine() {

    }

    @Override
    public void turnOffEngine() {

    }
}
