package com.feylabs.razkyutility

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.firriezky.razkyutility.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        Toaster().showShortToast(this,"Hello Gais")

    }
}