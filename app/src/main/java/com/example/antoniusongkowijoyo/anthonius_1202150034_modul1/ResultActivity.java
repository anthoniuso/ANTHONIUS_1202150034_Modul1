package com.example.antoniusongkowijoyo.anthonius_1202150034_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    private TextView makanan, porsi_makanan, headline, total_harga;
    private int total, total_porsi;
    private String tempat_makan, toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        makanan = (TextView) findViewById(R.id.makanan);
        porsi_makanan = (TextView) findViewById(R.id.porsi_makanan);
        headline = (TextView) findViewById(R.id.headline);
        total_harga = (TextView) findViewById(R.id.total);

        total_porsi = intent.getIntExtra("porsiMakanan", 0);
        total = 0;

        tempat_makan = intent.getStringExtra("headline");

        if(tempat_makan.trim().equalsIgnoreCase("eatbus".trim())) {
            total = total_porsi * 50000;
        } else if (tempat_makan.trim().equalsIgnoreCase("abnormal".trim())) {
            total = total_porsi * 30000;
        }

        if(total > 65500) {
            toast = "Jangan disini makan malamnya, uang kamu tidak cukup";
        } else {
            toast = "Disini aja makan malamnya";
        }

        makanan.setText(intent.getStringExtra("makanan"));
        porsi_makanan.setText(String.valueOf(total_porsi));
        headline.setText(tempat_makan);
        total_harga.setText(String.valueOf(total));

        Toast.makeText(ResultActivity.this,
                toast, Toast.LENGTH_SHORT).show();

    }
}
