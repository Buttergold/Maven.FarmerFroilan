package com.zipcodewilmington.froilansfarm.shelters;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ChickenCoopTest {
    @Test
    public void inheritanceTest(){
        //Given
        //When
        ChickenCoop coops = new ChickenCoop();
        //Then
        Assert.assertTrue(coops instanceof Shelter);
        Assert.assertTrue(coops instanceof List);
    }

    @Test
    public void constructorTest(){
        //Given
        int expectedSize = 0;
        //When
        ChickenCoop coops = new ChickenCoop();
        //Then
        Assert.assertEquals(expectedSize, coops.size());
    }

    @Test
    public void addChickenTest(){
        //Given
        Chicken c = new Chicken();
        ChickenCoop coops = new ChickenCoop();
        //When
        coops.add(c);
        //Then
        Assert.assertTrue(coops.contains(c));
    }

    @Test
    public void getChickenTest(){
        //Given
        Chicken c = new Chicken();
        ChickenCoop coops = new ChickenCoop();
        coops.add(c);
        //When
        Chicken actual = coops.get(0);
        //Then
        Assert.assertTrue(c.equals(actual));
    }

    @Test
    public void isEmptyTest(){
        //Given
        Chicken c = new Chicken();
        ChickenCoop coops = new ChickenCoop();
        coops.add(c);
        //When
        //Then
        Assert.assertFalse(coops.isEmpty());
    }
    @Test
    public void isEmptyTest1(){
        //Given
        ChickenCoop coops = new ChickenCoop();
        //When
        //Then
        Assert.assertTrue(coops.isEmpty());
    }
}
