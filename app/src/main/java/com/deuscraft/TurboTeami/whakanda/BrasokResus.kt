package com.deuscraft.TurboTeami.whakanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.deuscraft.TurboTeami.R

class BrasokResus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brasok_resus)
        val jos=findViewById<Button>(R.id.sawtooth)
        jos.setOnClickListener {
            val o= Intent(this@BrasokResus,BranchGassa::class.java)

            startActivity(o)
        }
    }
}