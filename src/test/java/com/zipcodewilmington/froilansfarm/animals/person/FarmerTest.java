package com.zipcodewilmington.froilansfarm.animals.person;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Eater;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.animals.people.Botanist;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.field.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.shelters.Stable;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;

public class FarmerTest {

    @Test
    public void testInheritance() {
        Farmer froilan = new Farmer();

        Assert.assertTrue(froilan instanceof Botanist);
        Assert.assertTrue(froilan instanceof Person);
        Assert.assertTrue(froilan instanceof Animal);
        Assert.assertTrue(froilan instanceof NoiseMaker);
        Assert.assertTrue(froilan instanceof Eater);
    }

    @Test
    public void testMount() {
        Farmer froilan = new Farmer();
        Tractor tractor = new Tractor();

        Assert.assertNull(tractor.getCurrentRider());
        froilan.mount(tractor);
        Person actual = tractor.getCurrentRider();

        Assert.assertEquals(froilan, actual);
    }

    @Test
    public void testDismount() {
        Farmer froilan = new Farmer();
        Tractor tractor = new Tractor();
        froilan.mount(tractor);

        Assert.assertEquals(froilan, tractor.getCurrentRider());
        froilan.dismount(tractor);

        Assert.assertNull(tractor.getCurrentRider());
    }

    @Test
    public void testEat() {
        Farmer froilan = new Farmer();
        int expected = 1;
        Assert.assertTrue(froilan.getListOfFoodEaten().isEmpty());

        froilan.eat(new Tomato());
        int actual = froilan.getListOfFoodEaten().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMakeNoise(){
        Farmer froilan = new Farmer();
        String expected = "E I E I O";
        String actual = froilan.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFeedAllHorses(){
        // good question: figure out how you want it to work
        // will we feed the animals a set amount based on what type of animal it is
        // maybe once that's done we can get all the horses on the barn and see if they're full
        // there are many options - we can even not test this since it's more relevant to
        // simulating the work week
        // Given
        Farmer froilan = new Farmer();
        Stable theStable = new Stable();
        theStable.add(new Horse());
        ArrayList<Stable> theStablesPlural = new ArrayList<Stable>();
        theStablesPlural.add(theStable);
        // When
        froilan.feedAllAnimals(theStablesPlural);
        // Then
        Assert.assertEquals(true, theStable.get(0).isFull());
    }

    @Test
    public void plantTomatoesTest(){
        //Given
        Farmer froilan = new Farmer();
        CropRow<TomatoPlant> row = new CropRow<TomatoPlant>();
        //When
        froilan.plant(row, new TomatoPlant());
        //Then
        row.hasCrops();
    }

    @Test
    public void plantCornTest(){
        //Given
        Farmer froilan = new Farmer();
        CropRow<CornStalk> row = new CropRow<CornStalk>();
        //When
        froilan.plant(row, new CornStalk());
        //Then
        row.hasCrops();
    }

    @Test
    public void isNotFullTest(){
        //Given
        Farmer froilan = new Farmer();
        froilan.eat(new EarOfCorn(), new Tomato(), new EdibleEgg());
        //When
        boolean actual = froilan.isFull();
        //Then
        Assert.assertEquals(false, actual);
    }
    @Test
    public void isFullTest(){
        //Given
        Farmer froilan = new Farmer();
        froilan.eat(new EarOfCorn(), new Tomato(), new EdibleEgg(), new Tomato(), new EdibleEgg());
        froilan.eat(new EdibleEgg(), new EdibleEgg(), new EdibleEgg());
        //When
        boolean actual = froilan.isFull();
        //Then
        Assert.assertEquals(true, actual);
    }
}
