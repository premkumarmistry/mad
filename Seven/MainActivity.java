package com.sneha.practical7;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ed1= findViewById(R.id.et1);
        ed2= findViewById(R.id.et2);
    }
    public void OnClickAdd(View v)
    {
        Double no1= Double.parseDouble(ed1.getText().toString());
        Double no2= Double.parseDouble(ed2.getText().toString());
        Double ans= no1+no2;
        Toast.makeText(MainActivity.this,"Addition is "+ans.toString(),Toast.LENGTH_LONG).show();
    }
    public void OnClickSub(View v)
    {
        Double no1= Double.parseDouble(ed1.getText().toString());
        Double no2= Double.parseDouble(ed2.getText().toString());
        Double ans= no1-no2;
        Toast.makeText(MainActivity.this,"Subtraction is "+ans.toString(),Toast.LENGTH_LONG).show();
    }
    public void OnClickMul(View v)
    {
        Double no1= Double.parseDouble(ed1.getText().toString());
        Double no2= Double.parseDouble(ed2.getText().toString());
        Double ans= no1*no2;
        Toast.makeText(MainActivity.this,"Multiplication is "+ans.toString(),Toast.LENGTH_LONG).show();
    }
    public void OnClickDiv(View v)
    {
        Double no1= Double.parseDouble(ed1.getText().toString());
        Double no2= Double.parseDouble(ed2.getText().toString());
        Double ans= no1/no2;
        Toast.makeText(MainActivity.this,"Division is "+ans.toString(),Toast.LENGTH_LONG).show();
    }
    public void OnClickMax(View v) {
        Double no1 = Double.parseDouble(ed1.getText().toString());
        Double no2 = Double.parseDouble(ed2.getText().toString());
        if (no1 > no2)
        {
            Toast.makeText(MainActivity.this, "Max no. is " + no1.toString(), Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(MainActivity.this, "Max no. is " + no2.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
