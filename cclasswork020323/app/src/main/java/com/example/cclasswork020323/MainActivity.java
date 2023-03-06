package com.example.cclasswork020323;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.example.cclasswork020323.adapter.StudentAdapter;
import com.example.cclasswork020323.dao.StudentDao;
import com.example.cclasswork020323.dao.StudentDaoImpl;
import com.example.cclasswork020323.model.Student;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText etName, etAge, etPhone, etEmail;

    private RecyclerView rvStudent;
    private StudentDao studentDao;

    private List<Student> studentList;
    StudentAdapter studentAdapter;

    private AppCompatButton btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentDao = new StudentDaoImpl(this);
        etName = findViewById(R.id.et_name);
        etAge = findViewById(R.id.et_age);
        etPhone = findViewById(R.id.et_phone);
        etEmail = findViewById(R.id.et_email);
        btnAdd = findViewById(R.id.btn_add);
        rvStudent = findViewById(R.id.rv_student);

        studentList = studentDao.findAll();
        studentAdapter = new StudentAdapter(studentList, LayoutInflater.from(this));
        rvStudent.setAdapter(studentAdapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student(
                        etName.getText().toString(),
                        Integer.parseInt(etAge.getText().toString()),
                        etPhone.getText().toString(),
                        etEmail.getText().toString());

                long id = studentDao.insert(student);
                student.setId(id);
                studentList.add(student);
                studentAdapter.notifyItemInserted(studentList.size());
            }
        });
    }
}