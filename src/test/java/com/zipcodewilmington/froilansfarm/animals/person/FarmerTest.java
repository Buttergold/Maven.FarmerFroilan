package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Eater;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.animals.people.Botanist;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.shelters.Stable;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class FarmerTest {
    // HI! Note to the person who wrote this code:
    // I personally feel like this is pretty bad practice to have local variables
    // Why? Tests are run independently and not necessarily in the order that you have written them in this file.
    // If you want to set up variables that all Tests will use, look into the @Before tag
    // Setting local variables up means that you're going to be constantly changing the state of these variables,
    // and as such it's quite difficult to keep track of their exact state.
    Farm farm = new Farm();
    Farmer froilan = new Farmer();
    Tractor tractor = new Tractor();


    @Test
    public void testInheritance() {
        Assert.assertTrue(froilan instanceof Botanist);
        Assert.assertTrue(froilan instanceof Person);
        Assert.assertTrue(froilan instanceof Animal);
        Assert.assertTrue(froilan instanceof NoiseMaker);
        Assert.assertTrue(froilan instanceof Eater);
    }

    @Test
    public void testMount() {
        Assert.assertNull(tractor.getCurrentRider());
        froilan.mount(tractor);
        Person actual = tractor.getCurrentRider();

        Assert.assertEquals(froilan, actual);
    }

    @Test
    public void testDismount() {
        froilan.mount(tractor);

        Assert.assertEquals(froilan, tractor.getCurrentRider());
        froilan.dismount(tractor);

        Assert.assertNull(tractor.getCurrentRider());
    }

    @Test
    public void testEat() {
        int expected = 1;
        Assert.assertNull(froilan.getListOfFoodEaten());

        froilan.eat(new Tomato());
        int actual = froilan.getListOfFoodEaten().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise(){
        String expected = "E I E I O";
        String actual = froilan.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFeedAllAnimals(){
        Horse horse = new Horse();
        Stable stable = new Stable();
        farm.addAnimalsToShelter(horse);

//        froilan.feedAllAnimals(horse, corn); // how will this method work?
        // good question: figure out how you want it to work
        // will we feed the animals a set amount based on what type of animal it is
        // maybe once that's done we can get all the horses on the barn and see if they're full
        // there are many options - we can even not test this since it's more relevant to
        // simulating the work week

        Assert.assertNotNull(horse.getListOfFoodEaten());

    }


}
