package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.field.Field;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import com.zipcodewilmington.froilansfarm.shelters.*;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Farm {
    // private variables up here first
    private FarmHouse myHouse;
    private List<Stable> listOfStables;
    private List<ChickenCoop> listOfCoops;
    private List<FarmVehicle> listOfFarmVehicles;
    // IDEA! should this be a regular object array?
    // if the number of vehicles doesn't change on a day to day basis,
    // i don't see why this CAN'T be a regular array
    private HashMap<Edible, Integer> barn;
    private Field theField;

    // biiiig constructor
    public Farm(){
        this(1, 1, 1, 1);
    }
    public Farm(int numOfStables, int numOfChickenCoops, int numOfCropRows, int numOfVehicles){
        listOfStables = new ArrayList<Stable>();
        populate(listOfStables, Stable.class, numOfStables);
        listOfCoops = new ArrayList<ChickenCoop>();
        populate(listOfCoops, ChickenCoop.class, numOfChickenCoops);
        // the field is just a field
        theField = new Field(numOfCropRows);
        // i know setting the initial capacity doesn't do anything tbh
        listOfFarmVehicles = new ArrayList<FarmVehicle>(numOfVehicles);
        myHouse = new FarmHouse();
    }

    private <T extends Shelter> void populate(List<T> listToPopulate, Class<T> shelterClass, int numOfShelter) {
        // basically we use java.reflect packages to make these for us? not sure if this was the best idea though
        // shaky on how it works but it's a factory
        Constructor<?> cons = null;
        try {
            cons = shelterClass.getConstructor();
            for(int i = 0; i < numOfShelter; i++){
                T object = (T) cons.newInstance();
                listToPopulate.add(object);
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

    public FarmHouse getFarmHouse() {
        return myHouse;
    }

    public void setFarmHouse(FarmHouse myHouse) {
        this.myHouse = myHouse;
    }

    public List<Stable> getListOfStables() {
        return listOfStables;
    }

    public void setListOfStables(List<Stable> listOfStables) {
        this.listOfStables = listOfStables;
    }

    public List<ChickenCoop> getListOfCoops() {
        return listOfCoops;
    }

    public void setListOfCoops(List<ChickenCoop> listOfCoops) {
        this.listOfCoops = listOfCoops;
    }

    public List<FarmVehicle> getListOfFarmVehicles() {
        return listOfFarmVehicles;
    }

    public void setListOfFarmVehicles(List<FarmVehicle> listOfFarmVehicles) {
        this.listOfFarmVehicles = listOfFarmVehicles;
    }

    public HashMap<Edible, Integer> getBarn() {
        return barn;
    }

    public void setBarn(HashMap<Edible, Integer> barn) {
        this.barn = barn;
    }

    public Field getField() {
        return theField;
    }

    public void setField(Field theField) {
        this.theField = theField;
    }

    public <T extends Animal> boolean addAnimalsToShelter(T exampleAnimal, int numOfAnimalsToAdd) {
        Constructor<?> cons = null;
        try {
            cons = exampleAnimal.getClass().getConstructor();
            List<? extends Shelter> aminalShelter;
            if(exampleAnimal instanceof Chicken){
                aminalShelter = listOfCoops;
            }
            else if(exampleAnimal instanceof Horse){
                aminalShelter = listOfStables;
            }
            else{
                return false;
            }
            int count = 0;
            for(int i = 0; i < numOfAnimalsToAdd; i++){
                T object = (T) cons.newInstance();
                aminalShelter.get(count++).add(object);
                count = count % aminalShelter.size();
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
        return true;
    }

    public <T extends Animal> void addAnimalsToShelter(T... animalsToAdd) {
        for(T aminal : animalsToAdd){
            if(aminal instanceof Person){
                myHouse.add((Person) aminal);
            }
        }
    }

    public int getTotalNumOfHorses() {
        int total = 0;
        for(Stable s : listOfStables){
            total += s.size();
        }
        return total;
    }

    public int getTotalNumOfChickens() {
        int total = 0;
        for(ChickenCoop cc : listOfCoops){
            total += cc.size();
        }
        return total;
    }

    public int getTotalNumOfPeople() {
        return myHouse.size();
    }

    public void addFarmVehicle(FarmVehicle... farmVehicles) {
        for(FarmVehicle fv : farmVehicles){
            listOfFarmVehicles.add(fv);
        }
    }

    public Tractor getTractor(){
        for(FarmVehicle fv : listOfFarmVehicles){
            if(fv instanceof Tractor){
                return (Tractor) fv;
            }
        }
        return null;
    }

    public CropDuster getCropDuster(){
        for(FarmVehicle fv : listOfFarmVehicles){
            if(fv instanceof CropDuster){
                return (CropDuster) fv;
            }
        }
        return null;
    }
}
