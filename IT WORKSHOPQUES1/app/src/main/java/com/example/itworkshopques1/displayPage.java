package com.example.itworkshopques1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class displayPage extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_page);

        TextView nameView = (TextView) findViewById(R.id.nameDisplay);
        TextView rollView = (TextView) findViewById(R.id.rollDisplay);
        TextView secView = (TextView) findViewById(R.id.secDisplay);
        TextView clgView = (TextView) findViewById(R.id.clgDisplay);
        TextView streamView = (TextView) findViewById(R.id.streamDislpay);

        String name = getIntent().getStringExtra("MyName");
        String roll = getIntent().getStringExtra("MyRoll");
        String sec = getIntent().getStringExtra("MySec");
        String clg = getIntent().getStringExtra("MyClg");
        String stream = getIntent().getStringExtra("MyStream");

        nameView.setText("Name : "+name);
        rollView.setText("Roll No. : "+roll);
        secView.setText("Section : "+sec);
        clgView.setText("College Name : " + clg);
        streamView.setText("Stream : "+stream);
    }
}
