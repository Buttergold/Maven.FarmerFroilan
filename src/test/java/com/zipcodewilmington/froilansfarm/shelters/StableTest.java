package com.zipcodewilmington.froilansfarm.shelters;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class StableTest {
    @Test
    public void inheritanceTest(){
        //Given
        //When
        Stable stables = new Stable();
        //Then
        Assert.assertTrue(stables instanceof Shelter);
        Assert.assertTrue(stables instanceof List);
    }

    @Test
    public void constructorTest(){
        //Given
        int expectedSize = 0;
        //When
        Stable stables = new Stable();
        //Then
        Assert.assertEquals(expectedSize, stables.size());
    }

    @Test
    public void addHorseTest(){
        //Given
        Horse h = new Horse();
        Stable stables = new Stable();
        //When
        stables.add(h);
        //Then
        Assert.assertTrue(stables.contains(h));
    }

    @Test
    public void addHorseTest(){
        //Given
        Horse h = new Horse();
        Stable stables = new Stable();
        //When
        stables.add(h);
        //Then
        Assert.assertTrue(stables.contains(h));
    }

    @Test
    public void getHorseTest(){
        //Given
        Horse h = new Horse();
        Stable stables = new Stable();
        stables.add(h);
        //When
        Horse actual = stables.get(0);
        //Then
        Assert.assertTrue(h.equals(actual));
    }

    @Test
    public void getHorseTest(){
        //Given
        Horse h = new Horse();
        Stable stables = new Stable();
        stables.add(h);
        //When
        Horse actual = stables.get(0);
        //Then
        Assert.assertTrue(h.equals(actual));
    }

    @Test
    public void isEmptyTest(){
        //Given
        Horse h = new Horse();
        Stable stables = new Stable();
        stables.add(h);
        //When
        //Then
        Assert.assertFalse(stables.isEmpty());
    }
    @Test
    public void isEmptyTest1(){
        //Given
        Stable stables = new Stable();
        //When
        //Then
        Assert.assertTrue(stables.isEmpty());
    }
}
