package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity2 extends AppCompatActivity {
    Integer sumFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView text1 = findViewById(R.id.textView2);
                Integer sum = Integer.parseInt((String) text1.getText());
                sum ++;
                text1.setText(String.valueOf(sum));
                sumFinal = sum;
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent testIntent = new Intent(getApplicationContext(), MainActivity3.class);
                testIntent.putExtra("sum",sumFinal);
                startActivity(testIntent);
            }
        });


    }
}