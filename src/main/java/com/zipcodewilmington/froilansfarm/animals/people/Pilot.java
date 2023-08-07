package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;

public class Pilot extends Person implements Rider<CropDuster> {
    // constructor
    public Pilot(){
        this("default pilot name");
    }
    public Pilot(String name){
        super(name);
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public void mount(CropDuster rideable) {

    }

    @Override
    public void dismount(CropDuster rideable) {

    }
}
