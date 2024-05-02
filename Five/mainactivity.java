package com.sneha.practical5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText ed1,ed2;
    Double n1,n2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        b= findViewById(R.id.btn1);
        ed1= findViewById(R.id.edt1);
        ed2= findViewById(R.id.edt2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Double.parseDouble(ed1.getText().toString());
                n2=Double.parseDouble(ed2.getText().toString());
                sum=n1+n2;
                String m=Double.toString(sum);
                Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                i.putExtra("Addition",m);
                startActivity(i);
            }
        });
    }
}
