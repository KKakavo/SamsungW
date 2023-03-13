package com.example.cclasswork020323.dao;

import com.example.cclasswork020323.model.Student;

import java.util.List;

public interface StudentDao {

    long insert(Student student);
    List<Student> findAll();
    Student findById(long id);
    int update(long id, Student student);
    int deleteById(long id);

}
