package com.projectteori.pebinurhakim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
class InfoPembuat : AppCompatActivity(), View.OnClickListener{

    private lateinit var img: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_pembuat)

        img = findViewById(R.id.ic_inf_bck_home)
        img.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.ic_inf_bck_home ->{
                val kedaftarLagi = Intent(this@InfoPembuat, MainActivity::class.java)
                startActivity(kedaftarLagi)
            }
        }
    }
}