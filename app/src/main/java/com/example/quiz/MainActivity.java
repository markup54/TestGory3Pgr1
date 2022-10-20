package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button sprawdzButton;
    RadioGroup radioGroup;
    Button pomocButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sprawdzButton = findViewById(R.id.button);
        pomocButton = findViewById(R.id.button2);
        radioGroup = findViewById(R.id.radioGroup);
        pomocButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencja = new Intent(MainActivity.this,
                        PomocActivity.class);
                startActivity(intencja);
            }
        });
        sprawdzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int kliknietyRadioId = radioGroup.getCheckedRadioButtonId();
                if(kliknietyRadioId == R.id.radioButton2){
                    Toast.makeText(MainActivity.this,
                            "Prawidłowa odpowiedź",
                            Toast.LENGTH_SHORT)
                            .show();
                }
                else{
                    Toast.makeText(MainActivity.this,
                            "Zła odpowiedź",
                            Toast.LENGTH_SHORT)
                            .show();
                }
            }
        });
    }
}