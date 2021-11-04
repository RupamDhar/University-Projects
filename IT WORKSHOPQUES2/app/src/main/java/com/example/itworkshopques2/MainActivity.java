package com.example.itworkshopques2;

import androidx.annotation.IntegerRes;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
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

        EditText num1 = (EditText) findViewById(R.id.numInput1);
        EditText num2 = (EditText) findViewById(R.id.numInput2);
        Button button = (Button) findViewById(R.id.calcBtn);

        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                float numOne = Float.parseFloat(num1.getText().toString());
                float numTwo = Float.parseFloat(num2.getText().toString());

                if(numOne==0 || numTwo==0)
                    Toast.makeText(MainActivity.this, "Please give correct input", Toast.LENGTH_SHORT).show();
                else
                {
                    float result = (float) numOne/numTwo;
                    Intent intent = new Intent(MainActivity.this, displayPage.class);
                    intent.putExtra("Result", result);
                    startActivity(intent);
                }
            }
        });
    }
}