package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;
    TextView res ,email,pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);

        res=findViewById(R.id.res);
        email=findViewById(R.id.email);
        pwd=findViewById(R.id.pass);
    }

    public void Message(View view) {
            res.setText("Successfully Login");
    }

    public void Cancel(View view) {
        res.setText("Login Failed");
    }
}