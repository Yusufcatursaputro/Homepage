package com.example.homepage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.homepage.SecondActivity.Companion.EXTRA_USERNAME
import com.example.homepage.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding :ActivityThirdBinding

    companion object {
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(EXTRA_USERNAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val phone = intent.getStringExtra(EXTRA_PHONE)

        with(binding) {
            binding.usernameHome.text = username
            binding.emailHome.text = "Your email ($email) has been activated"
            binding.phoneHome.text = "Your phone ($phone) has been registered"
        }
    }
}