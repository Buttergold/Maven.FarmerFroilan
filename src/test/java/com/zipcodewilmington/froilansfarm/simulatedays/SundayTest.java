package com.zipcodewilmington.froilansfarm.simulatedays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;
import com.zipcodewilmington.froilansfarm.field.CropRow;
import com.zipcodewilmington.froilansfarm.field.Field;
import com.zipcodewilmington.froilansfarm.field.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.field.crops.TomatoPlant;
import org.junit.Assert;
public class SundayTest {
    public void sundayRoutine(Farmer froilan){
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
}
