package com.samsung.university;

import com.samsung.model.Printer;
import com.samsung.model.Student;
import com.samsung.model.Teacher;

public class University implements Printer {
    private Teacher[] teachers;
    private Student[] students;

    public University(Teacher[] teachers, Student[] students) {
        this.teachers = teachers;
        this.students = students;
    }

    public University() {}

    @Override
    public void printInfo() {
        System.out.println("Студенты:");
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null)
                break;
            students[i].printInfo();
        }
        System.out.println("##################\nПреподаватели:");
        for (int i = 0; i < teachers.length; i++) {
            if(teachers[i] == null)
                break;
            teachers[i].printInfo();
        }
    }
}
