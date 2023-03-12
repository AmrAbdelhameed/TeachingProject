package com.example.teachingproject;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView welcomeText = findViewById(R.id.welcomeTextView);
//        EditText editTextView = findViewById(R.id.editTextView);
//        Button button = findViewById(R.id.button_to_add);
//
//        button.setOnClickListener(view -> {
//            String result = editTextView.getText().toString();
//            welcomeText.setText(result);
//        });
    }
}