package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Eater;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.animals.people.Rider;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.vehicles.Cropduster;
import org.junit.Assert;
import org.junit.Test;

public class PilotTest {

    @Test
    public void testInheritance(){
        Pilot landa = new Pilot();

        Assert.assertTrue(landa instanceof Rider);
        Assert.assertTrue(landa instanceof Person);
        Assert.assertTrue(landa instanceof Animal);
        Assert.assertTrue(landa instanceof NoiseMaker);
        Assert.assertTrue(landa instanceof Eater);
    }

    @Test
    public void testMount(){
        Pilot landa = new Pilot();
        Cropduster duster = new Cropduster();

        Assert.assertNull(duster.getCurrentRider());
        landa.mount(duster);

        Assert.assertTrue(landa, duster.getCurrentRider());
    }

    @Test
    public void testDismount(){
        Pilot landa = new Pilot();
        Cropduster dusty = new Cropduster();
        landa.mount(dusty);

        Assert.assertTrue(landa, dusty.getCurrentRider());
        landa.dismount(dusty);

        Assert.assertNull(dusty.getCurrentRider());
    }

    @Test
    public void testEat(){
        Pilot landa = new Pilot();
        int expected = 1;

        landa.eat(new EdibleEgg());
        int actual = landa.getListOfFoodEaten().size;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat2(){
        Pilot landa = new Pilot();
        EarOfCorn corn = new EarOfCorn();

        landa.eat(corn);

        Assert.assertTrue(landa.getListOfFoodEaten().contains(corn));
    }
}
