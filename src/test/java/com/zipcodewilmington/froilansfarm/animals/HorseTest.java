package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class HorseTest {
    @Test
    public  void inheritanceTest(){
        //Given
        //When
        Horse h = new Horse();
        //Then
        Assert.assertTrue(h instanceof Animal);
        Assert.assertTrue(h instanceof Eater);
        Assert.assertTrue(h instanceof NoiseMaker);
        Assert.assertTrue(h instanceof Rideable);
    }

    @Test
    public  void constructorTest(){
        //Given
        String expectedName = "Max";
        //When
        Horse h = new Horse();
        //When
        String actual = h.getName();
        //Then
        Assert.assertEquals(expectedName, actual);
    }
    @Test
    public  void constructorTest1(){
        //Given
        String expectedName = "Ride like the horses";
        //When
        Horse h = new Horse(expectedName);
        //When
        String actual = h.getName();
        //Then
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public  void makeNoiseTest(){
        //Given
        String expected = "Neigh!";
        Horse h = new Horse();
        //When
        String actual = h.makeNoise();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void eatTest(){
        //Given
        int expectedSize = 2;
        Horse h = new Horse();
        //When
        h.eat(new EarOfCorn(), new EarOfCorn());
        //When
        int actualSize = h.getListOfEatenFood().size();
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public  void eatTest1(){
        //Given
        Horse h = new Horse();
        //When
        h.eat(new EarOfCorn(), new EarOfCorn());
        //When
        List<EarOfCorn> actualList = h.getListOfEatenFood();
        //Then
        Assert.assertTrue(actualList.contains(new EarOfCorn()));
    }

    @Test
    public void setNameTest(){
        //Given
        String expected = "Bucking Horse";
        Horse h = new Horse();
        h.setName(expected);
        //When
        String actual = h.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isFullTest(){
        //Given
        boolean expected = false;
        Horse h = new Horse();
        h.eat(new EarOfCorn());
        //When
        boolean actual = h.isFull();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public  void isFullTest1(){
        //Given
        boolean expected = true;
        Horse h = new Horse();
        h.eat(new EarOfCorn());        
        h.eat(new EarOfCorn());
        h.eat(new EarOfCorn());
        //When
        boolean actual = h.isFull();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
