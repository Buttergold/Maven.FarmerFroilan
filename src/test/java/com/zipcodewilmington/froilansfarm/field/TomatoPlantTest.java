package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import com.zipcodewilmington.froilansfarm.field.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertFalse(tp.isHarvested());

        tp.setHarvested(true);
        Assert.assertTrue(tp.isHarvested());

    }

    @Test
    public void testFertilized(){
        TomatoPlant tp = new TomatoPlant();
        Assert.assertFalse(tp.isFertilized());

        tp.setFertilized(true);

        Assert.assertTrue(tp.isFertilized());
    }

    @Test
    public void testYield(){
        TomatoPlant tp = new TomatoPlant();

        Edible actual = tp.yield(true);

        Assert.assertNotNull(actual);
        Assert.assertTrue(actual instanceof Tomato);

    }
}
