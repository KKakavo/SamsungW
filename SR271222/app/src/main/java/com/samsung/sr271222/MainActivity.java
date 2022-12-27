package com.samsung.sr271222;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.samsung.sr271222.products.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText name_et, date_et, count_et, cost_et;
    private Button add_bt,find_bt;
    private List<Product> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        products = new ArrayList<>();
        name_et = findViewById(R.id.name_et);
        date_et = findViewById(R.id.date_et);
        count_et = findViewById(R.id.count_et);
        cost_et = findViewById(R.id.cost_et);
        add_bt = findViewById(R.id.add_bt);
        find_bt = findViewById(R.id.find_bt);
        add_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Product.findByName(products,name_et.getText().toString()) != -1) {
                    Toast.makeText(MainActivity.this, "Данный продукт уже добавлен", Toast.LENGTH_LONG).show();
                }
                else
                    products.add( new Product(
                        name_et.getText().toString(),
                        date_et.getText().toString(),
                        Integer.parseInt(count_et.getText().toString()),
                        Integer.parseInt(cost_et.getText().toString())
                ));
                }
            }
        );
        find_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,FindActivity.class);
                Bundle bundle= new Bundle();
                bundle.putParcelableArrayList("products", (ArrayList<? extends Parcelable>) products);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}