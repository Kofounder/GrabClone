package com.systema.grabclone.fonts

import android.app.Application
import com.systema.grabclone.R
import uk.co.chrisjenx.calligraphy.CalligraphyConfig

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
            .setDefaultFontPath("font/neosansstd.otf")
            .setFontAttrId(R.attr.fontPath)
            .build()
        )
    }
}