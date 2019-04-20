package com.raniakthiri.daggercartutorial.models;

import android.util.Log;

import com.raniakthiri.daggercartutorial.interfaces.Engine;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Provides;

public class DieselEngine implements Engine {
    private static final String TAG = "DieselEngine";
    private int horsePower;
    private int engineCapacity;

    @Inject
    public DieselEngine(@Named("Horse Power")int horsePower, @Named("Engine Capacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "Starting ..."
                + "\n HorsePower: "+ horsePower
                + "\n Engine Capacity: " +engineCapacity);
    }
}
