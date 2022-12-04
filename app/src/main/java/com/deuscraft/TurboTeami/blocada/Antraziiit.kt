package com.deuscraft.TurboTeami.blocada

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.deuscraft.TurboTeami.blocada.AbrstaClass.Companion.QWDapsdpaspdpaspdasp
import com.deuscraft.TurboTeami.blocada.AbrstaClass.Companion.DEEPL
import com.deuscraft.TurboTeami.blocada.AbrstaClass.Companion.WQPDapsdpaspdpaspdpsadp
import com.deuscraft.TurboTeami.blocada.AbrstaClass.Companion.ASpdaspdpspadpsapdpsadp
import com.deuscraft.TurboTeami.blocada.AbrstaClass.Companion.geo
import com.deuscraft.TurboTeami.databinding.ActivityAntraziiitBinding
import com.deuscraft.TurboTeami.whakanda.BwelcaAcs
import com.orhanobut.hawk.Hawk
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class Antraziiit : AppCompatActivity() {
    lateinit var bindAsf: ActivityAntraziiitBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        bindAsf = ActivityAntraziiitBinding.inflate(layoutInflater)
        setContentView(bindAsf.root)

        val appsCh: String? = Hawk.get(WQPDapsdpaspdpaspdpsadp, "null")

        if (appsCh == "1") {
            AppsFlyerLib.getInstance()
                .init("xSGLq8VVhaBkVyrWAss2xe", conversionDataListener, applicationContext)
            AppsFlyerLib.getInstance().start(this)
        }

        Apsdpasdpsapdpasp()

    }

    private val conversionDataListener = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(QWDapsdpaspdpaspdasp, dataGotten)
        }
        override fun onConversionDataFail(p0: String?) {}
        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {}
        override fun onAttributionFailure(p0: String?) {}
    }


    private fun intLONE() {
        val intent = Intent(this@Antraziiit, BwelcaAcs::class.java)
        Hawk.put(geo, null)
        Hawk.put(ASpdaspdpspadpsapdpsadp, null)
        startActivity(intent)
        finish()
    }

    private fun intWE() {
        val intent = Intent(this@Antraziiit, AdddrsWea::class.java)
        Hawk.put(geo, null)
        Hawk.put(ASpdaspdpspadpsapdpsadp, null)
        startActivity(intent)
        finish()
    }



    private fun Apsdpasdpsapdpasp() {

        val countriesPool: String = Hawk.get(geo)
        val countyC: String = Hawk.get(ASpdaspdpspadpsapdpsadp, "null")

        val deeplink: String? = Hawk.get(DEEPL, "null")
        val appsCh: String? = Hawk.get(WQPDapsdpaspdpaspdpsadp, "null")
        var naming: String? = Hawk.get(QWDapsdpaspdpaspdasp)

        if (appsCh == "1") {
            Log.d("AppsChecker", appsCh)
            val executorService = Executors.newSingleThreadScheduledExecutor()
            executorService.scheduleAtFixedRate({
                if (naming != null) {

                    if (naming!!.contains("tdb2") || countriesPool.contains(countyC) || deeplink!!.contains("tdb2")) {
                        Log.d("Apps Checker", "naming: $naming")
                        executorService.shutdown()
                        intWE()
                    } else {
                        executorService.shutdown()
                        intLONE()
                    }
                } else {
                    naming = Hawk.get(QWDapsdpaspdpaspdasp)
                    Log.d("TestInUIHawk", "Received null $naming")
                }
            }, 0, 1, TimeUnit.SECONDS)
        }  else if (countriesPool.contains(countyC)) {
            intWE()
        } else {
            intLONE()
        }

    }


}