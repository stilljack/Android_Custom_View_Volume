package com.example.volumeknob

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.os.Bundle
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.RelativeLayout


class VolumeKnob(context: Context, attrs: AttributeSet?):
    LinearLayout(context, attrs) {


    private val rect = Rect()
    private val paint = Paint().apply { setARGB(255, 255, 0, 0) }

   private var startX: Float = 0f
    private var startY: Float = 0f
    private var diffX: Float = 0f
    private var diffY: Float = 0f


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


    }




    override fun onDraw(canvas: Canvas?) {

    /*    rect.left = (width * .1 + diffX).toInt()
        rect.right = (width * .75 + diffX).toInt()
        rect.top = (height * .25 + diffY).toInt()
        rect.bottom = (height * .9 + diffY).toInt()




        paint.color = Color.MAGENTA
        canvas?.drawCircle(width / 2.0f, height / 2f, 500f, paint)*/
        super.onDraw(canvas)

    }
}