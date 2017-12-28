package com.hfad.guess_number_game;


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
    private TextView result;
    private Button luck;

    private String et;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v =inflater.inflate(R.layout.fragment_blank, container, false);
        input = v.findViewById(R.id.number);
        result = v.findViewById(R.id.result);
        luck = v.findViewById(R.id.button);
         et = input.getText().toString();

         if(et.equals("")){

             et = "0";
         }


        luck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int resultNum = (int) (Math.random() * 10);
                result.setText(String.valueOf(resultNum));
                int guess = Integer.parseInt(et);
                if (resultNum==guess){
                    luck.setText("Get Your Prize here");
                    if(luck.getText().equals("Get Your Prize here")){
                        luck.setText("CHECK MY LUCK");
                        FragmentManager fm = getFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        BlankFragment2 res = new BlankFragment2();
                        ft.replace(R.id.fragment,res);
                        ft.addToBackStack(null);
                        ft.commit();
                    }else {
                        luck.setText("CHECK MY LUCK");

                    }

                }else{
                    Toast.makeText(getContext(), "Your Guess Is Not Correct!!!!", Toast.LENGTH_SHORT).show();

                }

                input.setText("");


            }
        });
       return v;
    }

}
