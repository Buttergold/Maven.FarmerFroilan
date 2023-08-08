package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.field.CropRow;

import java.util.ArrayList;
import java.util.List;

public class Tractor extends FarmVehicle<Farmer>{

    @Override
    public String makeNoise() {
        return "Vroom VROOM";
    }

    public List<Edible> harvest(CropRow currentRow){
        if(currentRow.hasCrops()){
            if(currentRow.hasBeenFertilized()){
                return harvest(currentRow);
            }
        }
        // default is an empty array list
        return new ArrayList<Edible>();
    }
    public void clearRow(CropRow currentRow){

    }

    @Override
    public void ride() {

        if (currentDriver == null);{
                return;
        }


    }

    @Override
    boolean operate(Farm farm) {
        return false;
    }
}
