package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreetingActivity extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greeting);

        t1 = findViewById(R.id.textViewbirthday);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(BirthdayGreetingActivity.this,R.color.black));
        }

        String value = getIntent().getStringExtra("name");

        if (value != null)
        {
            t1.setText(value);
        }
    }
}