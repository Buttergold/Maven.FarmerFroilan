package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import com.zipcodewilmington.froilansfarm.field.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TomatoPlantTest {

    @Test
    public void testInheritance(){
        TomatoPlant tp = new TomatoPlant();

        Assert.assertTrue(tp instanceof Crop);
        Assert.assertTrue(tp instanceof Produce);
    }

    @Test
    public void testHarvested(){
        TomatoPlant tp = new TomatoPlant();
        Assert.assertFalse(tp.hasBeenHarvested());

        tp.setHarvested(true);
        Assert.assertTrue(tp.hasBeenHarvested());

    }

    @Test
    public void testFertilized(){
        TomatoPlant tp = new TomatoPlant();
        Assert.assertFalse(tp.hasBeenFertilized());

        tp.setFertilized(true);

        Assert.assertTrue(tp.hasBeenFertilized());
    }

    @Test
    public void testYield(){
        TomatoPlant tp = new TomatoPlant();

        Edible actual = tp.yield(true);

        Assert.assertNotNull(actual);
        Assert.assertTrue(actual instanceof Tomato);

    }

    @Test
    public void testYieldWithNoParams(){
        TomatoPlant tp = new TomatoPlant();
        tp.setFertilized(true);
        tp.setHarvested(true);

        List<Tomato> actual = tp.yield();

        Assert.assertNotNull(actual);
        Assert.assertFalse(actual.isEmpty());
        Assert.assertEquals(2, actual.size());
    }
    @Test
    public void testYieldWithNoParams1(){
        TomatoPlant tp = new TomatoPlant();
        tp.setFertilized(true);

        List<Tomato> actual = tp.yield();

        Assert.assertNotNull(actual);
        Assert.assertTrue(actual.isEmpty());
    }
    @Test
    public void testYieldWithNoParams2(){
        TomatoPlant tp = new TomatoPlant();
        tp.setHarvested(true);

        List<Tomato> actual = tp.yield();

        Assert.assertNotNull(actual);
        Assert.assertTrue(actual.isEmpty());
    }
    @Test
    public void testYieldWithNoParams3(){
        TomatoPlant tp = new TomatoPlant();

        List<Tomato> actual = tp.yield();

        Assert.assertNotNull(actual);
        Assert.assertTrue(actual.isEmpty());
    }
}
