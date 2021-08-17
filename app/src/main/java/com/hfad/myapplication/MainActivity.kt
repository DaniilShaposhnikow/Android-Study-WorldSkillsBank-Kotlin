package com.hfad.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView: ImageView = findViewById<ImageView>(R.id.dep_bank);
        val imageView1: ImageView = findViewById<ImageView>(R.id.rateCurrency);
        val imageView2: ImageView = findViewById<ImageView>(R.id.logIn);
        imageView.setOnClickListener{this; DepBank()}
        imageView1.setOnClickListener { this; rate() }
        imageView2.setOnClickListener { this; login() }
    }
    private fun DepBank()
    {
        val intent = Intent (this, BankActivity::class.java);
        startActivity(intent);
    }
    private fun rate()
    {
        val intent = Intent(this, Rate::class.java);
        startActivity(intent);
    }
    private fun login()
    {
        val intent = Intent(this, Login::class.java);
        startActivity(intent);
    }
}
