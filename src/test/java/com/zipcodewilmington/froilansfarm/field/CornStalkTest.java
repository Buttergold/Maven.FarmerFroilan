package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.field.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertFalse(cs.isFertilized());

        cs.setFertilized(true);

        Assert.assertTrue(cs.isFertilized());
    }

    @Test
    public void testHarvested(){
        CornStalk cs = new CornStalk();
        Assert.assertFalse(cs.isHarvested());

        cs.setHarvested(true);

        Assert.assertTrue(cs.isHarvested());
    }

    @Test
    public void testYield(){
        CornStalk cs = new CornStalk();

        Edible actual = cs.yield(true);

        Assert.assertNotNull(actual);
        Assert.assertTrue(actual instanceof EarOfCorn);

    }

}
