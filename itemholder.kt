package com.example.mvvm
import android.view.View
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(student: Student) {
       val studentnam = itemView.findViewById<TextView>(R.id.t2)
        val studentdeg = itemView.findViewById<TextView>(R.id.t3)
        studentnam.text=student.name
        studentdeg.text= student.deg.toString()

    }


}
