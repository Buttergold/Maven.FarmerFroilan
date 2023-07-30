package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.shelters.ChickenCoop;
import com.zipcodewilmington.froilansfarm.shelters.Stable;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;
import com.zipcodewilmington.froilansfarm.animals.*;

class FarmTest {
    @Test
    public void constructorTest() {
        //Given
        String expectedSize = 1;
        //When
        // should be stables, coops, croprows, vehicles
        Farm thefarm = new Farm(1, 1, 1, 1);
        //Then
        Assert.assertEquals(expectedSize, thefarm.getListOfStables().size());
        Assert.assertEquals(expectedSize, thefarm.getListOfCoops().size());
        Assert.assertEquals(expectedSize, thefarm.getField().size());
        Assert.assertEquals(expectedSize, thefarm.getListOfVehicles().size());
    }

    @Test
    public void addHorsesToShelterTest() {
        //Given
        int expected = 5;
        Farm thefarm = new Farm(3, 3, 1, 1);
        //When
        thefarm.addAnimalsToShelter(Horse.class, expected);
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
        thefarm.addAnimalsToShelter(Chicken.class, 5);
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
        int expected = 5;
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
}