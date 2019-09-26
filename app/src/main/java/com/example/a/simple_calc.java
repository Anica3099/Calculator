package com.example.a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class simple_calc extends AppCompatActivity {
    private EditText n1,n2;
    private TextView res;
    private Button add,sub,mul,div,back,show;
    float result;
    float num1,num2;
    DatabaseReference reff;
    Member Member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calc);
        reff=FirebaseDatabase.getInstance().getReference().child("Member");
        n1 = findViewById(R.id.first_et);
        n2 = findViewById(R.id.second_et);
        res = findViewById(R.id.result_tv);
        add = findViewById(R.id.add_bt);
        show = findViewById(R.id.show_bt);
        sub = findViewById(R.id.sub_bt);
        mul = findViewById(R.id.mul_bt);
        div = findViewById(R.id.div_bt);
        back = findViewById(R.id.back_bt);
        Member = new Member();
        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //final DatabaseReference reff =database.getReference("Member");

        add.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1 = n1.getText().toString();
                snum2 = n2.getText().toString();

                if (snum1.isEmpty()) {
                    Toast.makeText(simple_calc.this, "No Number Entered in first field", Toast.LENGTH_SHORT).show();
                    return;
                } else if (snum2.isEmpty()) {
                    Toast.makeText(simple_calc.this, "No Number Entered in Second field", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1 = Integer.parseInt(snum1);
                num2 = Integer.parseInt(snum2);
                result = (float) num1 + num2;
                res.setText(String.valueOf(result));
                Member.setResult(result);
                reff.child("10").setValue(Member);
                Toast.makeText(simple_calc.this, "result inserted successfully", Toast.LENGTH_SHORT).show();
                return;


            }
        });
        div.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1 = n1.getText().toString();
                snum2 = n2.getText().toString();

                if (snum1.isEmpty()) {
                    Toast.makeText(simple_calc.this, "No Number Entered in first field", Toast.LENGTH_SHORT).show();
                    return;
                } else if (snum2.isEmpty()) {
                    Toast.makeText(simple_calc.this, "No Number Entered in Second field", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1 = Integer.parseInt(snum1);
                num2 = Integer.parseInt(snum2);
                result = (float) num1 / num2;
                res.setText(String.valueOf(result));
                Member.setResult(result);
                reff.child("10").setValue(Member);
                Toast.makeText(simple_calc.this, "result inserted successfully", Toast.LENGTH_SHORT).show();
                return;

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1 = n1.getText().toString();
                snum2 = n2.getText().toString();

                if (snum1.isEmpty()) {
                    Toast.makeText(simple_calc.this, "No Number Entered in first field", Toast.LENGTH_SHORT).show();
                    return;
                } else if (snum2.isEmpty()) {
                    Toast.makeText(simple_calc.this, "No Number Entered in Second field", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1 = Integer.parseInt(snum1);
                num2 = Integer.parseInt(snum2);
                result = (float) num1 - num2;
                res.setText(String.valueOf(result));
                Member.setResult(result);
                reff.child("10").setValue(Member);
                Toast.makeText(simple_calc.this, "result inserted successfully", Toast.LENGTH_SHORT).show();
                return;

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String snum1, snum2;
                snum1 = n1.getText().toString();
                snum2 = n2.getText().toString();

                if (snum1.isEmpty()) {
                    Toast.makeText(simple_calc.this, "No Number Entered in first field", Toast.LENGTH_SHORT).show();
                    return;
                } else if (snum2.isEmpty()) {
                    Toast.makeText(simple_calc.this, "No Number Entered in Second field", Toast.LENGTH_SHORT).show();
                    return;
                }


                num1 = Integer.parseInt(snum1);
                num2 = Integer.parseInt(snum2);
                result = (float) num1 * num2;
                res.setText(String.valueOf(result));
                Member.setResult(result);
                reff.child("10").setValue(Member);
                Toast.makeText(simple_calc.this, "result inserted successfully", Toast.LENGTH_SHORT).show();
                return;

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_prev_activity();
            }
        });
    }
    public void open_prev_activity(){

        Intent intent = new Intent(this, select.class);
        startActivity(intent);


    }


}
