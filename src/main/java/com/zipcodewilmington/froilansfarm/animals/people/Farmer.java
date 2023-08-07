package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
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
        return "E I E I O";
    }

    public <CropType extends Crop<Edible>> void plant(CropRow<CropType> row, CropType cropToBePlanted) {
        for(int i = 0; i < row.getNumOfCrops(); i++) {
            row.add(cropToBePlanted);
        }
    }
}
