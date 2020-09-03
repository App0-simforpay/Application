package com.app0.simforpay.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.app0.simforpay.R
import com.app0.simforpay.activity.login.SigninAct
import com.app0.simforpay.global.sharedpreferences.MyApplication

private val SPLASH_TIME_OUT:Long = 2000

class SplashAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_splash)

        Handler().postDelayed({

            if(MyApplication.prefs.getString("id", "") == ""){
                startActivity(Intent(this, SigninAct::class.java))
            }else{
                startActivity(Intent(this, MainAct::class.java))
            }

            finish()
        }, SPLASH_TIME_OUT)
    }
}