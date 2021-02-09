package com.example.votingapp_admin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class home_screen extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference reference;

    TextView pres1_count;
    int pres1_sum = 0;
    TextView pres2_count;
    int pres2_sum = 0;
    TextView vicepres1_count;
    int vicepres1_sum = 0;
    TextView vicepres2_count;
    int vicepres2_sum = 0;
    TextView sec1_count;
    int sec1_sum = 0;
    TextView sec2_count;
    int sec2_sum = 0;
    TextView subSec1_count;
    int subSec1_sum = 0;
    TextView subSec2_count;
    int subSec2_sum = 0;
    TextView tres1_count;
    int tres1_sum = 0;
    TextView tres2_count;
    int tres2_sum = 0;
    TextView subTres1_count;
    int subTres1_sum = 0;
    TextView subTres2_count;
    int subTres2_sum = 0;
    TextView pio1_count;
    int pio1_sum = 0;
    TextView pio2_count;
    int pio2_sum = 0;
    TextView pio3_count;
    int pio3_sum = 0;
    TextView auditor1_count;
    int auditor1_sum = 0;
    TextView auditor2_count;
    int auditor2_sum = 0;
    TextView auditor3_count;
    int auditor3_sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        reference = database.getReference("President_1");
        reference.keepSynced(true);

        pres1_count = findViewById(R.id.pres1_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    pres1_sum = (int)dataSnapshot.getChildrenCount();
                    pres1_count.setText(Integer.toString(pres1_sum)+ " votes");
                }
                else {
                    pres1_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("President_2");
        reference.keepSynced(true);

        pres2_count = findViewById(R.id.pres2_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    pres2_sum = (int)dataSnapshot.getChildrenCount();
                    pres2_count.setText(Integer.toString(pres2_sum)+ " votes");
                }
                else {
                    pres2_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("VicePresident_1");
        reference.keepSynced(true);

        vicepres1_count = findViewById(R.id.vicepres1_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    vicepres1_sum = (int)dataSnapshot.getChildrenCount();
                    vicepres1_count.setText(Integer.toString(vicepres1_sum)+ " votes");
                }
                else {
                    vicepres1_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("VicePresident_2");
        reference.keepSynced(true);

        vicepres2_count = findViewById(R.id.vicepres2_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    vicepres2_sum = (int)dataSnapshot.getChildrenCount();
                    vicepres2_count.setText(Integer.toString(vicepres2_sum)+ " votes");
                }
                else {
                    vicepres2_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("Secretary_1");
        reference.keepSynced(true);

        sec1_count = findViewById(R.id.sec1_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    sec1_sum = (int)dataSnapshot.getChildrenCount();
                    sec1_count.setText(Integer.toString(sec1_sum)+ " votes");
                }
                else {
                    sec1_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("Secretary_2");
        reference.keepSynced(true);

        sec2_count = findViewById(R.id.sec2_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    sec2_sum = (int)dataSnapshot.getChildrenCount();
                    sec2_count.setText(Integer.toString(sec2_sum)+ " votes");
                }
                else {
                    sec2_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("SubSecretary_1");
        reference.keepSynced(true);

        subSec1_count = findViewById(R.id.subSec1_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    subSec1_sum = (int)dataSnapshot.getChildrenCount();
                    subSec1_count.setText(Integer.toString(subSec1_sum)+ " votes");
                }
                else {
                    subSec1_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("SubSecretary_2");
        reference.keepSynced(true);

        subSec2_count = findViewById(R.id.subSec2_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    subSec2_sum = (int)dataSnapshot.getChildrenCount();
                    subSec2_count.setText(Integer.toString(subSec2_sum)+ " votes");
                }
                else {
                    subSec2_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("Treasurer_1");
        reference.keepSynced(true);

        tres1_count = findViewById(R.id.tres1_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    tres1_sum = (int)dataSnapshot.getChildrenCount();
                    tres1_count.setText(Integer.toString(tres1_sum)+ " votes");
                }
                else {
                    tres1_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("Treasurer_2");
        reference.keepSynced(true);

        tres2_count = findViewById(R.id.tres2_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    tres2_sum = (int)dataSnapshot.getChildrenCount();
                    tres2_count.setText(Integer.toString(tres2_sum)+ " votes");
                }
                else {
                    tres2_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("SubTreasurer_1");
        reference.keepSynced(true);

        subTres1_count = findViewById(R.id.subTres1_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    subTres1_sum = (int)dataSnapshot.getChildrenCount();
                    subTres1_count.setText(Integer.toString(subTres1_sum)+ " votes");
                }
                else {
                    subTres1_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("SubTreasurer_2");
        reference.keepSynced(true);

        subTres2_count = findViewById(R.id.subTres2_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    subTres2_sum = (int)dataSnapshot.getChildrenCount();
                    subTres2_count.setText(Integer.toString(subTres2_sum)+ " votes");
                }
                else {
                    subTres2_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("PIO_1");
        reference.keepSynced(true);

        pio1_count = findViewById(R.id.pio1_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    pio1_sum = (int)dataSnapshot.getChildrenCount();
                    pio1_count.setText(Integer.toString(pio1_sum)+ " votes");
                }
                else {
                    pio1_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("PIO_2");
        reference.keepSynced(true);

        pio2_count = findViewById(R.id.pio2_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    pio2_sum = (int)dataSnapshot.getChildrenCount();
                    pio2_count.setText(Integer.toString(pio2_sum)+ " votes");
                }
                else {
                    pio2_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("PIO_3");
        reference.keepSynced(true);

        pio3_count = findViewById(R.id.pio3_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    pio3_sum = (int)dataSnapshot.getChildrenCount();
                    pio3_count.setText(Integer.toString(pio3_sum)+ " votes");
                }
                else {
                    pio3_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("Auditor_1");
        reference.keepSynced(true);

        auditor1_count = findViewById(R.id.auditor1_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    auditor1_sum = (int)dataSnapshot.getChildrenCount();
                    auditor1_count.setText(Integer.toString(auditor1_sum)+ " votes");
                }
                else {
                    auditor1_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("Auditor_2");
        reference.keepSynced(true);

        auditor2_count = findViewById(R.id.auditor2_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    auditor2_sum = (int)dataSnapshot.getChildrenCount();
                    auditor2_count.setText(Integer.toString(auditor2_sum)+ " votes");
                }
                else {
                    auditor2_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
        reference = database.getReference("Auditor_3");
        reference.keepSynced(true);

        auditor3_count = findViewById(R.id.auditor3_count);

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    auditor3_sum = (int)dataSnapshot.getChildrenCount();
                    auditor3_count.setText(Integer.toString(auditor3_sum)+ " votes");
                }
                else {
                    auditor3_count.setText("0 votes");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}