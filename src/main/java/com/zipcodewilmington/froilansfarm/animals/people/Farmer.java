package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

public class Farmer extends Botanist implements Rider<Tractor> {
    // constructor
    public Farmer() {
        this("default farmer name");
    }
    public Farmer(String name) {
        super(name);
    }

    @Override
    public void mount(Tractor tractor) {
        tractor.setCurrentRider(this);
    }

    @Override
    public void dismount(Tractor tractor) {
        tractor.setCurrentRider(null);
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    void plant(CropRow row, Crop cropToBePlanted) {
        row.add(cropToBePlanted);
    }
}
