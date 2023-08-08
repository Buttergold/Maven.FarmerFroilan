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
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PilotTest {

    @Test
    public void testInheritance() {
        Pilot landa = new Pilot();

        Assert.assertTrue(landa instanceof Rider);
        Assert.assertTrue(landa instanceof Person);
        Assert.assertTrue(landa instanceof Animal);
        Assert.assertTrue(landa instanceof NoiseMaker);
        Assert.assertTrue(landa instanceof Eater);
    }

    @Test
    public void testMount() {
        Pilot landa = new Pilot();
        CropDuster duster = new CropDuster();

        Assert.assertNull(duster.getCurrentRider());
        landa.mount(duster);
        Pilot actual = duster.getCurrentRider();

        Assert.assertEquals(landa, actual);
    }

    @Test
    public void testDismount() {
        Pilot landa = new Pilot();
        CropDuster duster = new CropDuster();

        landa.mount(duster);

        Assert.assertEquals(landa, duster.getCurrentRider());
        landa.dismount(duster);

        Assert.assertNull(duster.getCurrentRider());
    }

    @Test
    public void testEat() {
        Pilot landa = new Pilot();

        int expected = 1;
        Assert.assertTrue(landa.getListOfFoodEaten().isEmpty());

        landa.eat(new EdibleEgg());
        int actual = landa.getListOfFoodEaten().size();

       Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat2() {

        Pilot landa = new Pilot();
        EarOfCorn corn = new EarOfCorn();

        landa.eat(corn);

        Assert.assertTrue(landa.getListOfFoodEaten().contains(corn));
    }

    @Test
    public void testMakeNoise() {
        Pilot landa = new Pilot();
        String expected = "Weeeeeeeeeeeeeee!!";

        String actual = landa.makeNoise();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void isFullTest() {
        //Given
        Pilot pilot = new Pilot();
        pilot.eat(new EarOfCorn(),new EarOfCorn(),new EdibleEgg(), new EdibleEgg(), new Tomato());


        //When
        boolean notHungry = true;
        notHungry = pilot.isFull();

        //Then
        Assert.assertTrue(notHungry);

    }
    @Test
    public void isNotFullTest(){
        //Given
        Pilot pilot = new Pilot();
        pilot.eat(new EarOfCorn(),new EdibleEgg(), new Tomato());


        //When
        boolean hungry = false;
        hungry = pilot.isFull();

        //Then
        Assert.assertFalse(hungry);

    }
}
