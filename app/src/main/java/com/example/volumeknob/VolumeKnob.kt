package com.example.volumeknob



import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView


class VolumeKnob(context: Context?, attrs: AttributeSet?) : ImageView(context, attrs) {

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


    override fun onDraw(canvas: Canvas) {

        //draw primary circle

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
        paint.color = resources.getColor(R.color.centercicle)
        canvas.drawCircle(wa , ha , radius, paint)



        var hb = h/2f/2.1f
        var wb = w/2f/2.1f

        if(wb < hb){
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

        if(wc < hc){
            radius = wc / 4f
        }
        else{
            radius = hc / 4f
        }
        // radius -= radius/10f
        paint.style = Paint.Style.FILL
        paint.color = resources.getColor(R.color.lvl1knob)
        canvas.drawCircle(wc , hc, radius, paint)

        var hd = h/2f/2.1f
        var wd = w/2f/2.1f

        if(wd < hd){
            radius = wd / 6f
        }
        else{
            radius = hd / 6f
        }
        // radius -= radius/10f
        paint.style = Paint.Style.FILL
        paint.color = resources.getColor(R.color.lvl2knob)
        canvas.drawCircle(wd , hd, radius, paint)
        super.onDraw(canvas)
        //paint.color = Color.WHITE
       // canvas.drawPaint(paint)
        // Use Color.parseColor to define HTML colors
        //supposedly the following formula leads to super good circles
       // width/2-mBitmap.getWidth()/2, height/2-mBitmap.getHeight()/2




    }
}



