//package com.zipcodewilmington.froilansfarm.field;
//
//import com.zipcodewilmington.froilansfarm.animals.people.Botanist;
//import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
//import com.zipcodewilmington.froilansfarm.field.crops.CornStalk;
//import com.zipcodewilmington.froilansfarm.field.crops.Crop;
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.Collection;
//
//public class CropRowTest {
//
//    @Test
//    public void testInheritance(){
//        CropRow cr = new CropRow();
//        Assert.assertTrue(cr instanceof Collection);
//    }
//
//    @Test
//    public void testEmpty(){
//        CropRow row = new CropRow();
//
//        Assert.assertTrue(row.isEmpty());
//    }
//
//    @Test
//    public void testHasCrops(){
//        CropRow cr = new CropRow();
//        Farmer bob = new Farmer();
//        CornStalk cs = new CornStalk();
//
//        bob.plant(cr, cs);  //Do we specify the croptype or can it be something like <Crop>
//
//        Assert.assertFalse(cr.isEmpty());
//    }
//}
