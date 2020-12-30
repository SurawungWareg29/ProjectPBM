package com.projectteori.pebinurhakim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
class DetailAlunAlun : AppCompatActivity(), View.OnClickListener{

    private lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_alun_alun)

        img = findViewById(R.id.kembali_kedaftar1)
        img.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.kembali_kedaftar1 ->{
                val kedaftarLagi = Intent(this@DetailAlunAlun, DaftarWisata::class.java)
                startActivity(kedaftarLagi)
            }
        }
    }
}