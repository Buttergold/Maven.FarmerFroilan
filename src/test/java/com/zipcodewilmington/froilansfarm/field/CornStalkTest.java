package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.field.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CornStalkTest {

    @Test
    public void testInheritance() {
        CornStalk cs = new CornStalk();

        Assert.assertTrue(cs instanceof Crop);
        Assert.assertTrue(cs instanceof Produce);
    }

    @Test
    public void testFertilized() {
        CornStalk cs = new CornStalk();
        Assert.assertFalse(cs.hasBeenFertilized());

        cs.setFertilized(true);

        Assert.assertTrue(cs.hasBeenFertilized());
    }

    @Test
    public void testHarvested(){
        CornStalk cs = new CornStalk();
        Assert.assertFalse(cs.hasBeenHarvested());

        cs.setHarvested(true);

        Assert.assertTrue(cs.hasBeenHarvested());
    }

    @Test
    public void testYield(){
        CornStalk cs = new CornStalk();

        Edible actual = cs.yield(true);

        Assert.assertNotNull(actual);
        Assert.assertTrue(actual instanceof EarOfCorn);

    }

    @Test
    public void testYieldWithNoParams(){
        CornStalk cs = new CornStalk();
        cs.setFertilized(true);
        cs.setHarvested(true);

        List<EarOfCorn> actual = cs.yield();

        Assert.assertNotNull(actual);
        Assert.assertFalse(actual.isEmpty());
        Assert.assertEquals(3, actual.size());
    }
    @Test
    public void testYieldWithNoParams1(){
        CornStalk cs = new CornStalk();
        cs.setFertilized(true);

        List<EarOfCorn> actual = cs.yield();

        Assert.assertNotNull(actual);
        Assert.assertTrue(actual.isEmpty());
    }
    @Test
    public void testYieldWithNoParams2(){
        CornStalk cs = new CornStalk();
        cs.setHarvested(true);

        List<EarOfCorn> actual = cs.yield();

        Assert.assertNotNull(actual);
        Assert.assertTrue(actual.isEmpty());
    }
    @Test
    public void testYieldWithNoParams3(){
        CornStalk cs = new CornStalk();

        List<EarOfCorn> actual = cs.yield();

        Assert.assertNotNull(actual);
        Assert.assertTrue(actual.isEmpty());
    }
}
