package com.projectteori.pebinurhakim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
class DetailLembang : AppCompatActivity(), View.OnClickListener{

    private lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_lembang)

        img = findViewById(R.id.kembali_kedaftar4)
        img.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.kembali_kedaftar4 ->{
                val kedaftarLagi = Intent(this@DetailLembang, DaftarWisata::class.java)
                startActivity(kedaftarLagi)
            }
        }
    }
}