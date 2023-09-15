package com.example.birthdaywish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.buttomfirst);
        e1 = findViewById(R.id.inputName);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.black));
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String name = e1.getText().toString();
                Intent intent =  new Intent(MainActivity.this , BirthdayGreetingActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);

            }
        });
    }

}