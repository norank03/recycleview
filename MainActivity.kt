package com.example.mvvm



import android.os.Bundle

import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private val mViewModel by viewModels<DataViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recycler = findViewById<RecyclerView>(R.id.recyclerView)
         val adapter =Adapter(mutableListOf())
        recycler.adapter =adapter
        mViewModel.Datalivest.observe(this){
            adapter.update(it)
        }


     val button1 = findViewById<ImageButton>(R.id.im2)
        val button2 =findViewById<ImageButton>(R.id.im3)
        val button3= findViewById<ImageButton>(R.id.im1)
        val data1 =findViewById<EditText>(R.id.textInputEditText2)
        val data2 =findViewById<EditText>(R.id.textInputEditText)
        button1.setOnClickListener{
            val send1 =data1.text.toString()
            val send2 = data2.text.toString()

           val stdata = Student()
            stdata.name=send1
            stdata.deg=send2.toInt()

            mViewModel.addData(stdata)
        }




    }


}
