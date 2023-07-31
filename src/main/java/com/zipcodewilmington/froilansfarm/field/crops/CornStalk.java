package com.zipcodewilmington.froilansfarm.field.crops;

import com.zipcodewilmington.froilansfarm.edibles.EarOfCorn;

import java.util.ArrayList;
import java.util.List;

public class CornStalk extends Crop<EarOfCorn>{
    //constructor
    public CornStalk(){
        // hard coding this in bc idk yet
        super(3.);
    }

//    public List<EarOfCorn> yield(){
//        List<EarOfCorn> retVal = new ArrayList<EarOfCorn>();
//        int integerYieldRate = (int) yieldRate;
//        for(int i = 0; i < integerYieldRate; i++){
//            if(hasBeenHarvested) {
//                EarOfCorn theYield = yield(hasBeenFertilized);
//                if (theYield != null) {
//                    retVal.add(theYield);
//                }
//            }
//        }
//        return retVal;
////        return earOfCorn;
//    }

    @Override
    public EarOfCorn yield(boolean hasBeenFertilized) {
        if(hasBeenFertilized){
            return new EarOfCorn();
        }
        return null;
    }
}
