package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;

public class FarmVehicle<RiderType extends Rider> {

    boolean isEngineOn;
    RiderType currentDriver;

    public FarmVehicle() {
    }
    public FarmVehicle(RiderType currentDriver, boolean isEngineOn){
        this.currentDriver = currentDriver;
        this.isEngineOn = isEngineOn;
    }

    public void operate(Farm farm){
    }
}
