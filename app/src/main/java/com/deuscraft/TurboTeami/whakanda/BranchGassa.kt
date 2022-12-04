package com.deuscraft.TurboTeami.whakanda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.deuscraft.TurboTeami.R
import com.deuscraft.TurboTeami.databinding.ActivityBranchGassaBinding

class BranchGassa : AppCompatActivity() {
    lateinit var baf:ActivityBranchGassaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        baf= ActivityBranchGassaBinding.inflate(layoutInflater)
        setContentView(baf.root)
        val bus= arrayListOf<ImageView>(baf.leprechauns1,baf.leprechauns2,baf.leprechauns3,baf.leprechauns4,baf.leprechauns5,
        baf.leprechauns6,baf.leprechauns7,baf.leprechauns8,baf.leprechauns9)
        val shufer= arrayListOf<Int>(R.drawable.celarsyms,R.drawable.celarsyms,R.drawable.celarsyms,R.drawable.celarsyms,R.drawable.celarsyms,
        R.drawable.girslepres,R.drawable.girslepres,R.drawable.girslepres,R.drawable.girslepres)
        var resu=0
        var atts=0
        shufer.shuffle()
        for(i in 0..8){
            bus[i].setOnClickListener {
                atts++
                baf.resusfacts.text="$atts/5 Attemps"
                bus[i].setBackgroundResource(shufer[i])
                if(shufer[i]==R.drawable.girslepres){
                    resu++
                    if(resu==3){
                        val intent= Intent(this@BranchGassa,BauterGara::class.java)
                        startActivity(intent)

                    }
                }
                if(atts==5){
                    val intent=Intent(this@BranchGassa,BrasokResus::class.java)
                    startActivity(intent)
                }
            }
        }

    }
}