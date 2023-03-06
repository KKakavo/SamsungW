package com.example.cclasswork020323.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.cclasswork020323.db.StudentDbOpenHelper;
import com.example.cclasswork020323.db.StudentReaderContract;
import com.example.cclasswork020323.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

    private final StudentDbOpenHelper openHelper;

    public StudentDaoImpl(Context context) {
        this.openHelper = new StudentDbOpenHelper(context);
        openHelper.onCreate(openHelper.getWritableDatabase());
    }

    @Override
    public long insert(Student student) {
        SQLiteDatabase sqLiteDatabase = openHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(
                StudentReaderContract.StudentEntry.COLUMN_NAME, student.getName()
        );
        contentValues.put(
                StudentReaderContract.StudentEntry.COLUMN_AGE, student.getAge()
        );
        contentValues.put(
                StudentReaderContract.StudentEntry.COLUMN_PHONE, student.getPhone()
        );
        contentValues.put(
                StudentReaderContract.StudentEntry.COLUMN_EMAIL, student.getEmail()
        );

        long insert = sqLiteDatabase.insert(
                StudentReaderContract.StudentEntry.TABLE_NAME,
                null,
                contentValues
        );
        sqLiteDatabase.close();
        return insert;
    }

    @Override
    public List<Student> findAll() {
        SQLiteDatabase sqLiteDatabase = openHelper.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.query(
                StudentReaderContract.StudentEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null
        );

        List<Student> studentList = new ArrayList<>();
        if(cursor.moveToFirst()){
            int id = cursor.getColumnIndex(StudentReaderContract.StudentEntry.COLUMN_ID);
            int name = cursor.getColumnIndex(StudentReaderContract.StudentEntry.COLUMN_NAME);
            int age = cursor.getColumnIndex(StudentReaderContract.StudentEntry.COLUMN_AGE);
            int phone = cursor.getColumnIndex(StudentReaderContract.StudentEntry.COLUMN_PHONE);
            int email = cursor.getColumnIndex(StudentReaderContract.StudentEntry.COLUMN_EMAIL);

            do{
                Student student = new Student(
                        cursor.getLong(id),
                        cursor.getString(name),
                        cursor.getInt(age),
                        cursor.getString(phone),
                        cursor.getString(email)
                );
                studentList.add(student);
            }while(cursor.moveToNext());
        }

        cursor.close();
        sqLiteDatabase.close();

        return studentList;

    }

    @Override
    public Student findById(long id) {

        SQLiteDatabase sqLiteDatabase = openHelper.getReadableDatabase();

        Cursor cursor = sqLiteDatabase.query(
                StudentReaderContract.StudentEntry.TABLE_NAME,
                null,
                StudentReaderContract.StudentEntry.COLUMN_ID + " = ?",
                new String[]{String.valueOf(id)},
                null,
                null,
                null
        );

        cursor.moveToFirst();

        int idIndex = cursor.getColumnIndex(StudentReaderContract.StudentEntry.COLUMN_ID);
        int nameIndex = cursor.getColumnIndex(StudentReaderContract.StudentEntry.COLUMN_NAME);
        int ageIndex = cursor.getColumnIndex(StudentReaderContract.StudentEntry.COLUMN_AGE);
        int phoneIndex = cursor.getColumnIndex(StudentReaderContract.StudentEntry.COLUMN_PHONE);
        int emailIndex = cursor.getColumnIndex(StudentReaderContract.StudentEntry.COLUMN_EMAIL);

        Student student = new Student(
                cursor.getLong(idIndex),
                cursor.getString(nameIndex),
                cursor.getInt(ageIndex),
                cursor.getString(phoneIndex),
                cursor.getString(emailIndex)
        );

        cursor.close();
        sqLiteDatabase.close();

        return student;

    }

    @Override
    public int update(long id, Student student) {

        SQLiteDatabase sqLiteDatabase = openHelper.getWritableDatabase();


        ContentValues contentValues = new ContentValues();
        contentValues.put(
                StudentReaderContract.StudentEntry.COLUMN_NAME, student.getName()
        );
        contentValues.put(
                StudentReaderContract.StudentEntry.COLUMN_AGE, student.getAge()
        );
        contentValues.put(
                StudentReaderContract.StudentEntry.COLUMN_PHONE, student.getPhone()
        );
        contentValues.put(
                StudentReaderContract.StudentEntry.COLUMN_EMAIL, student.getEmail()
        );


        return sqLiteDatabase.update(
                StudentReaderContract.StudentEntry.TABLE_NAME,
                contentValues,
                StudentReaderContract.StudentEntry.COLUMN_ID + " = ?",
                new String[]{String.valueOf(id)}
                );
    }

    @Override
    public int deleteById(int id) {

        SQLiteDatabase sqLiteDatabase = openHelper.getWritableDatabase();

        return sqLiteDatabase.delete(
                StudentReaderContract.StudentEntry.TABLE_NAME,
                StudentReaderContract.StudentEntry.COLUMN_ID + " = ?",
                new String[]{String.valueOf(id)}
        );

    }
}
