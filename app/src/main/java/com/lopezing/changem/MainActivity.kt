package com.lopezing.changem

import android.app.Activity
import android.os.Bundle
import com.lopezing.changem.databinding.ActivityMainBinding

class MainActivity : Activity() {
    private lateinit var mainBinding: ActivityMainBinding
    private var acum1=0.0
    private var imp=0.0
    //private var cant =1
    private var m1spinner="Dolar"
    private var m2spinner="Dolar"
    private fun conv(){
        when(m1spinner) {
            "Dolar" -> {
                if (m2spinner == "Peso Colombiano" || m2spinner == "Colombian peso") acum1 = 3800.0
                if (m2spinner == "Dolar") acum1 = 1.0
                if (m2spinner == "Peso Mexicano" || m2spinner == "Mexican peso") acum1 = 20.0
            }
            "Peso Colombiano" -> {
                if (m2spinner == "Peso Colombiano" || m2spinner == "Colombian peso") acum1 = 1.0
                if (m2spinner == "Dolar") acum1 = 0.00038
                if (m2spinner == "Peso Mexicano" || m2spinner == "Mexican peso") acum1 = 0.0050
            }
            "Peso Mexicano" -> {
                if (m2spinner == "Peso Colombiano" || m2spinner == "Colombian peso") acum1 = 194.23
                if (m2spinner == "Dolar") acum1 = 0.0501
                if (m2spinner == "Peso Mexicano" || m2spinner == "Mexican peso") acum1 = 1.0

            }
            "Mexican peso" -> {
                if (m2spinner == "Peso Colombiano" || m2spinner == "Colombian peso") acum1 = 194.23
                if (m2spinner == "Dolar") acum1 = 0.0501
                if (m2spinner == "Peso Mexicano" || m2spinner == "Mexican peso") acum1 = 1.0
            }
            "Colombian peso" -> {
                if (m2spinner == "Peso Colombiano" || m2spinner == "Colombian peso") acum1 = 194.23
                if (m2spinner == "Dolar") acum1 = 0.0501
                if (m2spinner == "Peso Mexicano" || m2spinner == "Mexican peso")acum1 = 1.0
            }
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)
        with(mainBinding){
            button.setOnClickListener {
                m1spinner=spinner.selectedItem.toString()
                m2spinner=spinner2.selectedItem.toString()
                val cant =textIn.text.toString()
                val cant1=cant.toDouble()
                conv()
                imp=(cant1*acum1)
                textView.text=imp.toString()
                //textView.text=m2spinner
            }
        }
    }
}