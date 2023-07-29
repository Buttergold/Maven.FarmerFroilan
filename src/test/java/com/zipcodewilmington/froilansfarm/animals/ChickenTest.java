package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest {
    @Test
    public void inheritanceTest(){
        //Given
        //When
        Chicken c = new Chicken();
        //Then
        Assert.assertTrue(c instanceof Animal);
        Assert.assertTrue(c instanceof Eater);
        Assert.assertTrue(c instanceof NoiseMaker);
        Assert.assertTrue(c instanceof Produce);
    }

    @Test
    public void constructorTest(){
        //Given
        String expectedName = "BOB";
        //When
        Chicken c = new Chicken();
        //When
        String actual = c.getName();
        //Then
        Assert.assertEquals(expectedName, actual);
    }
    @Test
    public void constructorTest1(){
        //Given
        String expectedName = "Look at ALL THOSE CHICKENSSSS";
        //When
        Chicken c = new Chicken(expectedName);
        //When
        String actual = c.getName();
        //Then
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void makeNoiseTest(){
        //Given
        String expected = "Bok BAWK!";
        Chicken c = new Chicken();
        //When
        String actual = c.makeNoise();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        //Given
        int expectedSize = 2;
        Chicken c = new Chicken();
        //When
        c.eat(new EarOfCorn(), new EarOfCorn());
        //When
        int actualSize = c.getListOfEatenFood().size();
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }
    @Test
    public void eatTest1(){
        //Given
        Chicken c = new Chicken();
        //When
        c.eat(new EarOfCorn(), new EarOfCorn());
        //When
        List<EarOfCorn> actualList = c.getListOfEatenFood();
        //Then
        Assert.assertTrue(actualList.contains(new EarOfCorn()));
    }

    @Test
    public void yieldTest(){
        //Given
        Chicken c = new Chicken();
        //When
        Edible actual = c.yield(false);
        //Then
        Assert.assertNull(actual);
    }
    @Test
    public void yieldTest1(){
        //Given
        Chicken c = new Chicken();
        //When
        Edible actual = c.yield(true);
        //Then
        Assert.assertNotNull(actual);
        Assert.assertTrue(actual instanceof EdibleEgg);
    }

    @Test
    public void hasBeenFertilizedTest(){
        //Given
        Chicken c = new Chicken();
        //When
        boolean actual = c.hasBeenFertilized();
        //Then
        Assert.assertFalse(actual);
    }
    @Test
    public void hasBeenFertilizedTest1(){
        //Given
        Chicken c = new Chicken();
        c.setFertilized(true);
        //When
        boolean actual = c.hasBeenFertilized(true);
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void setNameTest(){
        //Given
        String expected = "FRIED CHICKEN";
        Chicken c = new Chicken();
        c.setName(expected);
        //When
        String actual = c.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isFullTest(){
        //Given
        boolean expected = false;
        Chicken c = new Chicken();
        //When
        boolean actual = c.isFull();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void isFullTest1(){
        //Given
        boolean expected = true;
        Chicken c = new Chicken();
        c.eat(new EarOfCorn());
        //When
        boolean actual = c.isFull();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
