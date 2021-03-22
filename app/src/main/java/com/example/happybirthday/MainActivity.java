package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText txt1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1=(EditText)findViewById(R.id.txt_year);
        btn1=(Button)findViewById(R.id.btn_click);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int year=Integer.parseInt(txt1.getText().toString());
                int currtentyear = Calendar.getInstance().get(Calendar.YEAR);
                int result=currtentyear-year;
            Intent intent= new Intent(MainActivity.this,happybirthday.class);
            intent.putExtra("year",result);
            startActivity(intent);

            }

        });

    }
}