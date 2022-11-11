package com.example.multi_window_ryan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class LoginActifity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_actifity);

        Button btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(
                        LoginActifity.this,
                        MainActivity.class));
            }
        });
    }
}