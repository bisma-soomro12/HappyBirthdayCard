package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class happybirthday extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happybirthday);
        txt=(TextView)findViewById(R.id.year);

        Intent intent= getIntent();
        int name=intent.getIntExtra("year",0);
        String str= Integer.toString(name);
        txt.setText("Wish you Very Happy Birthday, Sam !!! wow, you are "+str+" years old now");
    }
}