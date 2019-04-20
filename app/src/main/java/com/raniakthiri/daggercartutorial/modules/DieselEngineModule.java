package com.raniakthiri.daggercartutorial.modules;

import com.raniakthiri.daggercartutorial.interfaces.Engine;
import com.raniakthiri.daggercartutorial.models.DieselEngine;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;
    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    /**
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
    **/

    @Provides
    int provideHorsepower(){
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
