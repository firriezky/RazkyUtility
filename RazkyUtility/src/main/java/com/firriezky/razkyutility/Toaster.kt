package com.firriezky.razkyutility

import android.content.Context
import android.widget.Toast


class Toaster {

    fun showShortToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }

}