package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;

public class CropDuster extends FarmVehicle<Pilot> implements Aircraft {
    Pilot currentDriver;
    boolean isEngineOn;

    public CropDuster(){
        this(null, false);
    }
    public CropDuster(Pilot currentDriver, boolean isEngineOn){
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
