package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class StartPage extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_page);
         final EditText mathgrades1=findViewById(R.id.mathgrades1);
         final EditText mathgrades2=findViewById(R.id.mathgrades2);
         final EditText chinesegrade1=findViewById(R.id.chinese1);
         final EditText chinesegrade2=findViewById(R.id.chinese2);
         final EditText englishgrade1=findViewById(R.id.english1);
         final EditText englishgrade2=findViewById(R.id.english2);
         final EditText conputergrade1=findViewById(R.id.computer1);
         final EditText conputergrade2=findViewById(R.id.computer2);
        button=findViewById(R.id.start1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StartPage.this,MainActivity.class);
                String math1=mathgrades1.getText().toString().trim();
                String math2=mathgrades2.getText().toString().trim();
                double math11=Integer.valueOf(math1).intValue();
                double math22=Integer.valueOf(math2).intValue();

                String chinese1=chinesegrade1.getText().toString().trim();
                String chinese2=chinesegrade2.getText().toString().trim();
                double chinese11=Integer.valueOf(chinese1).intValue();
                double chinese22=Integer.valueOf(chinese2).intValue();
                String english1=englishgrade1.getText().toString().trim();
                String english2=englishgrade2.getText().toString().trim();
                double english11=Integer.valueOf(english1).intValue();
                double english22=Integer.valueOf(english2).intValue();
                String computer1=conputergrade1.getText().toString().trim();
                String computer2=conputergrade2.getText().toString().trim();
                double computer11=Integer.valueOf(computer1).intValue();
                double computer22=Integer.valueOf(computer2).intValue();
                double all;
                all=math22+chinese22+english22+chinese22;
                chinese22=chinese11/chinese22;
                english22=english11/english22;
                computer22=computer11/computer22;
                math22=math11/math22;
                String s = Double.toString(all);
                intent.putExtra("all1",s);
                intent.putExtra("math1","成绩"+math1);
                intent.putExtra("math2","绩点"+math22);
                intent.putExtra("chinese1","成绩"+chinese1);
                intent.putExtra("chinese2","绩点"+chinese22);
                intent.putExtra("english1","成绩"+english1);
                intent.putExtra("english2","绩点"+english22);
                intent.putExtra("computer1","成绩"+computer1);
                intent.putExtra("computer2","绩点"+computer22);
                startActivity(intent);
            }
        });
    }
}
