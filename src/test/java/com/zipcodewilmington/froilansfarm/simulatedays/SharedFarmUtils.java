package com.zipcodewilmington.froilansfarm.simulatedays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.edibles.Tomato;
import com.zipcodewilmington.froilansfarm.shelters.ChickenCoop;
import com.zipcodewilmington.froilansfarm.shelters.Stable;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;

//@RunWith(Suite.class)
//
//@Suite.SuiteClasses({
//    SundayTest.class,
////    MondayTest.class
//})

public class SharedFarmUtils {
    public static Farm creatingFarm() {
        // should be stables, coops, croprows, vehicles
        Farm oldMacFarm = new Farm(3, 4, 5, 2);

        // add the animals
        oldMacFarm.addAnimalsToShelter(new Horse(), 10);
        oldMacFarm.addAnimalsToShelter(new Chicken(), 10);

        // add vehicles
        oldMacFarm.addFarmVehicle(new CropDuster(), new Tractor());
        // initialize barn
        HashMap<Edible, Integer> savingTheBarn = new HashMap<Edible, Integer>();
        // enough corn for 3 days feeding chickens, horses, and people
        savingTheBarn.put(new EarOfCorn(), 150);
        // enough tomatoes for the people
        savingTheBarn.put(new Tomato(), 25);
        // enough eggs for the people
        savingTheBarn.put(new EdibleEgg(), 10);
        oldMacFarm.setBarn(savingTheBarn);

        return oldMacFarm;
    }

//    public static void morningRoutine(Farmer farmer, Pilot pilot){
//        // ride all horses
//        rideAllHorsesTest(farmer, pilot);
//        // feed horses 3 ears of corn
//        feedHorsesTest(farmer);
//        // feed chickens 1 ear of corn
//        feedChickensTest(farmer);
//        // eat breakfast
//        eatBreakfastTest(farmer, pilot);
//    }

    public static void eatBreakfastTest(Farmer farmer, Pilot pilot) {
        farmer.eat(new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg(), new EdibleEgg());
        pilot.eat(new EdibleEgg(), new EdibleEgg());

        farmer.eat(new Tomato(), new Tomato());
        pilot.eat(new Tomato());

        farmer.eat(new EarOfCorn());
        pilot.eat(new EarOfCorn(), new EarOfCorn());

        Assert.assertEquals(true, farmer.isFull());
        Assert.assertEquals(true, pilot.isFull());
    }

    public static void feedChickensTest(Farmer farmer) {
        farmer.feedAllAnimals(farmer.getFarm().getListOfCoops());

        List<ChickenCoop> allTheStables = farmer.getFarm().getListOfCoops();
        for(ChickenCoop cc : allTheStables){
            for(Chicken thisLilChicky : cc){
                Assert.assertEquals(true, thisLilChicky.isFull());
            }
        }
    }

    public static void feedHorsesTest(Farmer farmer) {
        farmer.feedAllAnimals(farmer.getFarm().getListOfStables());

        List<Stable> allTheStables = farmer.getFarm().getListOfStables();
        for(Stable s : allTheStables){
            for(Horse h : s){
                Assert.assertEquals(true, h.isFull());
            }
        }
    }

    public static void rideAllHorsesTest(Farmer farmer, Pilot pilot){
        farmer.rideAllHorses(farmer.getFarm().getListOfStables(), pilot);

        List<Stable> allTheStables = farmer.getFarm().getListOfStables();
        for(Stable s : allTheStables){
            for(Horse h : s){
                Assert.assertEquals(true, h.hasBeenRiddenToday());
            }
        }
    }

    public static <PersonType extends Person> void resetPeople(PersonType hooman) {
        hooman.getListOfFoodEaten().clear();
    }

    public static void resetHorses(List<Stable> listOfStables) {
        for(Stable s : listOfStables){
            for(Horse h : s){
                h.getListOfFoodEaten().clear();
                h.resetRiddenToday();
            }
        }
    }

    public static void resetChicken(List<ChickenCoop> listOfCoops) {
        for(ChickenCoop cc : listOfCoops){
            for(Chicken c : cc){
                c.getListOfFoodEaten().clear();
            }
        }
    }
}

//    @Test
//    public void testing(){
//        // maybe one that calls up each day of the week? not sure tbh
//        System.out.println(froilan.getName());
//        System.out.println(froilan.getFarm().getFarmHouse());
//    }

    // this code is for some test suite stuff - not sure what this is supposed to do tbh
//    import org.junit.runner.RunWith;
//import org.junit.runners.Suite;
//
//}
