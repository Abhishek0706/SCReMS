package com.developer.screms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    private CardView ps4, pool, snooker, table_tennis, chess, carrom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findItems();
        ps4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        pool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        snooker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        table_tennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        chess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        carrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    private void findItems() {
        ps4 = findViewById(R.id.ps4);
        pool = findViewById(R.id.pool);
        snooker = findViewById(R.id.snooker);
        table_tennis = findViewById(R.id.table_tennis);
        chess = findViewById(R.id.chess);
        carrom = findViewById(R.id.carrom);
    }
}
