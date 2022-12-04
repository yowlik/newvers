package com.deuscraft.TurboTeami.blocada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.deuscraft.TurboTeami.R
import com.deuscraft.TurboTeami.blocada.AbrstaClass.Companion.ASxpsapxpsapdpaspdpsa
import com.deuscraft.TurboTeami.blocada.AbrstaClass.Companion.WQPDapsdpaspdpaspdpsadp
import com.deuscraft.TurboTeami.whakanda.BwelcaAcs
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Adapra : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapra)
        checkCountry()
    }

    private fun getShData(): String? {
        val restCheck: String? = Hawk.get(WQPDapsdpaspdpaspdpsadp)
        Log.d("ADACt Data", restCheck.toString())
        return restCheck
    }



    private fun getAdId(){
        val adInfo = AdvertisingIdClient(applicationContext)
        adInfo.start()
        val adIdInfo = adInfo.info.id
        Log.d("getAdvertisingId = ", adIdInfo.toString())
        Hawk.put(ASxpsapxpsapdpaspdpsa, adIdInfo)
    }





    private fun checkCountry() {

        val check = getShData()

        if (check == "0") {
            intALone()

        } else {
            GlobalScope.launch(Dispatchers.Default) {
                getAdId()
            }
            intAfb()
        }
    }

    private fun intAfb() {
        val intent = Intent(this@Adapra, Antraziiit::class.java)
        startActivity(intent)
        finish()
    }




    private fun intALone() {
        val intent = Intent(this@Adapra, BwelcaAcs::class.java)
        Hawk.put(AbrstaClass.geo, null)
        Hawk.put(AbrstaClass.ASpdaspdpspadpsapdpsadp, null)
        startActivity(intent)
        finish()
    }
}