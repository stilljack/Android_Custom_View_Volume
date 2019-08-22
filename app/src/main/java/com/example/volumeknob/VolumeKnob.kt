package com.example.volumeknob



import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View



class VolumeKnob(context: Context?, attrs: AttributeSet?) : View(context, attrs) {

    private val paint = Paint()
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
        var i = this.width
        var a = h/ 2f
        var b = i / 2f
        var radius:Float
        if(width < height){
           radius = width / 2f
            }
        else{
         radius = height / 2f
            }
        radius -= radius/10f
        paint.style = Paint.Style.FILL
        //paint.color = Color.WHITE
       // canvas.drawPaint(paint)
        // Use Color.parseColor to define HTML colors


        paint.color = Color.parseColor("#ffffff")
        canvas.drawCircle(b / 2f, a / 2f, radius, paint)
        super.onDraw(canvas)

        invalidate()
    }
}



