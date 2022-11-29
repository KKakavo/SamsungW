package com.samsung.model;

public class Student extends User implements Printer{
    private int group;

    public Student(String name, String surname, String patronymic, String phoneNum, int group) {
        super(name, surname, patronymic, phoneNum);
        this.group = group;
    }

    public Student(String name, String surname, String patronymic, int group) {
        super(name, surname, patronymic);
        this.group = group;
    }
    public Student(Student student){
        super(student.name, student.surname, student.patronymic, student.phoneNum);
        this.group = student.group;
    }
    @Override
    public void sayHello() {
        System.out.print("Hello! I am student, my name is ");
        System.out.println(name);
    }

    @Override
    public void printInfo() {
        System.out.print("Имя: ");
        System.out.println(this.name);
        System.out.print("Фамилия: ");
        System.out.println(surname);
        System.out.print("Отчество: ");
        System.out.println(patronymic);
        System.out.print("Номер телефона: ");
        System.out.println(phoneNum);
        System.out.print("Группа: ");
        System.out.println(group);
        System.out.println();
    }
}
