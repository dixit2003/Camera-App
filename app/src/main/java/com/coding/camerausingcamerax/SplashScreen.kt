package com.coding.camerausingcamerax

// SplashActivity.kt
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        // Find the button by its ID
        val btnGoToNextActivity = findViewById<Button>(R.id.button)

        // Set up click listener
        btnGoToNextActivity.setOnClickListener {
            // Create an Intent to start the new activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
