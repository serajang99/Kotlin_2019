package com.example.mimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choice.*
import org.jetbrains.anko.startActivity

class ChoiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)

        flex.setOnClickListener{
            startActivity<EatTodayActivity>()
        }
    }
}
