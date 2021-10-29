package com.udacoding.hello

import android.content.Context
import android.widget.Toast

class MyNandoToast {


    fun showToast(c : Context, msg : String){
        Toast.makeText(c, msg, Toast.LENGTH_SHORT).show()
    }
}