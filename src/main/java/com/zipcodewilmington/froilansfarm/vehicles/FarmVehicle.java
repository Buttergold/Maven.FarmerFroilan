package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;

public abstract class FarmVehicle<RiderType extends Rider> implements Vehicle<RiderType> {
    protected boolean isEngineOn;
    protected RiderType currentDriver;

    public FarmVehicle() {
        this(null, false);
    }
    public FarmVehicle(RiderType currentDriver, boolean isEngineOn){
        this.currentDriver = currentDriver;
        this.isEngineOn = isEngineOn;
    }

    //getters and setters
    public boolean isEngineOn() {
        return isEngineOn;
    }
    public RiderType getCurrentRider() {
        return currentDriver;
    }
    public void setCurrentRider(RiderType currentDriver) {
        this.currentDriver = currentDriver;
    }

    public void startEngine() {
        isEngineOn = true;
    }

    public void turnOffEngine() {
        isEngineOn = false;
    }

    abstract boolean operate(Farm farm);
}
