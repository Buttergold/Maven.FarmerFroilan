package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
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
        } if (earOfCornCtr >= 2 && tomatoCtr >= 1 && edibleEggCtr >= 2)
            return true;


            else{

        
        return false;}
    }

    @Override
    public void mount(CropDuster rideable) {
       rideable.setCurrentRider(this);

    }

    @Override
    public void dismount(CropDuster rideable) {
        rideable.setCurrentRider(null);

    }
}
