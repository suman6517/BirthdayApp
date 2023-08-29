package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        t1 = findViewById(R.id.textViewbirthday);

        String value = getIntent().getStringExtra("name");

        if (value != null)
        {
            t1.setText(value);
        }
    }
}