package com.harjoitus.a5harjoitustouhu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements Uusifragment.IUusiFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayoutti, Uusifragment.newInstance())
                .commit();

        /* Yritin käyttää samaa fragmenttia, enpä osannut...*/
        /*
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayoutti2, Uusifragment.newInstance())
                .commit();
        */

    /* No yritin sitten tehdä ihan uuden fragmentin, no ei onnistu silläkään. Missä mättää?*/
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frameLayoutti2, BlankFragment2.newInstance("par1","par2"))
                .commit();


    }

    @Override
    public void onButtonPressed() {
        Toast.makeText(getApplicationContext(), "Apua!", Toast.LENGTH_LONG).show();
    }

    //jahas, miksikäs ei näy se onButton2Pressed
    /*
    @Override
    public  void onButton2Pressed(){
        Toast.makeText(getApplicationContext(), "APUVA!", Toast.LENGTH_LONG).show();
    }

     */


}
