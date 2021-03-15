package com.example.registr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView ;
    User user = MainActivity.user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView= findViewById(R.id.textView2);
        String str = "Hello "+user.getName()+" "+user.getLastName()+"\n" +
                user.getSex()+" "+user.getDate()+"\nstudying in "+user.getPlaceOfStudy();
        textView.setText(str);
    }
}