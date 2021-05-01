package com.example.loginapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class menuActivity extends AppCompatActivity {

    TextView privacyStatement;
    Button bookMuse, viewMuse, orderingBtn, souvBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        privacyStatement = findViewById(R.id.privacyStatement);
        bookMuse = findViewById(R.id.bookMuse);
        viewMuse = findViewById(R.id.viewMuse);
        orderingBtn = findViewById(R.id.orderingBtn);
        souvBtn = findViewById(R.id.souvBtn);

        privacyStatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), webAppView.class);
                startActivity(intent);
                finish();
            }
        });

        bookMuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), viewingMuse.class);
                startActivity(intent);
                finish();
            }
        });

        viewMuse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), viewingMuse.class);
                startActivity(intent);
                finish();
            }
        });

        orderingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), foodOrder.class);
                startActivity(intent);
                finish();
            }
        });

        souvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), souvOrder.class);
                startActivity(intent);
                finish();
            }
        });

        // https://www.youtube.com/watch?v=Rb4x4-mT1Bo

    }
}