package com.zipcodewilmington.froilansfarm.edibles;

import org.junit.Assert;
import org.junit.Test;

public class EdibleEggTest {

    @Test
    public void testConstructor() {
        EdibleEgg egg = new EdibleEgg();
        Assert.assertNotNull(egg);
    }

    @Test
    public void testInheritance(){
        EdibleEgg egg = new EdibleEgg();
        Assert.assertTrue(egg instanceof Edible);
    }

    @Test
    public void testGetAndSetEaten(){
        boolean expected = true;
        EdibleEgg egg = new EdibleEgg();

        egg.setHasBeenEaten(expected);
        boolean actual = egg.getHasBeenEaten();

        Assert.assertEquals(expected, actual);

    }
}
