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
import java.util.ArrayList;
import java.util.List;

public class Farmer extends Botanist implements Rider<Rideable> {
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

//    @Override
//    public void mount(Tractor tractor) {
//        tractor.setCurrentRider(this);
//    }
//    public void mount(Horse rideable){
//        rideable.setCurrentRider(this);
//    }
//
//    @Override
//    public void dismount(Tractor tractor) {
//        tractor.setCurrentRider(null);
//    }
//    public void dismount(Horse rideable){
//        rideable.setCurrentRider(null);
//    }

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
        List<Horse> allHorses = new ArrayList<Horse>();
        for(Stable s : stables){
            allHorses.addAll(s);
        }
        // now that we have all the horses, split them between you and other
        for(int i = 0; i < allHorses.size(); i += 2){
            // getting a runtime exception where we can't ride a horse because pilots can't ride horses for some reason
            System.out.println(allHorses.get(i));
            other.mount(allHorses.get(i));
            allHorses.get(i).ride();
            other.dismount(allHorses.get(i));
            // do the same for farmer
            // getting into the exception where Farmer cannot ride a horse???
            this.mount(allHorses.get(i + 1));
            allHorses.get(i + 1).ride();
            this.dismount(allHorses.get(i + 1));
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

    @Override
    public void mount(Rideable rideable) {
        rideable.setCurrentRider(this);
    }

    @Override
    public void dismount(Rideable rideable) {
        rideable.setCurrentRider(null);
    }
}
