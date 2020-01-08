package com.example.myapplicationisrael;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void movetomovie(View view) {
        Intent moveto = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=tcMMmXpw6d8"));
        startActivity(moveto);
    }
}
