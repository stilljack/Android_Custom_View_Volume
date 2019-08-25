package com.example.volumeknob.customClasses

import android.content.Context

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.widget.ImageView
import androidx.core.content.ContextCompat
import android.view.MotionEvent






class VolumeKnob(context: Context?, attrs: AttributeSet?) : ImageView(context, attrs) {
 //   constructor(context: Context) : this(context, null)

/*companion object {
    fun rotate() {for (i in 0 until 10) {
        this.rotate(10f)
    }
    }
}*/


//constructor(context: Context): this(context, null)
    //
    // POSSIBLE ALTERNATE FOR VOLUMEKNOB(context: Context, attrs: AttributeSet, defStyleAttr : Int, defStyleRes: Int)
    //
    //(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
//    constructor(context: Context): this(context, null)
//    constructor(context: Context, attrs: AttributeSet): super(context, attrs)

    //    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int): super(context, attrs, defStyleAttr, defStyleRes)
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
  private var downx:Float = 0f
   private var movex:Float = 0f
    override fun onTouchEvent(event: MotionEvent): Boolean {


        // triggered each time the touch state changes
        when (event.action) {
            MotionEvent.ACTION_DOWN // triggered when view is touched
            -> {
            downx= event.x
            }
            MotionEvent.ACTION_MOVE // triggered after ACTION_DOWN but when touch is moved
            -> {

                movex = event.x




                // get end point and calculate total distance traveled
                // use the total distance traveled to calculate the desired change in rotation
                // apply that change to your rotation variable
                // you may want to use a minimum and maximum rotation value to limit the rotation
                // use the new rotation to convert to the desired volume setting
                // this will cause the onDraw method to be called again with your new values
            }
            MotionEvent.ACTION_UP // triggered when touch ends
            -> {
            }
        }// get and store start point with event.getX()
        return true // this indicates that the event has been processed
    }



    init {

    }
     override fun onDraw(canvas: Canvas) {



         //draw primary circle

           var h = this.height
           var w = this.width
           var ha = h / 2f
           var wa = w / 2f
           var radius: Float
           radius = if (width <= height) {
               width / 2f
           } else {
               height / 2f
           }
           // radius -= radius/10f
           paint.style = Paint.Style.FILL
           paint.color =ContextCompat.getColor(context, com.example.volumeknob.R.color.centercicle)

         canvas.drawCircle(wa, ha, radius, paint)


        var hb = h / 2f / 2.1f
           var wb = w / 2f / 2.1f

           if (wb <= hb) {
               radius = wb / 3f
           } else {
               radius = hb / 3f
           }
           // radius -= radius/10f
         paint.color =ContextCompat.getColor(context, com.example.volumeknob.R.color.lvloknob)
           canvas.drawCircle(wb, hb, radius, paint)


           var hc = h / 2f / 2.1f
           var wc = w / 2f / 2.1f

           radius = if (wc <= hc) {
               wc / 4f
           } else {
               hc / 4f
           }
           // radius -= radius/10f
           paint.color = ContextCompat.getColor(context, com.example.volumeknob.R.color.lvloknob)
           canvas.drawCircle(wc, hc, radius, paint)

           var hd = h / 2f / 2.1f
           var wd = w / 2f / 2.1f

           radius = if (wd < hd) {
               wd / 6f
           } else {
               hd / 6f
           }
           // radius -= radius/10f

           paint.color = ContextCompat.getColor(context, com.example.volumeknob.R.color.lvl2knob)
           canvas.drawCircle(wd, hd, radius, paint)


           //paint.color = Color.WHITE
           //canvas.drawPaint(paint)
           // Use Color.parseColor to define HTML colors
           //supposedly the following formula leads to super good circles
           // width/2-mBitmap.getWidth()/2, height/2-mBitmap.getHeight()/2


           //initial rotate getting us to starting at max
           this.rotation += 40f
         paint.color = Color.MAGENTA
         //canvas?.drawCircle(width/2.0f, height/2f, 500f, paint)

           super.onDraw(canvas)
       }
   }





