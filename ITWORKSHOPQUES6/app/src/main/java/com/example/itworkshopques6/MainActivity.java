package com.example.itworkshopques6;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float result = 0;
                if(Float.parseFloat(num1.getText().toString())==0 || Float.parseFloat(num2.getText().toString())==0)
                    Toast.makeText(MainActivity.this, "0 cannot be an input", Toast.LENGTH_SHORT).show();
                else
                {
                    result = Float.parseFloat(num1.getText().toString()) % Float.parseFloat(num2.getText().toString());
                    Toast.makeText(MainActivity.this, "Result : "+result, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}