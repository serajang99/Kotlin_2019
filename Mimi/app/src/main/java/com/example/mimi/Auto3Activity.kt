package com.example.mimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choice.*
import org.jetbrains.anko.startActivity

class Auto3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto3)

        flex.setOnClickListener{
            startActivity<Auto4Activity>()
        }

        NoMoney.setOnClickListener{
            startActivity<Auto4Activity>()
        }
    }
}
