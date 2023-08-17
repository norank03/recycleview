package com.example.mvvm


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData


import androidx.recyclerview.widget.RecyclerView


  class Adapter(val data:MutableList<Student>) : RecyclerView.Adapter<ItemViewHolder>() {

      private lateinit var st :MutableList<List<Student>>

      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
          val view =
              LayoutInflater.from(parent.context).inflate(R.layout.recycleviewcard, parent, false)
          return ItemViewHolder(view)
      }

      override fun onBindViewHolder(
          holder: ItemViewHolder,
          position: Int,


      ) {
        holder.bind(data[position])


      }


      override fun getItemCount(): Int {
          return data.size
      }

    fun update(students: List<Student>) {




        st?.let{

                st.add(students)


          }



    }




  }




