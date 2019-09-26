package com.example.a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class scientific_calc extends AppCompatActivity {

    Button bsin,bcos,btan,bdot,res,pow,back,root;
    EditText ans;
    double var1,var2;
    boolean sin,cos,tan;
    float num1,result;
    String str="";
    DatabaseReference reff;
    sc sc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calc);
        bsin=(Button)findViewById(R.id.btnsin);
        bcos=(Button)findViewById(R.id.btncos);
        btan=(Button)findViewById(R.id.btntan);
        pow=(Button)findViewById(R.id.power_bt);
        root=(Button)findViewById(R.id.root_bt);
        back=(Button)findViewById(R.id.back_bt);
        reff= FirebaseDatabase.getInstance().getReference().child("sc");
        sc = new sc();
        //res =  findViewById(R.id.result);

        ans=  findViewById(R.id.answer);


        pow.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String snum1;
                snum1 = ans.getText().toString();
                if (snum1.isEmpty()) {
                    Toast.makeText(scientific_calc.this, "No Number Entered in the field", Toast.LENGTH_SHORT).show();
                    return;
                }
                num1 = Integer.parseInt(snum1);
                result = (float) num1 * num1;
                ans.setText(String.valueOf(result));
                sc.setResult(result);
                reff.child("10").setValue(sc);
                Toast.makeText(scientific_calc.this, "result inserted successfully", Toast.LENGTH_SHORT).show();
                return;


            }
        });

        root.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String snum1;
                snum1 = ans.getText().toString();
                    if (snum1.isEmpty()) {
                        Toast.makeText(scientific_calc.this, "No Number Entered in the field", Toast.LENGTH_SHORT).show();
                        return;
                    }
                num1 = Integer.parseInt(snum1);
                result=(float)Math.sqrt(num1);
                ans.setText(String.valueOf(result));
                sc.setResult(result);
                reff.child("10").setValue(sc);
                Toast.makeText(scientific_calc.this, "result inserted successfully", Toast.LENGTH_SHORT).show();
                return;

            }
        });

        bsin.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String snum1;
                snum1 = ans.getText().toString();
                if (snum1.isEmpty()) {
                    Toast.makeText(scientific_calc.this, "No Number Entered in the field", Toast.LENGTH_SHORT).show();
                    return;
                }
                num1 = Integer.parseInt(snum1);
                var1=Double.parseDouble(snum1);
                var2=(3.1415926535*var1)/180;
                ans.setText(String.valueOf(Math.sin(var2)));
                sc.setResult(Math.sin(var2));
                reff.child("10").setValue(sc);
                Toast.makeText(scientific_calc.this, "result inserted successfully", Toast.LENGTH_SHORT).show();
                return;

            }
        });

        bcos.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String snum1;
                snum1 = ans.getText().toString();
                if (snum1.isEmpty()) {
                    Toast.makeText(scientific_calc.this, "No Number Entered in the field", Toast.LENGTH_SHORT).show();
                    return;
                }
                num1 = Integer.parseInt(snum1);
                var1=Double.parseDouble(snum1);
                var2=(3.1415926535*var1)/180;
                ans.setText(String.valueOf(Math.cos(var2)));
                sc.setResult(result);
                reff.child("10").setValue(sc);
                Toast.makeText(scientific_calc.this, "result inserted successfully", Toast.LENGTH_SHORT).show();
                return;

            }
        });

        btan.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                String snum1;
                snum1 = ans.getText().toString();
                if (snum1.isEmpty()) {
                    Toast.makeText(scientific_calc.this, "No Number Entered in the field", Toast.LENGTH_SHORT).show();
                    return;
                }
                num1 = Integer.parseInt(snum1);
                var1=Double.parseDouble(snum1);
                var2=(3.1415926535*var1)/180;
                ans.setText(String.valueOf(Math.tan(var2)));
                sc.setResult(result);
                reff.child("10").setValue(sc);
                Toast.makeText(scientific_calc.this, "result inserted successfully", Toast.LENGTH_SHORT).show();
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


