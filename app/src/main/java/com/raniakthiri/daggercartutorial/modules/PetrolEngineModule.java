package com.raniakthiri.daggercartutorial.modules;

import com.raniakthiri.daggercartutorial.interfaces.Engine;
import com.raniakthiri.daggercartutorial.models.PetrolEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
