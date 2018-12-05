package at.raithand17.ue4_viewsandactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import beans.Student

class StudentDatabase : AppCompatActivity() {

    private val list = ArrayList<Student>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_database)
    }

    fun createStudent(v : View)
    {
        val newStudent = Student(
            findViewById<EditText>(R.id.input_name).text.toString(),
            findViewById<EditText>(R.id.input_semester).text.toString().toInt()
        )
        list.add(newStudent)
    }


    override fun onStart() {
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
