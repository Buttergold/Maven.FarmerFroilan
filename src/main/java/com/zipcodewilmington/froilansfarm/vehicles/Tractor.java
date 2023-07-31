package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.edibles.Edible;
import com.zipcodewilmington.froilansfarm.field.CropRow;

import java.util.List;

public class Tractor extends FarmVehicle<Farmer>{
    public List<Edible> harvest(CropRow currentRow){
        return null;
    }
    public void clearRow(CropRow currentRow){

    }
}
