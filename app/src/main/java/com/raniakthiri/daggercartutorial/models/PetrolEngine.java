package com.raniakthiri.daggercartutorial.models;

import android.util.Log;

import com.raniakthiri.daggercartutorial.interfaces.Engine;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine";
    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("Horse Power")int horsePower, @Named("Engine Capacity")int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Inject


    @Override
    public void startEngine() {
        Log.d(TAG, "Starting ..."
                + "\n HorsePower: "+ horsePower
                + "\n Engine Capacity: " +engineCapacity);
    }

}
