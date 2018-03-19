package com.example.hp.myanimbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void blueTapped(View view){

        //Image view on RHS is for type Casting
        ImageView blue = (ImageView)findViewById(R.id.bluebulb);

        ImageView green = (ImageView)findViewById(R.id.greenbulb);
        //the above two lines is nothing but the visibility of image


        /* animation is avialble in blue . animate property, and i can set the alpha to zero, and i can set the duration
        that it should go from 1 to 0, here 1000 means 1 second

         */
        blue.animate().alpha(1).setDuration(1000);//alpha  of blue should be one becuase blue is tapped
        green.animate().alpha(0).setDuration(1000);//alpha  of green should be zero becuase blue is tapped
    }
    public void greenTapped(View view){

        //Image view on RHS is for type Casting
        ImageView blue = (ImageView)findViewById(R.id.bluebulb);
        ImageView green = (ImageView)findViewById(R.id.greenbulb);
        /* animation is avialble in blue . animate property, and i can set the alpha to zero, and i can set the duration
        that it should go from 1 to 0, here 1000 means 1 second

         */
        blue.animate().alpha(0).setDuration(1000);
        green.animate().alpha(1).setDuration(1000);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
