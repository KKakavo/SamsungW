package com.samsung.sr271222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.samsung.sr271222.products.Product;

import java.util.ArrayList;

public class FindActivity extends AppCompatActivity {
    private TextView info_tv;
    private EditText name_et;
    private Button get_bt;
    private ArrayList<Product> products;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        products = getIntent().getExtras().getParcelableArrayList("products");
        name_et = findViewById(R.id.name_et2);
        get_bt = findViewById(R.id.get_bt);
        info_tv = findViewById(R.id.info_tv);

        get_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index;
                if((index = Product.findByName(products,name_et.getText().toString()))!=-1)
                        info_tv.setText(products.get(index).toString());
                else
                    Toast.makeText(FindActivity.this,"Данный продукт не найден",Toast.LENGTH_LONG).show();
            }
        });
    }
}