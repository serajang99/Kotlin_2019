package com.example.mimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eat_today.*
import org.jetbrains.anko.startActivity

class EatTodayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eat_today)

        Button1.setOnClickListener{
            startActivity<Auto1Activity>()
        }

        Button2.setOnClickListener{
            startActivity<RouletteActivity>()
        }
    }
}
