package com.example.hw2car;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddCarActivity extends AppCompactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = findViewById(R.id.name);
                EditText email = findViewById(R.id.email);
                Car car = new Car(R.drawable.avatar7,name.getText().toString(),email.getText().toString());

                Intent i = new Intent();
                i.putExtra("car",car);
                setResult(1,i);
                finish();



            }
        });

    }
}