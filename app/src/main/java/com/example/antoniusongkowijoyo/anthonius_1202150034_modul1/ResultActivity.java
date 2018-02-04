package com.example.antoniusongkowijoyo.anthonius_1202150034_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView makanan, porsi_makanan, headline, total_harga;
    private int harga, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        makanan = (TextView) findViewById(R.id.makanan);
        porsi_makanan = (TextView) findViewById(R.id.porsi_makanan);
        headline = (TextView) findViewById(R.id.headline);
        total_harga = (TextView) findViewById(R.id.total);

        total = getIntent().getIntExtra("porsiMakanan", 0);

        makanan.setText(getIntent().getStringExtra("makanan"));
        porsi_makanan.setText(String.valueOf(total));
        headline.setText(getIntent().getStringExtra("headline"));

    }
}
