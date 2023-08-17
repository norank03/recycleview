package com.example.mvvm


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel: ViewModel() {





        val data = mutableListOf<Student>()
        private val dataofst= MutableLiveData<List<Student>>()
        val Datalivest =dataofst as LiveData<List<Student>>



        fun addData(sdata: Student) {
            data.add(sdata)

           dataofst.value = data
        }


        fun deletest(x: Student) {
            data.remove(x)

            dataofst.value = data
        }

        fun searchst(x: Student) {
           // data.filter {  }

            dataofst.value = data
        }






}
