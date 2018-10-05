package com.example.user.lessons

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class StudentListAdapter(var onItemClick :(Student)-> Unit) : RecyclerView.Adapter<StudentListAdapter.Holder>() {
    var listData: List<Student> = emptyList()
        set(valuse) {
            field=valuse
            notifyDataSetChanged()
        }

//    var onItemClick : OnItemClick?=null
//    set(value){
//        field=value
//        notifyDataSetChanged()
//    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): Holder {
        Log.e("AAA", "onCreateViewHolder")
        var view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.item_recycler, viewGroup, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Log.e("AAA", "onBindViewHolder")

        val student = listData[position]
        holder.nameText.text = student.name
        holder.surnameText.text = student.surName

        holder.itemView.setOnClickListener {
            onItemClick(student)
        }

    }

    override fun getItemCount(): Int = listData.size


    inner class Holder : RecyclerView.ViewHolder {
        var nameText: TextView
        var surnameText: TextView

        constructor(view: View) : super(view) {
            nameText = view.findViewById(R.id.nameText)
            surnameText = view.findViewById(R.id.surnameText)
        }

    }

    interface OnItemClick{
        fun onClick(student : Student);
    }
}