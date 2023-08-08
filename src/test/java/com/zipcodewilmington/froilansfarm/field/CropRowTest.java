package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.field.crops.CornStalk;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CropRowTest {
    @Test
    public void testInheritance(){
        CropRow cr = new CropRow();
        Assert.assertTrue(cr instanceof Collection);
        Assert.assertTrue(cr instanceof ArrayList);
    }

    @Test
    public void testEmpty(){
        CropRow row = new CropRow();

        Assert.assertTrue(row.isEmpty());
    }

    @Test
    public void testHasCrops(){
        CropRow cr = new CropRow();
        Farmer bob = new Farmer();
        CornStalk cs = new CornStalk();

        Assert.assertFalse(cr.hasCrops());

        cr.add(new CornStalk());
        // Think about what Data Type the CropRow is
        // CropRow extends List<> and probably more specifically an ArrayList
        // what can we do to ArrayLists to add crops?

//        bob.plant(cr, cs);  //Do we specify the croptype or can it be something like <Crop>
//
        Assert.assertFalse(cr.isEmpty());
    }
}
