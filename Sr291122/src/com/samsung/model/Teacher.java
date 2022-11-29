package com.samsung.model;

public class Teacher extends User implements Printer{
    private String[] disciplines;

    public Teacher(String name, String surname, String patronymic, String phoneNum, String[] disciplines) {
        super(name, surname, patronymic, phoneNum);
        this.disciplines = disciplines;
    }

    public Teacher(String name, String surname, String patronymic, String[] disciplines) {
        super(name, surname, patronymic);
        this.disciplines = disciplines;
    }

    public Teacher(Teacher teacher){
        super(teacher.name, teacher.surname, teacher.patronymic, teacher.phoneNum);
        this.disciplines = teacher.disciplines;
    }

    @Override
    public void sayHello() {
        System.out.print("Hello! I am teacher, my name is ");
        System.out.println(this.name);
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
        System.out.print("Дисциплины: ");
        for (int i = 0; i < disciplines.length - 1; i++) {
            System.out.print(disciplines[i]);
            System.out.print(", ");
        }
        System.out.println(disciplines[disciplines.length - 1]);
        System.out.println();
    }
}
