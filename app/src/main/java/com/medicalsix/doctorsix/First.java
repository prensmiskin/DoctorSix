package com.medicalsix.doctorsix;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class First extends Fragment {
    private Button button;
    private TextView text;


    public First() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        button = container.findViewById(R.id.button);
        text = container.findViewById(R.id.text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("test");

            }
        });
        return inflater.inflate(R.layout.fragment_first, container, false);

    }

}
