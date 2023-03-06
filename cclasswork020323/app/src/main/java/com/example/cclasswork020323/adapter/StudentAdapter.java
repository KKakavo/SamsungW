package com.example.cclasswork020323.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cclasswork020323.R;
import com.example.cclasswork020323.model.Student;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Student> studentList;

    private final LayoutInflater layoutInflater;

    public StudentAdapter(List<Student> studentList, LayoutInflater layoutInflater) {
        this.studentList = studentList;
        this.layoutInflater = layoutInflater;
    }

    private class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvId, tvName,
                tvAge, tvEmail, tvPhone;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            tvId = itemView.findViewById(R.id.tv_student_id);
            tvName = itemView.findViewById(R.id.tv_student_name);
            tvAge = itemView.findViewById(R.id.tv_student_age);
            tvPhone = itemView.findViewById(R.id.tv_student_phone);
            tvEmail = itemView.findViewById(R.id.tv_student_email);

        }
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.student_item, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Student student = studentList.get(position);

        ((ViewHolder)holder).tvId.setText(String.valueOf(student.getId()));

        ((ViewHolder)holder).tvName.setText(student.getName());

        ((ViewHolder)holder).tvAge.setText(String.valueOf(student.getAge()));

        ((ViewHolder)holder).tvPhone.setText(student.getPhone());

        ((ViewHolder)holder).tvEmail.setText(student.getEmail());


    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }
}
