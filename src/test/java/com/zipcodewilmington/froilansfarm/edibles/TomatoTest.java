package com.zipcodewilmington.froilansfarm.edibles;

import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {

    @Test
    public void testInheritance() {
        Tomato tomato = new Tomato();
        Assert.assertTrue(tomato instanceof Edible);

    }

    @Test
    public void setTomatoTest() {
        Tomato tomato = new Tomato();
        Assert.assertFalse(tomato.getHasBeenEaten());
        boolean expected = true;
        tomato.setHasBeenEaten(expected);
        Assert.assertTrue(tomato.getHasBeenEaten());

//        boolean actual = tomato.getHasBeenEaten();
//        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTomatoTest() {
        Tomato tomato = new Tomato();
        boolean expected = true;
        tomato.setHasBeenEaten(expected);
        boolean actual = tomato.getHasBeenEaten();
        Assert.assertEquals(expected, actual);

        // Instance Variables/Fields are usually PRIVATE and cannot be set directly
        // please try using a getter or setter

//        tomato.getHasBeenEaten = true;
//        boolean actual = tomato.getHasBeen();
//        Assert.assertEquals(expected, actual);
    }
}
