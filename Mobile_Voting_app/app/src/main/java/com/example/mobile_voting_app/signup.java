package com.example.mobile_voting_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class signup extends AppCompatActivity {

    private EditText fullname_et,address_et,age_et,emailAdd_et,password_et,confirmpass_et;
    private TextView tvStatus;
    private Button btnRegister;
    private String URL="http://10.0.2.2/voting_app/LoginRegister/register.php";
    //private String URL="http://alarciotrading.000webhostapp.com/register.php";
    private String name, address, age, email, password, reenterPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fullname_et = findViewById(R.id.fullname_et);
        address_et = findViewById(R.id.address_et);
        age_et = findViewById(R.id.age_et);
        emailAdd_et = findViewById(R.id.emailAdd_et);
        password_et = findViewById(R.id.password_et);
        confirmpass_et = findViewById(R.id.confirmpass_et);
        tvStatus = findViewById(R.id.tvStatus);
        btnRegister = findViewById(R.id.btnRegister);
        name = address = age = email = password = reenterPassword = "";
    }

    public void save(View view) {

        name = fullname_et.getText().toString().trim();
        address = address_et.getText().toString().trim();
        age = age_et.getText().toString().trim();
        email = emailAdd_et.getText().toString().trim();
        password = password_et.getText().toString().trim();
        reenterPassword = confirmpass_et.getText().toString().trim();

        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(address) || TextUtils.isEmpty(age) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password) || TextUtils.isEmpty(reenterPassword)) {
            Toast.makeText(this, "Fields cannot be empty!",Toast.LENGTH_SHORT).show();
        }
        if (!reenterPassword.equals(password)) {
            Toast.makeText(this, "Password did not match.",Toast.LENGTH_SHORT).show();
        }
        else if (!name.equals("") && !address.equals("") && !age.equals("") && !email.equals("") && !password.equals("")) {
            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    if (response.equals("success")) {
//                        tvStatus.setText("Successfully registered.");
//                        btnRegister.setClickable(false);
                        Intent intent = new Intent(signup.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    } else if (response.equals("failure")) {
                        tvStatus.setText("Something went wrong!");
                    }
                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    Toast.makeText(getApplicationContext(),  error.toString().trim(), Toast.LENGTH_SHORT).show();
                }
            }){
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> data = new HashMap<>();
                    data.put("FullName", name);
                    data.put("Email_Address", email);
                    data.put("Address", address);
                    data.put("Age", age);
                    data.put("Password", password);
                    return data;
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
            requestQueue.add(stringRequest);
        }
    }

    public void login(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}