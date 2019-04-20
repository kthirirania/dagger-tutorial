package com.raniakthiri.daggercartutorial.models;

import android.util.Log;

public class Tires {
    // We don't own this class we got it from a third party for example

    private static final String TAG = "Tires";

    public void inflate(){
        Log.d(TAG, "inflate: inflating Tires");
    }
}
