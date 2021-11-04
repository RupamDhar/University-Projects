package com.example.itworkshopques2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import org.w3c.dom.Text;
public class displayPage extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_page);

        TextView result = (TextView) findViewById(R.id.result);
        result.setText("Result : " + getIntent().getFloatExtra("Result", 0));
    }
}
