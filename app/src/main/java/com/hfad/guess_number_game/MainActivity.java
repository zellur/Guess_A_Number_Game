package com.hfad.guess_number_game;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragment.SendNumber{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
        BlankFragment start = new BlankFragment();
        ft.add(R.id.fragment,start);
        ft.addToBackStack(null);
        ft.commit();
    }

    @Override
    public void getNum(int num) {


        FragmentManager fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Bundle b = new Bundle();
        b.putInt("result",num);

        BlankFragment2 two = new BlankFragment2();
        two.setArguments(b);

        fragmentTransaction.replace(R.id.fragment,two);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }
}
