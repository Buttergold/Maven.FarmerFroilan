package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.shelters.Stable;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class Farmer extends Botanist implements Rider<Tractor> {
    // constructor
    public Farmer() {
        this("default farmer name");
    }
    public Farmer(String name) {
        this(name, null);
    }
    public Farmer(String name, Farm farm) {
        super(name, farm);
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

    public <CropType extends Crop> void plant(CropRow<CropType> row, CropType cropToBePlanted) {
        try {
            Constructor<?> cons = cropToBePlanted.getClass().getConstructor();

            for(int i = 0; i < row.getNumOfCrops(); i++) {
                CropType ct = (CropType) cons.newInstance();
                row.add(cropToBePlanted);
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public <RiderType extends Rider> void rideAllHorses(List<Stable> stables, RiderType other){
        for(Stable s : stables){
//            for(Horse h : s){
//                if(!h.hasBeenRiddenToday()){
//                    // horse hasn't been ridden, so go ride
//                    other.mount(h);
//                    h.ride();
//                    other.dismount(h);
//                }
//            }
        }
    }

    @Override
    public boolean isFull(){
        int corn = 0;
        int tomato = 0;
        int egg = 0;
        List<Edible> foods = getListOfFoodEaten();
        for(Edible f : foods){
            if(f instanceof EarOfCorn){
                corn++;
            }
            else if(f instanceof Tomato){
                tomato++;
            }
            else if(f instanceof EdibleEgg){
                egg++;
            }
        }

        return corn >= 1 && tomato >= 2 && egg >= 5;
    }
}
