package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.field.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TractorTest {
    @Test
    public void inheritanceTest(){
        //Given
        //When
        Tractor t = new Tractor();
        //Then
        Assert.assertTrue(t instanceof Vehicle);
        Assert.assertTrue(t instanceof NoiseMaker);
        Assert.assertTrue(t instanceof FarmVehicle);
        Assert.assertTrue(t instanceof Rideable);
    }

    @Test
    public void constructorTest(){
        //Given
        //When
        Tractor t = new Tractor();
        //Then
        Assert.assertNull(t.getCurrentRider());
        Assert.assertFalse(t.isEngineOn());
    }

    @Test
    public void setCurrentRiderTest(){
        //Given
        Rider r = new Farmer();
        Tractor t = new Tractor();
        //When
        t.setCurrentRider(r);
        //Then
        Assert.assertTrue(r.equals(t.getCurrentRider()));
    }

    @Test
    public void harvestCornTest(){
        //Given
        CropRow<CornStalk> thisRow = new CropRow<>();
        thisRow.setFertilized(true);
        Tractor t = new Tractor();
        // DO I NEED TO SET THE DRIVER/STATE OF THE CAR?
        //When
        List<Edible> thingsReturned = t.harvest(thisRow);
        //Then
        for(Edible e : thingsReturned){
            Assert.assertTrue(e instanceof EarOfCorn);
        }
    }

    @Test
    public void harvestTomatoTest(){
        //Given
        CropRow<TomatoPlant> thisRow = new CropRow<>();
        thisRow.setFertilized(true);
        Tractor t = new Tractor();
        // DO I NEED TO SET THE DRIVER/STATE OF THE CAR?
        //When
        List<Edible> thingsReturned = t.harvest(thisRow);
        //Then
        for(Edible e : thingsReturned){
            Assert.assertTrue(e instanceof Tomato);
        }
    }

    @Test
    public void clearRowTest(){
        //Given
        CropRow<TomatoPlant> thisRow = new CropRow<>();
        Tractor t = new Tractor();
        //When
        t.clearRow(thisRow);
        //Then
        Assert.assertTrue(thisRow.isEmpty());
    }
}
