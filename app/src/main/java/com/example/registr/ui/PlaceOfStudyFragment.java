package com.example.registr.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.registr.MainActivity;
import com.example.registr.R;

public class PlaceOfStudyFragment extends Fragment {
    private EditText editTextPlaceOfStudy;
    private Button buttonNextFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.fragment_place_of_study, container, false);
        editTextPlaceOfStudy = root.findViewById(R.id.editTextTextPlaceOfStudy);
        buttonNextFragment=root.findViewById(R.id.button3);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttonNextFragment.setOnClickListener(v -> {
            if(!editTextPlaceOfStudy.getText().toString().equals("")){
                MainActivity.user.setPlaceOfStudy(editTextPlaceOfStudy.getText().toString());
                NavHostFragment.findNavController(PlaceOfStudyFragment.this).
                        navigate(R.id.action_placeOfStudyFragment_to_optionalDataFragment);
            }else {
                Toast.makeText(getContext(),"Enter place of study",Toast.LENGTH_LONG).show();
            }
        });
    }
}