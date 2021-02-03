package com.example.mobile_voting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.UriMatcher;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //button variables
    Button signup_btn,login_btn;
    //edit text variables
    private EditText email_et, pass_et;
    private String email, password;
    private String URL="http://10.0.2.2/voting_app/LoginRegister/login.php";
    //private String URL="http://alarciotrading.000webhostapp.com/login.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = password = "";
        email_et = findViewById(R.id.email_et);
        pass_et = findViewById(R.id.pass_et);
    }

    public void login(View view) {
        email = email_et.getText().toString().trim();
        password = pass_et.getText().toString().trim();
        if (!email.equals("") && !password.equals("")) {
            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    if (response.equals("success")) {
                        Intent intent = new Intent(MainActivity.this, Success.class);
                        startActivity(intent);
                        finish();
                    } else if (response.equals("failure")) {
                        Toast.makeText(MainActivity.this, "Invalid Email or Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(MainActivity.this,  error.toString().trim(), Toast.LENGTH_SHORT).show();
                }
            }){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> data = new HashMap<>();
                    data.put("Email_Address", email);
                    data.put("Password", password);
                    return data;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
            requestQueue.add(stringRequest);
        } else {
            Toast.makeText(this, "Fields cannot be empty!", Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View view) {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
        finish();
    }


}