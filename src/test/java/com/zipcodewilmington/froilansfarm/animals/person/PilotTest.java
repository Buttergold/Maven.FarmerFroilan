package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Eater;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    Pilot landa = new Pilot();
    CropDuster duster = new CropDuster();
    Farm farm = new Farm();

    @Test
    public void testInheritance(){

        Assert.assertTrue(landa instanceof Rider);
        Assert.assertTrue(landa instanceof Person);
        Assert.assertTrue(landa instanceof Animal);
        Assert.assertTrue(landa instanceof NoiseMaker);
        Assert.assertTrue(landa instanceof Eater);
    }

    @Test
    public void testMount(){

        Assert.assertNull(duster.getCurrentRider());
        landa.mount(duster);
        Person actual = duster.getCurrentRider();

        Assert.assertEquals(landa, actual);
    }

    @Test
    public void testDismount(){
        landa.mount(dusty);

        Assert.assertEquals(landa, dusty.getCurrentRider());
        landa.dismount(dusty);

        Assert.assertNull(dusty.getCurrentRider());
    }

    @Test
    public void testEat(){
        int expected = 1;
        Assert.assertNull(landa.getListOfFoodEaten());

        landa.eat(new EdibleEgg());
        int actual = landa.getListOfFoodEaten().size;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat2(){
        EarOfCorn corn = new EarOfCorn();

        landa.eat(corn);

        Assert.assertTrue(landa.getListOfFoodEaten().contains(corn));
    }

    @Test
    public void testMakeNoise(){
        String expected = "Weeeeeeeeeeeeeee!!";

        String actual = landa.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFarm(){ //is this needed?
        //given

        //when
        // ??

        //then
        Assert.assertTrue(farm.getMyHouse().contains(froilanda));
    }

    @Test
    public void testUseCropduster(){  //this seems redundant.  similar function on cropduster

    }
}
