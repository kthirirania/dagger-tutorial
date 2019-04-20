package com.raniakthiri.daggercartutorial.models;

import javax.inject.Inject;

public class Wheels {
    // We don't own this class we got it from a third party for example

    private Tires tires;
    private Rims rims;

    public Wheels(Rims rims, Tires tires) {
        this.tires = tires;
        this.rims = rims;
    }
}
