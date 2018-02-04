package com.example.antoniusongkowijoyo.anthonius_1202150034_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private EditText makanan, porsi;
    private Button eatbus, abnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makanan = (EditText) findViewById(R.id.nasi_uduk);
        porsi = (EditText) findViewById(R.id.porsi_makanan);
        eatbus = (Button) findViewById(R.id.button_eatbus);
        abnormal = (Button) findViewById(R.id.button_abnormal);

        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                String inputMakanan = makanan.getText().toString();
                int inputPorsi = Integer.parseInt(porsi.getText().toString());
                String inputEatbus = eatbus.getText().toString();

                intent.putExtra("makanan",inputMakanan);
                intent.putExtra("porsiMakanan",inputPorsi);
                intent.putExtra("headline", inputEatbus);
                startActivity(intent);
            }
        });

        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                String inputMakanan = makanan.getText().toString();
                String inputPorsi = porsi.getText().toString();
                String inputAbnormal = abnormal.getText().toString();

                intent.putExtra("makanan", inputMakanan);
                intent.putExtra("porsiMakanan", inputPorsi);
                intent.putExtra("headline", inputAbnormal);
                startActivity(intent);
            }
        });
    }

    public void launchResult(View view) {
        Log.d(LOG_TAG, "Button clicked!");
    }
}
