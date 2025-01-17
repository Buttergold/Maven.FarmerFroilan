package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;

public class Pilot extends Person implements Rider<Rideable> {
    // constructor
    public Pilot(){
        this("default pilot name");
    }
    public Pilot(String name){
        this(name, null);
    }
    public Pilot(String name, Farm farm){
        super(name, farm);
    }


    @Override
    public String makeNoise() {
        return "Weeeeeeeeeeeeeee!!";
    }

    @Override
    public boolean isFull(){
        int earOfCornCtr = 0;
        int tomatoCtr = 0;
        int edibleEggCtr = 0;
        for (int i = 0; i <this.listOfFoodEaten.size(); i++) {
            if (this.listOfFoodEaten.get(i) instanceof EarOfCorn) {
                earOfCornCtr++;
            }
            if (this.listOfFoodEaten.get(i) instanceof Tomato) {
                tomatoCtr++;
            }
            if (this.listOfFoodEaten.get(i) instanceof EdibleEgg) {
                edibleEggCtr++;
            }
        } if (earOfCornCtr >= 2 && tomatoCtr >= 1 && edibleEggCtr >= 2) {
            return true;
        }
        else{
            return false;
        }
    }

//    @Override
//    public void mount(CropDuster rideable) {
//       rideable.setCurrentRider(this);
//    }
//    public void mount(Horse rideable) {
//        rideable.setCurrentRider(this);
//    }
//
//    @Override
//    public void dismount(CropDuster rideable) {
//        rideable.setCurrentRider(null);
//    }
//    public void dismount(Horse rideable) {
//        rideable.setCurrentRider(null);
//    }

    @Override
    public void mount(Rideable rideable) {
        rideable.setCurrentRider(this);
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.setCurrentRider(null);
    }
}
