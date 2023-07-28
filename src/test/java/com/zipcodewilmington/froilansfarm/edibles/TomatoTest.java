package com.zipcodewilmington.froilansfarm.edibles;

import org.junit.Assert;

public class TomatoTest {

    public void InheritanceTest(){
        Tomato tomato = new Tomato();
        Assert.assertTrue(tomato instanceof edible);

    }

    public void getTomatoTest(){
        Tomato tomato = new Tomato();
        boolean expected = true;
        tomato.getHasBeenEaten = true;
       boolean actual = tomato.getHasBeen();
        Assert.assertEquals(expected, actual);
    }

    public void setTomatoTest(){
        Tomato tomato = new Tomato();
        boolean expected = true;
        tomato.setHasBeenEaten(expected);
        boolean actual = tomato.getHasBeenEaten();
        Assert.assertEquals(expected, actual);
    }
}
