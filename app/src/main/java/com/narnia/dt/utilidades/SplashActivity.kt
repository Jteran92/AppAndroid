package com.narnia.dt.utilidades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val ImageLogo = findViewById<ImageView>(R.id.imageLogo)

        ImageLogo.setOnClickListener{
            Toast.makeText(this, "~Se Presiono El Logo~ ", Toast.LENGTH_SHORT).show()

            var i = Intent(this , AuthActivity::class.java)
            startActivity(i)
            finish()

            }
        }
}