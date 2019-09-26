package com.example.a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.next_bt);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_select_activity();
            }
        });
    }

    public void open_select_activity(){

        Intent intent = new Intent(this, select.class);
        startActivity(intent);


    }
}
