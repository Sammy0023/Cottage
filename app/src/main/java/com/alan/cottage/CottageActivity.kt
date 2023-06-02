package com.alan.cottage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alan.cottage.databinding.ActivityCottageBinding

class CottageActivity : AppCompatActivity() {

    lateinit var binding: ActivityCottageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCottageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.factsButton.setOnClickListener {
            startActivity(Intent(this, FactsActivity::class.java))
        }

        binding.informationButton.setOnClickListener {
            startActivity(Intent(this, InfoActivity::class.java))
        }

        binding.photosButton.setOnClickListener {
            startActivity(Intent(this, PhotosActivity::class.java))
        }
    }
}