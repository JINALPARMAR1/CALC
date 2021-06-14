package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button bt1,bt2,bt3,bt4;
    TextView txt;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText) findViewById(R.id.ed1);
        et2=(EditText)findViewById(R.id.ed2);
        bt1=(Button)findViewById(R.id.btn1);
        bt2=(Button)findViewById(R.id.btn2);
        bt3=(Button)findViewById(R.id.btn3);
        bt4=(Button)findViewById(R.id.btn4);


        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(et1.getText().toString());
                int num2 = Integer.parseInt(et2.getText().toString());
                int sum = num1 + num2;
                Toast.makeText(MainActivity.this,"Your answer is:"+sum,Toast.LENGTH_LONG).show();

            }

        });

        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(et1.getText().toString());
                int num2 = Integer.parseInt(et2.getText().toString());
                int sub = num1 - num2;
                Toast.makeText(MainActivity.this,"Your answer is:"+sub,Toast.LENGTH_LONG).show();

            }

        });

        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(et1.getText().toString());
                int num2 = Integer.parseInt(et2.getText().toString());
                int mul = num1 * num2;
                Toast.makeText(MainActivity.this,"Your answer is:"+mul,Toast.LENGTH_LONG).show();

            }

        });
        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(et1.getText().toString());
                int num2 = Integer.parseInt(et2.getText().toString());
                int div = num1 / num2;
                Toast.makeText(MainActivity.this,"Your answer is:"+div,Toast.LENGTH_LONG).show();

            }

        });

    }
}