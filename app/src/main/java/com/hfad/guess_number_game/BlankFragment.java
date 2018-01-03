package com.hfad.guess_number_game;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private EditText input;
    private EditText result;
    private Button luck;
    private EditText inputTwo;
    private SendNumber resultShow;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(Context context) {


        super.onAttach(context);

        resultShow = (SendNumber) context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v =inflater.inflate(R.layout.fragment_blank, container, false);
        input = v.findViewById(R.id.number);
        inputTwo=v.findViewById(R.id.numbertwo);
        result = v.findViewById(R.id.result);
        luck = v.findViewById(R.id.button);


        luck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultNum = (int) (Math.random() * 10);
                resultShow.getNum(resultNum);
                input.setText("");
                inputTwo.setText("");
                result.setText("");


            }
        });


       return v;

    }

    public interface SendNumber{

        void getNum(int num);
    }


}
