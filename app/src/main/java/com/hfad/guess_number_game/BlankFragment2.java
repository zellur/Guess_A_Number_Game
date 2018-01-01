package com.hfad.guess_number_game;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment2 extends Fragment {

       private TextView tV;
       private int tR;


    public BlankFragment2() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Bundle bundle = getArguments();
        tR = bundle.getInt("result");
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        tV = v.findViewById(R.id.textRes);

        String p = String.valueOf(tR);
        tV.setText("Wining guess: "+p);

        return v;
    }

}
