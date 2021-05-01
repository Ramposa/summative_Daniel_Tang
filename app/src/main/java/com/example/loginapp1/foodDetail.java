package com.example.loginapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class foodDetail extends AppCompatActivity {

    TextView  listView, priceView;
    String list_choice;
    Double price_bd, price_gdp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

        listView = (TextView) findViewById(R.id.listView);
        priceView = (TextView) findViewById(R.id.priceView);

        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price_bd = bundle.getDouble("price");


        listView.setText(list_choice);
        priceView.setText("£" + price_bd.toString());


    }

    public void returnHome(View view){
        Intent intent = new Intent(getApplicationContext(), menuActivity.class);
        startActivity(intent);
        finish();
    }
}