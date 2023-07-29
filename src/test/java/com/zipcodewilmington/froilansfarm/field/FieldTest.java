package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.animals.people.Botanist;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.field.crops.CornStalk;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;

public class FieldTest {

    @Test
    public void testInheritance(){
        Field field = new Field();

        Assert.assertTrue(field instanceof Collection);
    }

    @Test
    public void testEmpty(){
        Field field = new Field();
        Assert.assertTrue(field.isEmpty());

    }

    @Test
    public void testHasCropRows(){
        Field field = new Field();
        CropRow row = new CropRow();

        field.add(row);

        Assert.assertFalse(field.isEmpty());
    }

    @Test
    public void testHasCrops(){
        Field field = new Field();
        CropRow cr = new CropRow();
        Farmer bob = new Farmer();
        CornStalk cs = new CornStalk();

        field.add(cr);
        bob.plant(cr, cs);

        Assert.assertTrue(field.contains(cs));
    }
}
