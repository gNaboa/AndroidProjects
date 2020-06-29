package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main2.*
import kotlin.random.Random

class Main2Activity : AppCompatActivity() {

    private lateinit var buttonVoltaAí:Button
    private lateinit var imagem:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        buttonVoltaAí = buttonVoltar
        imagem = imageViewCara


        var dados = intent.extras
        var caco= dados.get("numero")

        if(caco ==0){ // cara
            imagem.setImageResource(R.drawable.moeda_cara)

        }else{ // coroa
            imagem.setImageResource(R.drawable.moeda_coroa)
        }


        buttonVoltaAí.setOnClickListener {

            var intent = Intent(applicationContext,MainActivity().javaClass)



            startActivity(intent)

        }

    }
}
