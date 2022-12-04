package com.deuscraft.TurboTeami.blocada

import android.app.Application
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk

class AbrstaClass: Application() {
    companion object {
        const val ApsDPASpdpaspdaspdp = "0a65779c-7896-406f-a2fe-0826b43e885f"
        var WQPDapsdpaspdpaspdpsadp = "appsChecker"
        var geo = "geo"
        var QWDapsdpaspdpaspdasp: String? = "c11"
        var WQdpaspdpaspdpasdp = "link"
        var ASxpsapxpsapdpaspdpsa: String? = "mainid"
        var DEEPL: String? = "d11"
        var ASpdaspdpspadpsapdpsadp: String? = "countryCode"
    }

    override fun onCreate() {
        super.onCreate()
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ApsDPASpdpaspdaspdp)
        Hawk.init(this).build()
    }
}