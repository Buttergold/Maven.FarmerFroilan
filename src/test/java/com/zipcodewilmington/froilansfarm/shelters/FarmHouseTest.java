package com.zipcodewilmington.froilansfarm.shelters;

import com.zipcodewilmington.froilansfarm.animals.people.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FarmHouseTest {
    @Test
    public void inheritanceTest(){
        //Given
        //When
        FarmHouse farmHouse = new FarmHouse();
        //Then
        Assert.assertTrue(farmHouse instanceof Shelter);
        Assert.assertTrue(farmHouse instanceof List);
    }

    @Test
    public void constructorTest(){
        //Given
        int expectedSize = 0;
        //When
        FarmHouse farmHouse = new FarmHouse();
        //Then
        Assert.assertEquals(expectedSize, farmHouse.size());
    }

    @Test
    public void addPersonTest(){
        //Given
        Person h = new Person();
        FarmHouse farmHouse = new FarmHouse();
        //When
        farmHouse.add(h);
        //Then
        Assert.assertTrue(farmHouse.contains(h));
    }

    @Test
    public void getPersonTest(){
        //Given
        Person p = new Person();
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(p);
        //When
        Person actual = farmHouse.get(0);
        //Then
        Assert.assertTrue(p.equals(actual));
    }

    @Test
    public void isEmptyTest(){
        //Given
        Person p = new Person();
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(p);
        //When
        //Then
        Assert.assertFalse(farmHouse.isEmpty());
    }
    @Test
    public void isEmptyTest1(){
        //Given
        FarmHouse farmHouse = new FarmHouse();
        //When
        //Then
        Assert.assertTrue(farmHouse.isEmpty());
    }
}
