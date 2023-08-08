package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CropdusterTest {

    @Test
    public void testInheritance(){
        CropDuster cropduster = new CropDuster();

        Assert.assertTrue(cropduster instanceof Aircraft);
        Assert.assertTrue(cropduster instanceof FarmVehicle);
        Assert.assertTrue(cropduster instanceof Vehicle);
        Assert.assertTrue(cropduster instanceof Rideable);
        Assert.assertTrue(cropduster instanceof NoiseMaker);
    }

    @Test
    public void testFertilize(){
        CropDuster duster = new CropDuster();
        CropRow row = new CropRow();
        System.out.println(row.hasCrops());
        row.add(new CornStalk());
        System.out.println(row.hasCrops());

        duster.fertilize(row);

        Assert.assertTrue(row.hasBeenFertilized());
    }

    @Test
    public void testFly(){
        CropDuster duster = new CropDuster();
        Assert.assertFalse(duster.isInAir());
        duster.fly();

        Assert.assertTrue(duster.isInAir());
    }

    @Test
    public void testOperate(){

        Pilot froilanda = new Pilot("Froilanda");
        CropDuster duster = new CropDuster();


    }

    @Test
    public void testEngine(){
        //given
        CropDuster duster = new CropDuster();
        //when
        duster.startEngine();
        //then
        Assert.assertTrue(duster.isEngineOn());

        //when
        duster.turnOffEngine();
        Assert.assertFalse(duster.isEngineOn());
    }

    @Test
    public void testSetRider(){
        //given
        CropDuster duster = new CropDuster();
        Pilot pilot = new Pilot();

        duster.setCurrentRider(pilot);

        Rider actual = duster.getCurrentRider();

        Assert.assertEquals(pilot, actual);

    }

    @Test
    public void testMakeNoise(){
        CropDuster duster = new CropDuster();
        String expected = "Vvvvrrrrrrroooooooooooooom";

        String actual = duster.makeNoise();

        Assert.assertEquals(expected, actual);
    }
}
