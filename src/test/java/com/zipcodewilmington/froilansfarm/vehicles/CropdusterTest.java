package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;
import com.zipcodewilmington.froilansfarm.field.CropRow;
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
        row.setHasCrops(true);

        duster.fertilize(row);

        Assert.assertTrue(row.hasBeenFertilized());
    }

    @Test
    public void testFly(){  // How does fly() work??

    }

    @Test
    public void testOperate(){

    }

    @Test
    public void testEngine(){
        //given
        CropDuster duster = new CropDuster();
        //when
        duster.startEngine();
        //then
        Assert.assertTrue(duster.getIsEngineOn());

        //when
        duster.turnEngineOff();
        Assert.assertFalse(duster.getIsEngineOn());
    }

    @Test
    public void testSetRider(){
        //given
        CropDuster duster = new CropDuster();
        Rider pilot = new Pilot();

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
