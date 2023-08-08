package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;

public class Pilot extends Person implements Rider<CropDuster> {
    
    public String tomato; 
    public String edibleEgg;
    public String earOfCorn;

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
            if (this.listOfFoodEaten.get(i).equals("earOfCorn")) {
                earOfCornCtr++;
            }
            if (this.listOfFoodEaten.get(i).equals("tomato")) {
                tomatoCtr++;
            }
            if (this.listOfFoodEaten.get(i).equals("egg")) {
                edibleEggCtr++;
            }
        } if (earOfCornCtr >= 2 && tomatoCtr >= 1 && edibleEggCtr >= 2)
            return true;


            else{

        
        return false;}
    }

    @Override
    public void mount(CropDuster rideable) {

    }

    @Override
    public void dismount(CropDuster rideable) {

    }
}
