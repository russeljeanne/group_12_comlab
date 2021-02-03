package com.example.mobile_voting_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Success extends AppCompatActivity {


    Button b;
    Member member;
    RadioButton chk_pres1,chk_pres2;
    RadioButton chk_vicePres1,chk_vicePres2;
    RadioButton chk_sec1,chk_sec2;
    RadioButton chk_subSec1,chk_subSec2;
    RadioButton chk_tres1,chk_tres2;
    RadioButton chk_subTres1,chk_subTres2;
    CheckBox chk_pio1,chk_pio2,chk_pio3;
    CheckBox chk_auditor1,chk_auditor2,chk_auditor3;
    FirebaseDatabase database;
    DatabaseReference reference;
    int i=0;
    EditText name;

    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        btnSubmit = findViewById(R.id.btnSubmitVote);

        b = findViewById(R.id.btnSubmitVote);
        member = new Member();
        chk_pres1 = findViewById(R.id.chk_pres1);
        chk_pres2 = findViewById(R.id.chk_pres2);
        chk_vicePres1 = findViewById(R.id.chk_vicePres1);
        chk_vicePres2 = findViewById(R.id.chk_vicePres2);
        chk_sec1 = findViewById(R.id.chk_sec1);
        chk_sec2 = findViewById(R.id.chk_sec2);
        chk_subSec1 = findViewById(R.id.chk_subSec1);
        chk_subSec2 = findViewById(R.id.chk_subSec2);
        chk_tres1 = findViewById(R.id.chk_tres1);
        chk_tres2 = findViewById(R.id.chk_tres2);
        chk_subTres1 = findViewById(R.id.chk_subTres1);
        chk_subTres2 = findViewById(R.id.chk_subTres2);
        chk_pio1 = findViewById(R.id.chk_pio1);
        chk_pio2 = findViewById(R.id.chk_pio2);
        chk_pio3 = findViewById(R.id.chk_pio3);
        chk_auditor1 = findViewById(R.id.chk_auditor1);
        chk_auditor2 = findViewById(R.id.chk_auditor2);
        chk_auditor3 = findViewById(R.id.chk_auditor3);
        name = findViewById(R.id.name_et);


        final String select_poi1_ST = "PIO 1";
        final String select_poi2_ST = "PIO 2";
        final String select_poi3_ST = "PIO 3";

        final String select_auditor1_ST = "Auditor 1";
        final String select_auditor2_ST = "Auditor 2";
        final String select_auditor3_ST = "Auditor 3";

        reference = database.getInstance().getReference().child("User");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    i = (int)dataSnapshot.getChildrenCount();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                ////
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String select_pres1_ST = chk_pres1.getText().toString();
                String select_pres2_ST = chk_pres2.getText().toString();
                String select_vicePres1_ST = chk_vicePres1.getText().toString();
                String select_vicePres2_ST = chk_vicePres2.getText().toString();
                String select_sec1_ST = chk_sec1.getText().toString();
                String select_sec2_ST = chk_sec2.getText().toString();
                String select_subSec1_ST = chk_subSec1.getText().toString();
                String select_subSec2_ST = chk_subSec2.getText().toString();
                String select_tres1_ST = chk_tres1.getText().toString();
                String select_tres2_ST = chk_tres2.getText().toString();
                String select_subtres1_ST = chk_subTres1.getText().toString();
                String select_subtres2_ST = chk_subTres2.getText().toString();

                member.setName(name.getText().toString());
                reference.child(String.valueOf(i+1)).setValue(member);
                if (chk_pres1.isChecked()) {
                    member.setSelected_pres(select_pres1_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_pres2.isChecked()){
                    member.setSelected_pres(select_pres2_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_vicePres1.isChecked()){
                    member.setSelected_vicePres(select_vicePres1_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_vicePres2.isChecked()){
                    member.setSelected_vicePres(select_vicePres2_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_sec1.isChecked()){
                    member.setSelected_sec(select_sec1_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_sec2.isChecked()){
                    member.setSelected_sec(select_sec2_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_subSec1.isChecked()){
                    member.setSelected_subSec(select_subSec1_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_subSec2.isChecked()){
                    member.setSelected_subSec(select_subSec2_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_tres1.isChecked()){
                    member.setSelected_tres(select_tres1_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_tres2.isChecked()){
                    member.setSelected_tres(select_tres2_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_subTres1.isChecked()){
                    member.setSelected_subTres(select_subtres1_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_subTres2.isChecked()){
                    member.setSelected_subTres(select_subtres2_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_pio1.isChecked()){
                    member.setSelected_PIO1(select_poi1_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_pio2.isChecked()){
                    member.setSelected_PIO2(select_poi2_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_pio3.isChecked()){
                    member.setSelected_PIO3(select_poi3_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_auditor1.isChecked()){
                    member.setSelected_Auditor1(select_auditor1_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_auditor2.isChecked()){
                    member.setSelected_Auditor2(select_auditor2_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_auditor3.isChecked()){
                    member.setSelected_Auditor3(select_auditor3_ST);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }

                else {
                    Toast.makeText(Success.this, "Complete your voting before submitting", Toast.LENGTH_SHORT).show();
                }

                Intent intent = new Intent(Success.this, Done.class);
                startActivity(intent);
                finish();
            }
        });
    }
}