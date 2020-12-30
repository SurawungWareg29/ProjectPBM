package com.projectteori.pebinurhakim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
class MainActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var btn : Button
    private lateinit var img : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.lanjut_wisata)
        btn.setOnClickListener(this)
        img = findViewById(R.id.info_apps)
        img.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.info_apps ->{
                val keInfoApp = Intent(this@MainActivity, InfoPembuat::class.java)
                startActivity(keInfoApp)
            }
            R.id.lanjut_wisata ->{
                val keDaftar = Intent(this@MainActivity, DaftarWisata::class.java)
                startActivity(keDaftar)
            }
        }
    }
}