package com.example.clinicfinderapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.webkit.WebView;

import android.os.Bundle;

public class Farhan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farhan);

        WebView webViewer = (WebView) findViewById(R.id.web);
        webViewer.loadUrl("file:///android_asset/www/paan.html");
    }
    @Override
    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), AboutUs.class);
        startActivity(intent);
        finish();
    }
}