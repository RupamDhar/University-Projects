package com.example.itworkshopques4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    CheckBox pizza, momo, tacos, pepsi;
    ListView resultView;
    Button doneBtn;
    ArrayList<String> foodList;
    ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        pizza = findViewById(R.id.pizza);
        momo = findViewById(R.id.momo);
        tacos = findViewById(R.id.tacos);
        pepsi = findViewById(R.id.pepsi);

        doneBtn = findViewById(R.id.button);
        resultView = findViewById(R.id.chosenPrefs);
        foodList = new ArrayList<>();

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pizza.isChecked()) foodList.add(pizza.getText().toString());
                else foodList.remove(pizza.getText().toString());
            }
        });
        momo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(momo.isChecked()) foodList.add(momo.getText().toString());
                else foodList.remove(momo.getText().toString());
            }
        });
        tacos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tacos.isChecked()) foodList.add(tacos.getText().toString());
                else foodList.remove(tacos.getText().toString());
            }
        });
        pepsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pepsi.isChecked()) foodList.add(pepsi.getText().toString());
                else foodList.remove(pepsi.getText().toString());
            }
        });

        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(foodList.isEmpty())
                    Toast.makeText(MainActivity.this, "Choose a preference", Toast.LENGTH_SHORT).show();
                else
                {
                    arrayAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, foodList);
                    resultView.setAdapter(arrayAdapter);
                }
            }
        });
    }
}