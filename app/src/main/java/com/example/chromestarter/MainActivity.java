package com.example.chromestarter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            Uri address = Uri.parse("https://www.google.ru");
            Intent open = new Intent(Intent.ACTION_VIEW, address);
            if (open.resolveActivity(getPackageManager()) != null) {
                startActivity(open);
            }
        });
    }
}