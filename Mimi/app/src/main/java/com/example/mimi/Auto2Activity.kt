package com.example.mimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_auto2.*
import org.jetbrains.anko.startActivity

class Auto2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto2)

        flex.setOnClickListener{
            startActivity<Auto3Activity>()
        }

        NoMoney.setOnClickListener{
            startActivity<Auto3Activity>()
        }

        middle.setOnClickListener{
            startActivity<Auto3Activity>()
        }
    }
}
