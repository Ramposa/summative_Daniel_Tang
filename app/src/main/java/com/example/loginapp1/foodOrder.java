package com.example.loginapp1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class foodOrder extends AppCompatActivity {

    Button teaFunc, waterFunc, coffeeFunc, flatbreadFunc, sandwichFunc, sweetRollFunc, saladFunc, leaveFood;
    // Strings
    String choices = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_order);

        teaFunc = (Button) findViewById(R.id.teaFunc);
        waterFunc = (Button) findViewById(R.id.waterFunc);
        coffeeFunc = (Button) findViewById(R.id.coffeeFunc);
        flatbreadFunc = (Button) findViewById(R.id.flatbreadFunc);
        sandwichFunc = (Button) findViewById(R.id.sandwichFunc);
        sweetRollFunc = (Button) findViewById(R.id.sweetRollFunc);
        saladFunc = (Button) findViewById(R.id.saladFunc);
        leaveFood = (Button) findViewById(R.id.leaveFood);

        leaveFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void add_to_list(View view){
        if(view == findViewById(R.id.teaFunc)){
            choices = choices+"Tea"+"\n";
            price = price+1.00;
        }
        else if(view == findViewById(R.id.waterFunc)){
            choices = choices+"Water"+"\n";
            price = price+1.00;
        }

        else if(view == findViewById(R.id.coffeeFunc)){
            choices = choices+"Coffee"+"\n";
            price = price+2.00;
        }
        else if(view == findViewById(R.id.flatbreadFunc)){
            choices = choices+"Flatbread"+"\n";
            price = price+2.00;
        }

        else if(view == findViewById(R.id.sandwichFunc)){
            choices = choices+"Sandwich"+"\n";
            price = price+2.00;
        }
        else if(view == findViewById(R.id.sweetRollFunc)){
            choices = choices+"Sweet Roll"+"\n";
            price = price+2.00;
        }

        else if(view == findViewById(R.id.saladFunc)){
            choices = choices+"Salad"+"\n";
            price = price+2.00;
        }
    }

    public void placeOrder(View view){
        Intent i = new Intent(foodOrder.this, foodDetail.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);

        // Choices

    }
}