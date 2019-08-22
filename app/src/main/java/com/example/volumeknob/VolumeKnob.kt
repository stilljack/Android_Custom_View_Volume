package com.example.volumeknob



import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View



class VolumeKnob(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    private val paint = Paint()
    private val paint2 = Paint()
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


    override fun onDraw(canvas: Canvas) {

       var h= this.height
        var w = this.width
        var ha = h/2f
        var wa = w/2f
        var radius:Float
        if(width < height){
           radius = width / 2f
            }
        else{
         radius = height / 2f
            }
       // radius -= radius/10f
        paint.style = Paint.Style.FILL
        paint.color = Color.parseColor("#ffffff")
        canvas.drawCircle(wa , ha , radius, paint)
        super.onDraw(canvas)




        var hb = h/2f/2.1f
        var wb = w/2f/2.1f

        if(wb < hb){
            radius = wb / 5f
        }
        else{
            radius = hb / 5f
        }
        // radius -= radius/10f
        paint.style = Paint.Style.FILL
        paint.color = Color.parseColor("#00ff00")
        canvas.drawCircle(wb , hb , radius, paint2)

        super.onDraw(canvas)
        //paint.color = Color.WHITE
       // canvas.drawPaint(paint)
        // Use Color.parseColor to define HTML colors
        //supposedly the following formula leads to super good circles
       // width/2-mBitmap.getWidth()/2, height/2-mBitmap.getHeight()/2




    }
}



