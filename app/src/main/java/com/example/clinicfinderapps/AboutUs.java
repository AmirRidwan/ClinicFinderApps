package com.example.clinicfinderapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AboutUs extends AppCompatActivity {

    CardView cardView1, cardView2, cardView3, cardView4, cardView5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        cardView1 = findViewById(R.id.Amir);
        cardView2 = findViewById(R.id.Farhan);
        cardView3 = findViewById(R.id.Syed);
        cardView4 = findViewById(R.id.Zuhdi);
        cardView5 = findViewById(R.id.Khidir);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Amir.class);
                startActivity(intent);
                finish();
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Farhan.class);
                startActivity(intent);
                finish();
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Syed.class);
                startActivity(intent);
                finish();
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Zuhdi.class);
                startActivity(intent);
                finish();
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Khidir.class);
                startActivity(intent);
                finish();
            }
        });

    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

}