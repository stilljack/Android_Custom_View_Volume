package com.example.volumeknob.customClasses



import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.GestureDetector
import android.widget.ImageView
import android.view.MotionEvent
import android.widget.TextView
import com.example.volumeknob.R
import kotlinx.android.synthetic.main.activity_main.view.*


@SuppressLint("ByteOrderMark")
class VolumeKnob(context: Context?, attrs: AttributeSet?) : ImageView(context, attrs) {
/*companion object {
    fun rotate() {for (i in 0 until 10) {
        this.rotate(10f)
    }
    }
}*/


    val mDetector = GestureDetector(context, GestureDetector.SimpleOnGestureListener())
    private val paint = Paint()
    private val paint2 = Paint()
    private val paint3 = Paint()
//constructor(context: Context): this(context, null)
    //
    // POSSIBLE ALTERNATE FOR VOLUMEKNOB(context: Context, attrs: AttributeSet, defStyleAttr : Int, defStyleRes: Int)
    //
    //(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
//    constructor(context: Context): this(context, null)
//    constructor(context: Context, attrs: AttributeSet): super(context, attrs)
//    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int): super(context, attrs, defStyleAttr)
//    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int, defStyleRes: Int): super(context, attrs, defStyleAttr, defStyleRes)


    init {
        invalidate();
    }

    fun handleTouch(m: MotionEvent) {
        /*var textView1 = findViewById<TextView>(R.id.textView1)
        var textView2 = findViewById<TextView>(R.id.textView2)*/

        var pointerCount = m.getPointerCount()

        for (i in 0 until pointerCount) {
            var xa = m.getX(i)
            var ya = m.getY(i)
            id = m.getPointerId(i)
            var action = m.getActionMasked()
            var actionIndex = m.getActionIndex()
            var actionString: String


            when (action) {
                MotionEvent.ACTION_DOWN ->
                    actionString = "DOWN"

                MotionEvent.ACTION_UP ->
                    actionString = "UP"

                MotionEvent.ACTION_POINTER_DOWN ->
                    actionString = "PNTR DOWN"

                MotionEvent.ACTION_POINTER_UP ->
                    actionString = "PNTR UP"

                MotionEvent.ACTION_MOVE ->
                    actionString = "MOVE"

                else ->
                    actionString = ""
            }


            var touchStatus =
                "Action: " + actionString + " Index: " + actionIndex + " ID: " + id + " X: " + xa + " Y: " + ya

            if (id == 0) {
                Log.i("$id","$touchStatus")
            } else {
                Log.i("$id","$touchStatus")


        }
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        super.onTouchEvent(event)

        handleTouch(event)
        // triggered each time the touch state changes
        var xtrack:Float
        var ytrack:Float
        var xmovetrack:Float
        var ymovetrack:Float
        var xautrack:Float
        var yautrack:Float

        var axisdownvalue:Float
        var axismovevalue:Float
        var axisupvalue:Float

        var xdiff:Float
       var ydiff:Float


        when (event.action) {
           MotionEvent.ACTION_DOWN // triggered when view is touched
            -> { Log.i("ACTION","down${event.actionIndex}")
                event.actionIndex.toString()
                xtrack= event.x
               ytrack=event.y



               return true
            }
            MotionEvent.ACTION_MOVE -> {Log.i("ACTION","move${event.actionIndex}")
                xmovetrack= event.x
                ymovetrack=event.y

                // get end point and calculate total distance traveled
                // use the total distance traveled to calculate the desired change in rotation
                // apply that change to your rotation variable
                // you may want to use a minimum and maximum rotation value to limit the rotation
                // use the new rotation to convert to the desired volume setting
                invalidate() // this will cause the onDraw method to be called again with your new values
                return true}
            MotionEvent.ACTION_UP -> {Log.i("ACTION","up${event.actionIndex}")
                xautrack=event.x
                yautrack=event.y

                return true
            }
        }// get and store start point with event.getX()
        return true; // this indicates that the event has been processed
    }
    override fun onDraw(canvas: Canvas) {

        //draw primary circle

       var h= this.height
        var w = this.width
        var ha = h/2f
        var wa = w/2f
        var radius:Float
        radius = if(width <= height){
            width / 2f
        } else{
            height / 2f
        }
       // radius -= radius/10f
        paint.style = Paint.Style.FILL
        paint.color = resources.getColor(R.color.centercicle)
        canvas.drawCircle(wa , ha , radius, paint)



        var hb = h/2f/2.1f
        var wb = w/2f/2.1f

        if(wb <= hb){
            radius = wb / 3f
        }
        else{
            radius = hb / 3f
        }
        // radius -= radius/10f
        paint.style = Paint.Style.FILL
        paint.color = resources.getColor(R.color.lvloknob)
        canvas.drawCircle(wb , hb , radius, paint)



        var hc = h/2f/2.1f
        var wc = w/2f/2.1f

        radius = if(wc <= hc){
            wc / 4f
        } else{
            hc / 4f
        }
        // radius -= radius/10f
        paint.style = Paint.Style.FILL
        paint.color = resources.getColor(R.color.lvl1knob)
        canvas.drawCircle(wc , hc, radius, paint)

        var hd = h/2f/2.1f
        var wd = w/2f/2.1f

        radius = if(wd < hd){
            wd / 6f
        } else{
            hd / 6f
        }
        // radius -= radius/10f
        paint.style = Paint.Style.FILL
        paint.color = resources.getColor(R.color.lvl2knob)

        canvas.drawCircle(wd , hd, radius, paint)


        //paint.color = Color.WHITE
       // canvas.drawPaint(paint)
        // Use Color.parseColor to define HTML colors
        //supposedly the following formula leads to super good circles
       // width/2-mBitmap.getWidth()/2, height/2-mBitmap.getHeight()/2


        //initial rotate getting us to starting at max
        this.rotation += 45f
        super.onDraw(canvas)
    }

}



