package com.example.loginapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class souvOrder extends AppCompatActivity {

    Button shirtBtn, hatBtn, snowBtn, keyBtn, bottleBtn, mugBtn, coasterBtn, leaveSouv;
    // Strings
    String choices = "";
    Double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_souv_order);

        shirtBtn = (Button) findViewById(R.id.shirtBtn);
        hatBtn = (Button) findViewById(R.id.hatBtn);
        snowBtn = (Button) findViewById(R.id.snowBtn);
        keyBtn = (Button) findViewById(R.id.keyBtn);
        bottleBtn = (Button) findViewById(R.id.bottleBtn);
        mugBtn = (Button) findViewById(R.id.mugBtn);
        coasterBtn = (Button) findViewById(R.id.coasterBtn);
        leaveSouv = (Button) findViewById(R.id.leaveSouv);

        leaveSouv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), menuActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void add_to_list(View view){
        if(view == findViewById(R.id.shirtBtn)){
            choices = choices+"Shirt"+"\n";
            price = price+10.00;
        }
        else if(view == findViewById(R.id.hatBtn)){
            choices = choices+"Hat"+"\n";
            price = price+5.00;
        }

        else if(view == findViewById(R.id.snowBtn)){
            choices = choices+"Snow Globe"+"\n";
            price = price+5.00;
        }
        else if(view == findViewById(R.id.keyBtn)){
            choices = choices+"Key Chain"+"\n";
            price = price+5.00;
        }

        else if(view == findViewById(R.id.bottleBtn)){
            choices = choices+"Bottle"+"\n";
            price = price+5.00;
        }
        else if(view == findViewById(R.id.mugBtn)){
            choices = choices+"Mug"+"\n";
            price = price+5.00;
        }

        else if(view == findViewById(R.id.coasterBtn)){
            choices = choices+"Coaster"+"\n";
            price = price+2.00;
        }
    }

    public void placeOrder(View view){
        Intent i = new Intent(souvOrder.this, souvDetail.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);

        // Choices

    }

}