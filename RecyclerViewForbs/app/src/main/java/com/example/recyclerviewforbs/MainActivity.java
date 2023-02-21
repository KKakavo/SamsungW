package com.example.recyclerviewforbs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.example.recyclerviewforbs.adapter.RecyclerAdapter;
import com.example.recyclerviewforbs.model.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Person> personList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        recyclerView = findViewById(R.id.rvPersons);
        recyclerView.setAdapter(new RecyclerAdapter(personList, LayoutInflater.from(this),this));
    }
    private void init(){
        personList = new ArrayList<>();
        personList.add(new Person("Bernard Arnault", "$212.0 B"));
        personList.add(new Person("Elon Musk", "$198.2 B"));
        personList.add(new Person("Jeff Bezos", "$120.4 B"));
        personList.add(new Person("Larry Ellison", "$112.3 B"));
        personList.add(new Person("Warren Buffett", "$107.3 B"));
        personList.add(new Person("Bill Gates", "$107.0 B"));
        personList.add(new Person("Carlos Slim", "$90.7 B"));
        personList.add(new Person("Mukesh Ambani", "$85.7 B"));
        personList.add(new Person("Steve Ballmer", "$83.1 B"));
        personList.add(new Person("Larry Page", "$82.0 B"));
    }
}