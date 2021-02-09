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
    DatabaseReference reference,reference1,reference2,reference3,reference4,reference5,reference6,reference7,reference8,reference9,reference10,reference11,reference12,
            reference13,reference14,reference15,reference16,reference17,reference18;
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
        reference1 = database.getInstance().getReference().child("President_1");
        reference2 = database.getInstance().getReference().child("President_2");
        reference3 = database.getInstance().getReference().child("VicePresident_1");
        reference4 = database.getInstance().getReference().child("VicePresident_2");
        reference5 = database.getInstance().getReference().child("Secretary_1");
        reference6 = database.getInstance().getReference().child("Secretary_2");
        reference7 = database.getInstance().getReference().child("SubSecretary_1");
        reference8 = database.getInstance().getReference().child("SubSecretary_2");
        reference9 = database.getInstance().getReference().child("Treasurer_1");
        reference10 = database.getInstance().getReference().child("Treasurer_2");
        reference11 = database.getInstance().getReference().child("SubTreasurer_1");
        reference12 = database.getInstance().getReference().child("SubTreasurer_2");
        reference13 = database.getInstance().getReference().child("PIO_1");
        reference14 = database.getInstance().getReference().child("PIO_2");
        reference15 = database.getInstance().getReference().child("PIO_3");
        reference16 = database.getInstance().getReference().child("Auditor_1");
        reference17 = database.getInstance().getReference().child("Auditor_2");
        reference18 = database.getInstance().getReference().child("Auditor_3");

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
                    //member.setSelected_pres(select_pres1_ST);
                    reference1.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_pres2.isChecked()){
                    //member.setSelected_pres(select_pres2_ST);
                    reference2.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_vicePres1.isChecked()){
                    //member.setSelected_vicePres(select_vicePres1_ST);
                    reference3.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_vicePres2.isChecked()){
                    //member.setSelected_vicePres(select_vicePres2_ST);
                    reference4.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_sec1.isChecked()) {
                    //
                    reference5.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_sec2.isChecked()) {
                    //
                    reference6.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_subSec1.isChecked()) {
                    //
                    reference7.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_subSec2.isChecked()) {
                    //
                    reference8.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_tres1.isChecked()) {
                    //
                    reference9.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_tres2.isChecked()) {
                    //
                    reference10.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_subTres1.isChecked()) {
                    //
                    reference11.child(String.valueOf(i+1)).setValue(member);
                }
                else if (chk_subTres2.isChecked()) {
                    //
                    reference12.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_pio1.isChecked()) {
                    //
                    reference13.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_pio2.isChecked()) {
                    //
                    reference14.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_pio3.isChecked()) {
                    //
                    reference15.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_auditor1.isChecked()) {
                    //
                    reference16.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_auditor2.isChecked()) {
                    //
                    reference17.child(String.valueOf(i+1)).setValue(member);
                }
                if (chk_auditor3.isChecked()) {
                    //
                    reference18.child(String.valueOf(i+1)).setValue(member);
                }

                Intent intent = new Intent(Success.this, Done.class);
                startActivity(intent);
                finish();
            }
        });
    }
}