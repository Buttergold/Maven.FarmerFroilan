package com.zipcodewilmington.froilansfarm.edibles;
import org.junit.Test;
import org.junit.Assert;

public class EarOfCornTest {

    @Test
    public void testConstructor() {
        EarOfCorn earOfCorn = new EarOfCorn();
        
        Assert.assertNotNull(earOfCorn);
    }

    @Test
    public void testInheritance(){
        EarOfCorn earOfCorn = new EarOfCorn();

        Assert.assertTrue(earOfCorn instanceof Edible);
    }

    @Test
    public void testGetAndSetEaten(){
        boolean expected = true;
        EarOfCorn earOfCorn = new EarOfCorn();

        earOfCorn.setHasBeenEaten(expected);

        boolean actual = earOfCorn.getHasBeenEaten();

        Assert.assertEquals(expected, actual);

    }
    }


