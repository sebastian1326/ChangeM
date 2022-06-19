package com.lopezing.changem.ui.Main

//import android.app.Activity
//import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
//import androidx.lifecycle.ViewModelStoreOwner
import com.lopezing.changem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: MainViewModel
    private lateinit var mainBinding: ActivityMainBinding
//    private var acum1=0.0
    private var m1spinner="Dolar"
    private var m2spinner="Dolar"
    //private var cant =1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        mainViewModel= ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.counterdata.observe(this,{counter->
            mainBinding.textView.text=counter.toString()
        })
        setContentView(view)
        with(mainBinding){
            button.setOnClickListener {
                m1spinner=spinner.selectedItem.toString()
                m2spinner=spinner2.selectedItem.toString()
                val cant =textIn.text.toString()
                val cant1=cant.toDouble()
                mainViewModel.conv(m1spinner,m2spinner)
                mainViewModel.datain(cant1)
                //textView.text=imp1.toString()
                //textView.text=m2spinner
            }
        }
    }
}