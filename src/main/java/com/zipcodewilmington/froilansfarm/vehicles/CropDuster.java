package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;

public class CropDuster extends FarmVehicle<Pilot> implements Aircraft {
    private Pilot currentDriver;
    private boolean isEngineOn ;
    private boolean isInAir ;


    public CropDuster(){
        this(null, false, false);
    }

    public boolean isInAir() {
        return isInAir;
    }

    public void setInAir(boolean inAir) {
        isInAir = inAir;
    }

    @Override
    boolean operate(Farm farm) {
        if (!isInAir || farm.getField().isClear()){return false;}
        for(CropRow cr : farm.getField()){
            fertilize(cr);
        }
        return true;
    }

    public CropDuster(Pilot currentDriver, boolean isEngineOn, boolean isInAir){

        super(currentDriver, isEngineOn);
        this.isInAir = isInAir;
    }

    @Override
    public String makeNoise() {
        return "Vvvvrrrrrrroooooooooooooom";
    }

    @Override
    public void fly() {
        isInAir = true;
    }

    public void fertilize(CropRow row){
        if(row.hasCrops()) {
            row.fertilize();
        }
    }

    @Override
    public void ride() {
        if (currentDriver == null) {
            return;
        }
        if (isEngineOn == false){
            return;
        }
        fly();
        operate(currentDriver.getFarm());
        isInAir = false;
        isEngineOn = false;
    }
}
