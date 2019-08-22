package com.example.volumeknob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

///we're gonna make two circles in a customView that will be a superset of Relative Layout
//use sample code to rotate the indicator around the plate

//.1. going to try to create the CustomView VolumeKnob as a superset of RelativeLayout consisting of 2 drawn circles

//.2. oh wow how the time has flown. We have one circle succesfully displaying and a better idea of how to use canvas and drawing to it, w
//relativeLAyout was replaced with view while we debuged. work continues
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







        /* SAMPLE CODE
        public boolean onTouchEvent(MotionEvent event) { // triggered each time the touch state changes
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN: // triggered when view is touched
                // get and store start point with event.getX()
                break;
                case MotionEvent.ACTION_MOVE: // triggered after ACTION_DOWN but when touch is moved
                // get end point and calculate total distance traveled
                // use the total distance traveled to calculate the desired change in rotation
                // apply that change to your rotation variable
                // you may want to use a minimum and maximum rotation value to limit the rotation
                // use the new rotation to convert to the desired volume setting
                invalidate(); // this will cause the onDraw method to be called again with your new values
                break;
                case MotionEvent.ACTION_UP: // triggered when touch ends
                break;
            }
            return true; // this indicates that the event has been processed
        }
        */
    }

}
