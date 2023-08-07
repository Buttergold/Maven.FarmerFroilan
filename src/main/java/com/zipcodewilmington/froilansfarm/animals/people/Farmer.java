package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
}
