package com.example.registr.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.registr.MainActivity;
import com.example.registr.R;

public class NameFragment extends Fragment {
    private EditText editTextFirstName;
    private EditText editTextLastName;
    private Button buttonNextFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root =inflater.inflate(R.layout.fragment_name, container, false);
        editTextFirstName = root.findViewById(R.id.editTextTextPersonFirstName);
        editTextLastName = root.findViewById(R.id.editTextTextPersonLastName);
        buttonNextFragment = root.findViewById(R.id.button);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        buttonNextFragment.setOnClickListener(v -> {
            if(!editTextFirstName.getText().toString().equals("") &&
                    !editTextLastName.getText().toString().equals("")){
                MainActivity.user.setName(editTextFirstName.getText().toString());
                MainActivity.user.setLastName(editTextLastName.getText().toString());
                NavHostFragment.findNavController(NameFragment.this).navigate(R.id.action_nameFragment_to_sexFragment);
            }else {
                Toast.makeText(getContext(),"Enter first and last name",Toast.LENGTH_LONG).show();
            }
        });
    }
}