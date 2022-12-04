package com.deuscraft.TurboTeami.whakanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import com.deuscraft.TurboTeami.R

class BauterGara : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bauter_gara)
        val cos=findViewById<Button>(R.id.marquee)


        cos.setOnClickListener {val ins= Intent(this@BauterGara,BranchGassa::class.java)
        startActivity(ins)}
    }
}