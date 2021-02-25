package com.example.imc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun setListener(){
        edtPeso?.doAfterTextChanged { text ->

        }

        edtAltura?.doAfterTextChanged { text ->

        }
        btnCalcular.setOnClickListener {
            calcularIMC(edtPeso.text.toString(), edtAltura.text.toString())
        }
    }

    private fun calcularIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()

        if(peso != null && altura != null){
            val imc = peso / (altura*altura)
            txtTitulo.text = "Seu IMC É: %.2f".format(imc)
        }
    }
}