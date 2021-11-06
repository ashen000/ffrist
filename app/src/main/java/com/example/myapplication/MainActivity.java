package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=getIntent();
        final TextView math1=findViewById(R.id.math1);
        TextView math2=findViewById(R.id.math2);
        TextView chinese1=findViewById(R.id.chinese1);
        TextView chinese2=findViewById(R.id.chinese2);
        TextView english1=findViewById(R.id.english1);
        TextView english2=findViewById(R.id.english2);
        TextView computer1=findViewById(R.id.computer1);
        TextView computer2=findViewById(R.id.computer2);
        TextView all1=findViewById(R.id.all);
        all1.setText(intent.getStringExtra("all1"));
        math1.setText(intent.getStringExtra("math1"));
        math2.setText(intent.getStringExtra("math2"));
        chinese1.setText(intent.getStringExtra("chinese1"));
        chinese2.setText(intent.getStringExtra("chinese2"));
        english1.setText(intent.getStringExtra("english1"));
        english2.setText(intent.getStringExtra("english2"));
        computer1.setText(intent.getStringExtra("computer1"));
        computer2.setText(intent.getStringExtra("computer2"));
        button=findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,StartPage.class);
                startActivity(intent);

            }
        });
        button2=findViewById(R.id.next);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this,SecondActivity.class);



                startActivity(intent2);

            }
        });
    }
}