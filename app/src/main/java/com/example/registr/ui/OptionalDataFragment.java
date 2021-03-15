package com.example.registr.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;


import com.example.registr.MainActivity;
import com.example.registr.MainActivity2;
import com.example.registr.R;


public class OptionalDataFragment extends Fragment {
    private CalendarView calendarView;
    private Button buttonNextFragment;
    private Button buttonSkipFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.fragment_optional_data, container, false);
        buttonNextFragment =root.findViewById(R.id.button4);
        buttonSkipFragment =root.findViewById(R.id.button5);
        calendarView =root.findViewById(R.id.calendarView3);
        return root;
    }
    String date ="";
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        calendarView.setOnDateChangeListener((view1, year, month, dayOfMonth) -> date = dayOfMonth+"/"+(month+1)+"/"+year);
        buttonSkipFragment.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), MainActivity2.class);
            startActivity(intent);
            getActivity().finish();
        });
        buttonNextFragment.setOnClickListener(v -> {
            if(date.equals("")){
                Toast.makeText(getContext(), "Choose your date of birth",Toast.LENGTH_LONG).show();
            }else{
                MainActivity.user.setDate(date);
                Intent intent = new Intent(getContext(), MainActivity2.class);
                startActivity(intent);
                getActivity().finish();
            }

        });
    }
}