package com.example.recyclerviewforbs.adapter;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewforbs.R;
import com.example.recyclerviewforbs.model.Person;


import java.util.List;
import java.util.zip.Inflater;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final List<Person> persons;
    private final LayoutInflater inflater;
    Context context;
    public RecyclerAdapter(List<Person> persons, LayoutInflater inflater, Context context) {
        this.persons = persons;
        this.inflater = inflater;
        this.context = context;
    }
    private class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvName;
        private TextView tvBalance;
        private LinearLayout llItem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvBalance = itemView.findViewById(R.id.tvBalance);
            llItem = itemView.findViewById(R.id.rvItem);
        }

    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.person_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Person person = persons.get(position);
        ((ViewHolder)holder).tvName.setText(person.getName());
        ((ViewHolder)holder).tvBalance.setText(person.getBalance());

        ((ViewHolder)holder).llItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = persons.get(position).getName();
                String url = "https://www.google.ru/search?q=" + name.replace(" ", "+");
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}
