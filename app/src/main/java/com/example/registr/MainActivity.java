package com.example.registr;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static User user ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=new User();
    }
}