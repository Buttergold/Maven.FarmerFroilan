package com.zipcodewilmington.froilansfarm.simulatedays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SundayTest {
    static Farmer froilan;
    static Pilot froilanda;

    @BeforeClass
    public static void establishingThePlot() {
        // this function will get called up ONCE and ONLY ONCE at the beginning of the test
        Farm oldMacFarm = SharedFarmUtils.creatingFarm();
        froilan = new Farmer("Froilan", oldMacFarm);
        froilanda = new Pilot("Froilanda", oldMacFarm);

        // now do your morning routine
        SharedFarmUtils.morningRoutine(froilan, froilanda);
    }

    @Test
    public void one(){
        System.out.println("one");
    }

    @Test
    public void two(){
        System.out.println("two");
    }
}
