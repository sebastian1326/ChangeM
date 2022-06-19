package com.lopezing.changem.ui.Splash

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.lopezing.changem.databinding.ActivitySplashBinding
import com.lopezing.changem.ui.Main.MainActivity
//import com.lopezing.changem.databinding.ActivitySplashBinding
//import com.lopezing.changem.ui.main.MainActivity
import java.util.*
import kotlin.concurrent.timerTask

class SplashActivity : Activity() {
    private lateinit var splashBinding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        splashBinding=ActivitySplashBinding.inflate(layoutInflater)
        val view=splashBinding.root
        setContentView(view)

        val timer= Timer()
        timer.schedule(
            timerTask {
                goToMainActivity()
            },1000
        )
    }
    private fun goToMainActivity(){
        val intent= Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}