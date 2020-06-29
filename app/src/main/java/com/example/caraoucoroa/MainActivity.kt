package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var buttonJogaAí:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonJogaAí = buttonJogar

        buttonJogar.setOnClickListener {

            var intent = Intent(applicationContext,Main2Activity().javaClass)

            var numero = Random.nextInt(2)
            intent.putExtra("numero",numero)

            startActivity(intent)

        }

    }
}
