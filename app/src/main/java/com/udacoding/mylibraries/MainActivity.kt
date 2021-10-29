package com.udacoding.mylibraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.udacoding.mytoast.MyNandoToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        MyNandoToast().showToast(this,"sj")
    }
}