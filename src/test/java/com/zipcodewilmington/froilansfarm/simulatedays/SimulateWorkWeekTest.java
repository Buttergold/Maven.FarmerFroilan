package com.zipcodewilmington.froilansfarm.simulatedays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.field.crops.Crop;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class SimulateWorkWeekTest {
    Farmer froilan;
    Farmer froilanda;

    @Before
    public void setUpFarm() {
        Farmer froilan = new Farmer("Froilan");
        Farmer froilanda = new Pilot("Froilanda");

        // should be stables, coops, croprows, vehicles
        Farm oldMacFarm = new Farm(3, 4, 5, 2);

        // add the animals
        oldMacFarm.addAnimalsToShelter(Horse.class, 10);
        oldMacFarm.addAnimalsToShelter(Chicken.class, 10);
        oldMacFarm.addAnimalsToShelter(froilan, froilanda);

        // add vehicles
        oldMacFarm.addFarmVehicle(new CropDuster(), new Tractor());
        // initialize barn
        HashMap<Crop, Integer> savingTheBarn = new HashMap<Crop, Integer>();
        // enough corn for 3 days feeding chickens, horses, and people
        savingTheBarn.put(new EarOfCorn(), 150);
        // enough tomatoes for the people
        savingTheBarn.put(new Tomato(), 25);
        // enough eggs for the people
        savingTheBarn.put(new EdibleEgg(), 10);
        oldMacFarm.setBarn(savingTheBarn);

        // associate people with said farm
        froilan.setFarm(oldMacFarm);
        froilanda.setFarm(oldMacFarm);
    }

    @Test
    public void testing(){
        // maybe one that calls up each day of the week? not sure tbh
    }

    // this code is for some test suite stuff - not sure what this is supposed to do tbh
//    import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//
//    @RunWith(Suite.class)
//
//    @Suite.SuiteClasses({
//            TestJunit1.class,
//            TestJunit2.class
//    })
//
//    public class JunitTestSuite {
//    }
}
