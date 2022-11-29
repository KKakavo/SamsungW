package com.samsung.university;

import com.samsung.model.Student;
import com.samsung.model.Teacher;

public class DomoService extends University{
    University university;
    public void demo(){
        Teacher[] teachers = new Teacher[3];
        String[] disciplines = new String[2];
        disciplines[0] = "Алгебра";
        disciplines[1] = "Геометрия";

        teachers[0] = new Teacher(
                "Олег",
                "Папушин",
                "Павлович",
                disciplines
        );
        disciplines = new String[2];
        disciplines[0] = "Русский язык";
        disciplines[1] = "Литература";
        teachers[1] = new Teacher(
                "Ольга",
                "Чичкина",
                "Олеговна",
                "88005553535",
                disciplines
        );
        disciplines = new String[3];
        disciplines[0] = "Физика";
        disciplines[1] = "Информатика";
        disciplines[2] = "Инженерный практикум";

        teachers[2] = new Teacher(
                "Сергей",
                "Локтев",
                "Владимирович",
                "88005553536",
                disciplines
        );

        Student[] students = new Student[10];
        students[0] = new Student(
                "Андрей",
                "Павлов",
                "Андреевич",
                10
        );
        students[1] = new Student(
                "Владислав",
                "Силохин",
                "Александрович",
                "3278237876234467256785234",
                10
        );
        students[2] = new Student(
                "Максим",
                "Царапкин",
                "Владиславович",
                "3672787931123",
                10
        );
        university = new University(teachers,students);
        university.printInfo();
    }
}
