package com.sneha.practical8;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            username = findViewById(R.id.uname);
            password = findViewById(R.id.pass);
            Log.d("Sneha", username.getText().toString());
            Log.d("Singh", password.getText().toString());
            if (username.getText().toString().trim().equals("Sneha") &&
                    password.getText().toString().trim().equals("Singh") ) {
                Intent i = new Intent(this, MainActivity2.class);
                startActivity(i);
            } else {
                Toast.makeText(getApplicationContext(), "Login Unsuccessful",
                        Toast.LENGTH_LONG).show();
                login=findViewById(R.id.lgn);
                login.setEnabled(false);
            }
        }
    }
