package com.example.registr.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.registr.MainActivity;
import com.example.registr.R;

public class SexFragment extends Fragment {
    RadioButton radioButtonF;
    RadioButton radioButtonM;
    Button buttonNext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.fragment_sex, container, false);
        radioButtonF = root.findViewById(R.id.radioButton2);
        radioButtonM = root.findViewById(R.id.radioButton);
        buttonNext=root.findViewById(R.id.button2);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttonNext.setOnClickListener(v -> {
            if(radioButtonM.isChecked()){
                MainActivity.user.setSex("male");
                NavHostFragment.findNavController(SexFragment.this).
                        navigate(R.id.action_sexFragment_to_placeOfStudyFragment);
            }else if(radioButtonF.isChecked()){
                MainActivity.user.setSex("female");
                NavHostFragment.findNavController(SexFragment.this).
                        navigate(R.id.action_sexFragment_to_placeOfStudyFragment);
            }else {
                Toast.makeText(getContext(),"Select sex",Toast.LENGTH_LONG).show();
            }
        });
    }
}