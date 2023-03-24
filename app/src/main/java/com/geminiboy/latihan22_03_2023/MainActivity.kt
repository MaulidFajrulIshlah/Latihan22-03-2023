package com.geminiboy.latihan22_03_2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.geminiboy.latihan22_03_2023.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val etNama = findViewById<EditText>(R.id.etNama)
        val etTL = findViewById<EditText>(R.id.etTahunLahir)
        val btnSave = findViewById<Button>(R.id.btnSave)

        binding.btnSave.setOnClickListener {
            startActivity(Intent(this, Data::class.java))
        }
    }

}