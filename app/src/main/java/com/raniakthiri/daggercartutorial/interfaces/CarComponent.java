package com.raniakthiri.daggercartutorial.interfaces;
import android.os.Build;

import com.raniakthiri.daggercartutorial.MainActivity;
import com.raniakthiri.daggercartutorial.models.Car;
import com.raniakthiri.daggercartutorial.modules.DieselEngineModule;
import com.raniakthiri.daggercartutorial.modules.PetrolEngineModule;
import com.raniakthiri.daggercartutorial.modules.WheelsModule;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();
    void injectCar(MainActivity mainActivity);


    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("Horse Power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("Engine Capacity") int engineCapacity);

        CarComponent build();

    }

}
