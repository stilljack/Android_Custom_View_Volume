package com.example.volumeknob.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.volumeknob.R
import kotlinx.android.synthetic.main.activity_main.*

///starting over
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btn.setOnClickListener {
            vk.rotation += 10f
        }

    }
}