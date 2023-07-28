package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import org.junit.Assert;
import org.junit.Test;

public class CropdusterTest {

    @Test
    public void testInheritance(){
        Cropduster cropduster = new Cropduster();

        Assert.assertTrue(cropduster instanceof Aircraft);
        Assert.assertTrue(cropduster instanceof FarmVehicle);
        Assert.assertTrue(cropduster instanceof Vehicle);
        Assert.assertTrue(cropduster instanceof Rideable);
        Assert.assertTrue(cropduster instanceof NoiseMaker);
    }

    @Test
    public void testFertilize(){
        Cropduster duster = new Cropduster();
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
        Cropduster duster = new Cropduster();
        //when
        duster.startEngine();
        //then
        Assert.assertTrue(duster.getIsEngineOn());

        //when
        duster.turnEngineOff();
        Assert.assertFalse(duster.getIsEngineOn());
    }

    @Test
    public void testGetRider(){
        //given
        Cropduster duster = new Cropduster();

    }

    @Test
    public void testMakeNoise(){
        Cropduster duster = new Cropduster();
        String expected = "Vvvvrrrrrrroooooooooooooom";

        String actual = duster.makeNoise();

        Assert.assertEquals(expected, actual);
    }
}
