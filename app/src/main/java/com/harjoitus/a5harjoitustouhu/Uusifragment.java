package com.harjoitus.a5harjoitustouhu;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;


public class Uusifragment extends Fragment {

    public interface IUusiFragment {
        void onButtonPressed();
    }

    private IUusiFragment mListener;

    public Uusifragment() {
        // Required empty public constructor
    }


    public static Uusifragment newInstance() {
        Uusifragment fragment = new Uusifragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_uusifragment, container, false);
        Button b = v.findViewById(R.id.nappi);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onButtonPressed();
            }
        });
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IUusiFragment) {
            mListener = (IUusiFragment) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement IUusiFragment");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
