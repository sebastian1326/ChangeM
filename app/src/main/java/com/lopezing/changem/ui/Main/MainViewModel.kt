package com.lopezing.changem.ui.Main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.contracts.Returns

class MainViewModel: ViewModel(){
    private var imp=0.0
    private var m1spinner="Dolar"
    private var m2spinner="Dolar"
    private var acum1=0.0
    private val counter:MutableLiveData<Double> = MutableLiveData()
    val counterdata: LiveData<Double> = counter


    fun datain(x: Double){
        counter.value=(x*acum1)

    }
     fun conv(x:String,y:String){
         m2spinner=y
         m1spinner=x
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
}