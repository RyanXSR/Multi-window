package com.example.multi_window_ryan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.btn_move);
        Button btnShare = findViewById(R.id.btn_share);
        Button btnexit = findViewById(R.id.btn_exit);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NewActivity.class));
            }
        });
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, beritaActivity.class));
            }
        });
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });
    }
}