// 12-08-2021 - 10118378 - Gifar Fadillah Suryana - IF9
package com.jovanovic.stefan.mytestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle





class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }
}