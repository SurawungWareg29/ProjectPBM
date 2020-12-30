package com.projectteori.pebinurhakim


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
class DaftarWisata : AppCompatActivity(), View.OnClickListener{
    private lateinit var img : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_wisata)

        img = findViewById(R.id.ic_dftr_bck_home)
        img.setOnClickListener(this)

        img = findViewById(R.id.info_alun_alun)
        img.setOnClickListener(this)

        img = findViewById(R.id.info_kebun_binatang)
        img.setOnClickListener(this)

        img = findViewById(R.id.info_kawah_putih)
        img.setOnClickListener(this)

        img = findViewById(R.id.info_lembang)
        img.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.ic_dftr_bck_home ->{
                val keHome = Intent(this@DaftarWisata, MainActivity::class.java)
                startActivity(keHome)
            }

            R.id.info_alun_alun ->{
                val keAlunAlun = Intent(this@DaftarWisata, DetailAlunAlun::class.java)
                startActivity(keAlunAlun)
            }

            R.id.info_kawah_putih ->{
                val kePantaiGonda = Intent(this@DaftarWisata, DetailKawahPutih::class.java)
                startActivity(kePantaiGonda)
            }
            R.id.info_kebun_binatang ->{
                val kePantaiGonda = Intent(this@DaftarWisata, DetailKebunBinatang::class.java)
                startActivity(kePantaiGonda)
            }
            R.id.info_lembang ->{
                val kePantaiGonda = Intent(this@DaftarWisata, DetailLembang::class.java)
                startActivity(kePantaiGonda)
            }
        }
    }
}