package com.example.staycation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class h10Activity extends AppCompatActivity {
    Button button;
    public TextView hname;
    TextView h10price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h10);
        button = findViewById(R.id.button);
        hname = findViewById(R.id.textView);
        h10price=findViewById(R.id.price_h10);
        String h10_price=h10price.getText().toString();
        button.setOnClickListener(view -> {
            Alldetails.hname_det = hname.getText().toString();
            Intent intent = new Intent(h10Activity.this, Pay1Activity.class);
            intent.putExtra("price",h10_price);
            startActivity(intent);
        });
    }
}