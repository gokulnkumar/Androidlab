package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    Button btplus,btminus,btreset;
    TextView txtcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btplus=findViewById(R.id.btnplus);
        btminus=findViewById(R.id.btnminus);
        btreset=findViewById(R.id.btnreset);
        txtcount=findViewById(R.id.textView2);

        btplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count=count+1;
                txtcount.setText(count+"");

            }
        });
        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=count-1;
                txtcount.setText(count+"");
            }
        });
        btreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count=0;
                txtcount.setText(count+"");
            }
        });
    }
}