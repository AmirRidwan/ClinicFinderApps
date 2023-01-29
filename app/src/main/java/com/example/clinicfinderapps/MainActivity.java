package com.example.clinicfinderapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    CardView cardView1, cardView2, cardView3, cardView4;
    FirebaseAuth auth;
    FirebaseUser user;
    TextView profileText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        profileText = (TextView) findViewById(R.id.textView3);
        drawerLayout = findViewById(R.id.drawer_layout);
        cardView1 = findViewById(R.id.current_location);
        cardView2 = findViewById(R.id.clinic_near_me);
        cardView3 = findViewById(R.id.about_us);
        cardView4 = findViewById(R.id.logout);
        profileText.setText("Welcome " + user.getEmail() + "!");

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CurrentLocation.class);
                startActivity(intent);
                finish();
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ClinicNearMe.class);
                startActivity(intent);
                finish();
            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AboutUs.class);
                startActivity(intent);
                finish();
            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.signOut();
                finish();
                Intent i = new Intent(MainActivity.this, Login.class);
                startActivity(i);
            }
        });

    }

}