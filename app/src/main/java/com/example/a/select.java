package com.example.a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select extends AppCompatActivity {
    private Button simple,science;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        simple = findViewById(R.id.simple_bt);
        science = findViewById(R.id.science_bt);
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_simple_activity();
            }
        });
        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_science_activity();
            }
        });
    }
    public void open_simple_activity(){

        Intent intent = new Intent(this, simple_calc.class);
        startActivity(intent);


    }
    public void open_science_activity(){

        Intent intent = new Intent(this, scientific_calc.class);
        startActivity(intent);


    }
}
