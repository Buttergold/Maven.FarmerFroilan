package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.field.crops.TomatoPlant;
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
    public void testIsClear(){
        Field field = new Field();
        Assert.assertTrue(field.isClear());

    }

    @Test
    public void testHasCropRows(){  //not a good test
        Field field = new Field(5);
        CropRow row = new CropRow(5);

        field.add(row);

        Assert.assertFalse(field.isEmpty());
    }

    @Test
    public void testHasCrops(){
        Field field = new Field(1);
        Assert.assertTrue(field.isClear());

        field.get(0).add(new TomatoPlant());
        Assert.assertFalse(field.isClear());

    }
}
