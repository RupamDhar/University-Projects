package com.example.itworkshopques3;

import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class displayPage extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_page);

        TextView textView = (TextView) findViewById(R.id.output);

        textView.setText(getIntent().getStringExtra("Username") + " gender is "+getIntent().getStringExtra("Gender"));
    }
}
