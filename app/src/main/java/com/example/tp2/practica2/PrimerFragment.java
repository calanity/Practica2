package com.example.tp2.practica2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by 41587805 on 6/9/2016.
 */
public class PrimerFragment extends Fragment implements View.OnClickListener{

    MainActivity ma;
    View vista;

    public PrimerFragment()
    {

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true); // to show actionbar icon calling onCreateOptionsMenu
        // Inflate the layout for this fragment

        vista = inflater.inflate(R.layout.fragment_primero, container,false);


        return vista;

    }

    @Override
    public void onClick(View view) {

        ma = (MainActivity) getActivity();


    }


}
