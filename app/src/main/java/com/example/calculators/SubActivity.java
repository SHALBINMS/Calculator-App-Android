package com.example.calculators;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {

    Button bt7,bt8;
    EditText et3,et4;
    Integer num1,num2,sum;
    String getNum1,getNum2,Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        bt7=(Button) findViewById(R.id.backtobtn);
        bt8=(Button) findViewById(R.id.minusbtn);
        et3=(EditText)findViewById(R.id.subone);
        et4=(EditText)findViewById(R.id.subtwo);

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob2);
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=et3.getText().toString();
                getNum2=et4.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sum=num1-num2;
                Result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(),Result,Toast.LENGTH_LONG).show();
            }
        });

    }
}