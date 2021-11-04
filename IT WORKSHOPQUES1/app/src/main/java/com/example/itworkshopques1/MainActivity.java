package com.example.itworkshopques1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nextButton = (Button) findViewById(R.id.nextBtn);
        EditText name = (EditText) findViewById(R.id.nameField);
        EditText rollNo = (EditText) findViewById(R.id.rollField);
        EditText section = (EditText) findViewById(R.id.sectionField);
        EditText clgName = (EditText) findViewById(R.id.clgNameField);
        EditText stream = (EditText) findViewById(R.id.streamField);

        nextButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String myName = name.getText().toString();
                String myRoll = rollNo.getText().toString();
                String mySec = section.getText().toString();
                String myClgName = clgName.getText().toString();
                String myStream = stream.getText().toString();

                Intent intent = new Intent(MainActivity.this, displayPage.class);
                intent.putExtra("MyName", myName);
                intent.putExtra("MyRoll", myRoll);
                intent.putExtra("MySec", mySec);
                intent.putExtra("MyClg", myClgName);
                intent.putExtra("MyStream", myStream);
                startActivity(intent);
            }
        });
    }
}