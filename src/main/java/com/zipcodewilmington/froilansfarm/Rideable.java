package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.people.Rider;

public interface Rideable <RiderType extends Rider> {
    void ride();
    RiderType getCurrentRider();
    void setCurrentRider(RiderType rider);
}
