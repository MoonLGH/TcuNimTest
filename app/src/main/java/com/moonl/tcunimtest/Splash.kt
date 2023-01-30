package com.moonl.tcunimtest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val text:TextView = findViewById(R.id.version)
        text.setText("Version "+BuildConfig.VERSION_NAME)
        Handler().postDelayed({
            val intent = Intent(this@Splash,MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}