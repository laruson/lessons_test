package com.gmail.kishkevich.superArh.presentation.utils.recycler

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gmail.kishkevich.domain.entity.Student
import com.gmail.kishkevich.presentation.R
import com.gmail.kishkevich.superArh.presentation.utils.picasso.PicturesAdapter
import kotlinx.android.synthetic.main.item_student.view.*

class StudentListAdapter( var onItemClick: (Student) -> Unit) : RecyclerView.Adapter<StudentListAdapter.Holder>() {
    private var students: List<Student> = emptyList()


    fun setStudents(students: List<Student>){
        this.students = students
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_student, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val student = students[position]
        holder.bind(student)

//        holder.nameText.text = student.name
//        holder.surNameText.text = student.surName
//        holder.ageText.text = student.age.toString()
//        pictureAdapter.setImage(url, holder.image, holder.progress)

        holder.itemView.setOnClickListener{
            onItemClick(student)
        }
    }

    override fun getItemCount(): Int = students.size

    inner class Holder(view: View) : RecyclerView.ViewHolder(view) {
        private val url="https://lukecollinsblog.files.wordpress.com/2012/01/1310563843-31.jpg"
        private val pictureAdapter = PicturesAdapter()
//
//        var idText = ObservableField<String>()
//        var nameText = ObservableField<String>()
//        var ageText = ObservableInt()
//        var image = ObservableField<String>(url)

        fun bind(student: Student){
            itemView.idText.text = student.id
            itemView.nameText.text = student.name
            itemView.ageText.text = student.age.toString()
            itemView.imageItem.setImageResource(R.drawable.sova_anmation_1)
            pictureAdapter.setImage(url,itemView.imageItem, itemView.progressItem)


        }

//        var nameText: TextView = view.findViewById(R.id.nameItem)
//        var surNameText: TextView = view.findViewById(R.id.surnameItem)
//        var ageText: TextView = view.findViewById(R.id.ageItem)
//        var image : ImageView = view.findViewById(R.id.imageItem)
//        var progress : ProgressBar = view.findViewById(R.id.progressItem)

    }
}