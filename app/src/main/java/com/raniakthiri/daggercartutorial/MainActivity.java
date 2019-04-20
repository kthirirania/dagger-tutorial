package com.raniakthiri.daggercartutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.raniakthiri.daggercartutorial.interfaces.CarComponent;
import com.raniakthiri.daggercartutorial.interfaces.DaggerCarComponent;
import com.raniakthiri.daggercartutorial.models.Car;
import com.raniakthiri.daggercartutorial.modules.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private ImageView ivSteeringWheel;
    private ImageView ivCar;

    @Inject
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivSteeringWheel = findViewById(R.id.iv_steering_wheel);
        ivCar = findViewById(R.id.iv_car);

        steerTheWheel();

    }

    public void steerTheWheel(){
        ivSteeringWheel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                animateSteeringWheel();
                ivCar.setVisibility(View.VISIBLE);

                CarComponent carComponent = DaggerCarComponent
                                    .builder()
                                    .horsePower(150)
                                    .engineCapacity(1400)
                                    .build();

                carComponent.injectCar(MainActivity.this);
                //car = carComponent.getCar();
                car.drive();
            }
        });
    }

    public void animateSteeringWheel(){

        AnimationSet animSet = new AnimationSet(true);
        animSet.setInterpolator(new DecelerateInterpolator());
        animSet.setFillAfter(true);
        animSet.setFillEnabled(true);

        final RotateAnimation animRotate = new RotateAnimation(0.0f, -90.0f,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

        animRotate.setDuration(1500);
        animRotate.setFillAfter(true);
        animSet.addAnimation(animRotate);

        ivSteeringWheel.startAnimation(animSet);

    }
}
