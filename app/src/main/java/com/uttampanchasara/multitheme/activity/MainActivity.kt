package com.uttampanchasara.multitheme.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.uttampanchasara.multitheme.R
import com.uttampanchasara.multitheme.fragment.ThemeSwitherFragmentDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)
        supportActionBar?.title = "MultiTheme"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.action_switch_theme) {
            val dialog = ThemeSwitherFragmentDialog()
            dialog.show(supportFragmentManager, ThemeSwitherFragmentDialog.TAG)
        }
        return super.onOptionsItemSelected(item)
    }
}