package com.deuscraft.TurboTeami.whakanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.deuscraft.TurboTeami.R

class BwelcaAcs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bwelca_acs)


        val a=findViewById<Button>(R.id.parallax)


        a.setOnClickListener {
            val j= Intent(this@BwelcaAcs,BranchGassa::class.java)
            startActivity(j)
        }

    }
}