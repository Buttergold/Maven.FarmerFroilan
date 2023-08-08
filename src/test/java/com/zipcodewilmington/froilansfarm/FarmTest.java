package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.shelters.ChickenCoop;
import com.zipcodewilmington.froilansfarm.shelters.Stable;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.FarmVehicle;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;
import com.zipcodewilmington.froilansfarm.animals.*;

public class FarmTest {
    @Test
    public void constructorTest() {
        //Given
        int expectedSize = 1;
        //When
        // should be stables, coops, croprows, vehicles
        Farm thefarm = new Farm(1, 1, 1, 1);
        //Then
        Assert.assertEquals(expectedSize, thefarm.getListOfStables().size());
        Assert.assertEquals(expectedSize, thefarm.getListOfCoops().size());
        Assert.assertEquals(expectedSize, thefarm.getField().size());
        Assert.assertEquals(0, thefarm.getListOfFarmVehicles().size());
    }

    @Test
    public void addHorsesToShelterTest() {
        //Given
        int expected = 5;
        Farm thefarm = new Farm(3, 3, 1, 1);
        //When
        thefarm.addAnimalsToShelter(new Horse(), expected);
        //Then
        Assert.assertEquals(expected, thefarm.getTotalNumOfHorses());
        for (Stable s : thefarm.getListOfStables()) {
            // the shelters aren't empty
            Assert.assertFalse(s.isEmpty());
        }
    }

    @Test
    public void addChickensToShelterTest() {
        //Given
        int expected = 5;
        Farm thefarm = new Farm(3, 3, 1, 1);
        //When
        thefarm.addAnimalsToShelter(new Chicken(), 5);
        //Then
        Assert.assertEquals(expected, thefarm.getTotalNumOfChickens());
        for (ChickenCoop cc : thefarm.getListOfCoops()) {
            // the coops aren't empty
            Assert.assertFalse(cc.isEmpty());
        }
    }

    @Test
    public void addPeopleToShelterTest() {
        //Given
        int expected = 3;
        Farm thefarm = new Farm(3, 3, 1, 1);
        //When
        thefarm.addAnimalsToShelter(new Farmer(), new Farmer(), new Pilot());
        //Then
        Assert.assertEquals(expected, thefarm.getTotalNumOfPeople());
        Assert.assertFalse(thefarm.getFarmHouse().isEmpty());
    }

    @Test
    public void addFarmVehicleTest() {
        //Given
        int expected = 2;
        Farm thefarm = new Farm(3, 3, 1, expected);
        Tractor t = new Tractor();
        CropDuster c = new CropDuster();
        //When
        thefarm.addFarmVehicle(t, c);
        //Then
        Assert.assertTrue(thefarm.getListOfFarmVehicles().contains(t));
        Assert.assertTrue(thefarm.getListOfFarmVehicles().contains(c));
    }

    @Test
    public void getTractorTest(){
        //Given
        Farm thefarm = new Farm(3, 3, 1, 2);
        Tractor t = new Tractor();
        CropDuster c = new CropDuster();
        thefarm.addFarmVehicle(t, c);
        //When
        FarmVehicle actual = thefarm.getTractor();
        //Then
        Assert.assertEquals(true, actual instanceof Tractor);
    }

    @Test
    public void getCropDusterTest(){
        //Given
        Farm thefarm = new Farm(3, 3, 1, 2);
        Tractor t = new Tractor();
        CropDuster c = new CropDuster();
        thefarm.addFarmVehicle(t, c);
        //When
        FarmVehicle actual = thefarm.getCropDuster();
        //Then
        Assert.assertEquals(true, actual instanceof CropDuster);
    }
}