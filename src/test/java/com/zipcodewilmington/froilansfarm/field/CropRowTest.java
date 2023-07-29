package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.animals.people.Botanist;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class CropRowTest {

    @Test
    public void testInheritance(){
        CropRow cr = new CropRow();
        Assert.assertTrue(cr instanceof Collection);
    }

    @Test
    public void testHasCrops(){
        CropRow cr = new CropRow();
        Botanist bob = new Farmer();

        bob.plant(cr, Corn);  //how do we specify?

        Assert.assertTrue(cr.hasCrops());
    }
}
