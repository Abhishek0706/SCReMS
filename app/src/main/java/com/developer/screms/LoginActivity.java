package com.developer.screms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private static final String DEFAULT_EMAIL = "abcd@gmail.com";
    private static final String DEFAULT_PASS = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText input_email = findViewById(R.id.input_email);
        final EditText input_pass = findViewById(R.id.input_pass);
        Button btn_login = findViewById(R.id.btn_login);
        TextView link_signup = findViewById(R.id.link_signup);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = input_email.getText().toString();
                String pass = input_pass.getText().toString();
                login(email, pass);
            }
        });
        link_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });

    }

    private void signup() {
    }

    private void login(String email, String pass) {
        if (true || email.equals(DEFAULT_EMAIL) && pass.equals(DEFAULT_PASS)) {
            Intent i = new Intent(this, HomeActivity.class);
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(i);

        }
    }
}
