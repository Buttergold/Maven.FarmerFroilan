package com.zipcodewilmington.froilansfarm.simulatedays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.Field;
import com.zipcodewilmington.froilansfarm.field.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.field.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.*;

public class SimulateTheWeekTest {
    static Farmer froilan;
    static Pilot froilanda;

    @BeforeClass
    public static void establishingThePlot() {
        // this function will get called up ONCE and ONLY ONCE at the beginning of the test
        Farm oldMacFarm = SharedFarmUtils.creatingFarm();
        froilan = new Farmer("Froilan", oldMacFarm);
        froilanda = new Pilot("Froilanda", oldMacFarm);
    }

    public void morningRoutine(){
        // ride all horses
        SharedFarmUtils.rideAllHorsesTest(froilan, froilanda);
        // feed horses 3 ears of corn
        SharedFarmUtils.feedHorsesTest(froilan);
        // feed chickens 1 ear of corn
        SharedFarmUtils.feedChickensTest(froilan);
        // eat breakfast
        SharedFarmUtils.eatBreakfastTest(froilan, froilanda);
    }

    public void goToSleep(){
        SharedFarmUtils.resetPeople(froilan);
        SharedFarmUtils.resetPeople(froilanda);
        SharedFarmUtils.resetHorses(froilan.getFarm().getListOfStables());
        SharedFarmUtils.resetChicken(froilan.getFarm().getListOfCoops());
    }

    @Test
    public void simulateWeek(){
        // SUNDAY ROLLS BY
        morningRoutine();
        sundayRoutine();
        goToSleep();

        //MONDAY ROLLS BY
        mondayRoutine();
        mondayRoutine();
        goToSleep();
    }

    public void sundayRoutine(){
        // plant crop rows with veggies
        Field theField = froilan.getFarm().getField();
        for(int i = 0; i < theField.size(); i++){
            CropRow row = theField.get(i);
            switch (i){
                case 0:
                    froilan.plant(row, new CornStalk());
                    break;
                case 1:
                    froilan.plant(row, new TomatoPlant());
                    break;
                default:
                    froilan.plant(row, new CornStalk());
            }
        }
        Assert.assertEquals(false, theField.isClear());
    }

    public void mondayRoutine(){
        // get the crop duster
        CropDuster cd = froilanda.getFarm().getCropDuster();
        Assert.assertNotNull(cd);

        // now mount the vehicle
        froilanda.mount(cd);
        cd.ride();
        froilanda.dismount(cd);

        // now let's make sure the field has been fertilized
        Field theField = froilanda.getFarm().getField();
        for(CropRow cr : theField){
            Assert.assertEquals(true, cr.hasBeenFertilized());
        }
    }

    public void tuesdayRoutine(){
        // get the crop duster
        Tractor t = froilan.getFarm().getTractor();
        Assert.assertNotNull(t);

        // now mount the vehicle
        froilan.mount(t);
        t.ride();
        froilan.dismount(t);

        // now let's make sure the field has been harvested
        Field theField = froilanda.getFarm().getField();
        Assert.assertEquals(true, theField.isClear());
    }
}
