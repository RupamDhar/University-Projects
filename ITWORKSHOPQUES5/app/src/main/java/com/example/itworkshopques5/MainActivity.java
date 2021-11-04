package com.example.itworkshopques5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        TextView capital = (TextView) findViewById(R.id.captialDisplay);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch (checkedId)
                {
                    case R.id.india:
                        capital.setText("Delhi");
                        break;
                    case R.id.nZealand:
                        capital.setText("Wellington");
                        break;
                    case R.id.autralia:
                        capital.setText("Camberra");
                        break;
                    case R.id.sAfrica:
                        capital.setText("Cape Town");
                        break;
                    case R.id.england:
                        capital.setText("London");
                        break;
                }
            }
        });
    }
}