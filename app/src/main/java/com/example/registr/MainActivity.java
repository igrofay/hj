package com.example.registr;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static User user ;
    SharedPreferences sharedPreferences ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=new User();
        sharedPreferences = getSharedPreferences("User", Context.MODE_PRIVATE);
        user.setName(sharedPreferences.getString("name",""));
        user.setLastName(sharedPreferences.getString("lastName",""));
        user.setSex(sharedPreferences.getString("sex",""));
        user.setPlaceOfStudy(sharedPreferences.getString("placeOfStudy",""));
        user.setDate(sharedPreferences.getString("date",""));
        if(!user.getSex().equals("")){
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        @SuppressLint("CommitPrefEdits") SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name",user.getName());
        editor.putString("lastName",user.getLastName());
        editor.putString("sex",user.getSex());
        editor.putString("placeOfStudy",user.getPlaceOfStudy());
        editor.putString("date",user.getDate());
        editor.apply();
    }
}