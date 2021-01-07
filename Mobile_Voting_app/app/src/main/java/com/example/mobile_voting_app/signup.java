package com.example.mobile_voting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    TextView age_et,password_et,confirmpass_et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    age_et = findViewById(R.id.age_et);
    password_et = findViewById(R.id.password_et);
    confirmpass_et = findViewById(R.id.confirmpass_et);
    }

    public void signup_btn(View view) {
        int age = Integer.parseInt(age_et.getText().toString());
        String pass = password_et.getText().toString();
        String confirmpass = confirmpass_et.getText().toString();
        if (age < 18) {
            Toast.makeText(this,"Age below 18 is not allowed.",Toast.LENGTH_SHORT).show();
        }
        else if (!confirmpass.equals(pass)) {
            Toast.makeText(this, "Password did not match.",Toast.LENGTH_SHORT).show();
        }
    }
}