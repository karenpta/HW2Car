package com.example.hw2car;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompactActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle b = getIntent().getExtras();
        Car car = (Car) b.getSerializable("car");

        ImageView avatar = findViewById(R.id.avater);
        TextView name = findViewById(R.id.name);
        TextView email = findViewById(R.id.email);

        avatar.setImageResource(car.getImage());
        name.setText(car.getName());
        email.setText(car.getEmail());
    }
}