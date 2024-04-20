package com.example.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingComponent
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.databindingexample.databinding.Activity2MainBinding
import com.example.databindingexample.databinding.ActivityMainBinding
/*    change-1
class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.user=User("Kanhaiya", "Kumar")
    }
}
*/
// change-2
class MainActivity : AppCompatActivity() {
    lateinit var binding:Activity2MainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_2_main)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        /*
        mainViewModel.quoteLiveData.observe(this) { quote ->
            binding.textTv.text = quote // Accessing text_tv using binding
        }
        binding.btn.setOnClickListener {
            mainViewModel.updateQuote()
        }
        */
        binding.lifecycleOwner=this
        binding.mainViewModel=mainViewModel
    }
}