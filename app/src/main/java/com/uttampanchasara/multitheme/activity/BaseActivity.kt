package com.uttampanchasara.multitheme.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.uttampanchasara.multitheme.R
import com.uttampanchasara.multitheme.extension.getPrefValue

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val currentTheme = getPrefValue(getString(R.string.currentTheme), "Default")
        when (currentTheme) {
            "Default" -> setTheme(R.style.Default)
            "Black" -> setTheme(R.style.Black)
            "Green" -> setTheme(R.style.Green)
            "Purple" -> setTheme(R.style.Purple)
        }
        super.onCreate(savedInstanceState)
    }
}