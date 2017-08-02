package com.nemo.fragmentconnection;

import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity
        implements OneFragment.onFragmentInteractionListener,
        TwoFragment.onFragmentinterectionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public void onFragmentInteraction(String link) {
        TwoFragment twoFragment = (TwoFragment)getSupportFragmentManager().
                findFragmentById(R.id.Two);
        if (twoFragment != null && twoFragment.isInLayout()){
            twoFragment.setText(link);
        }
    }

    @Override
    public void onFragmentinterection() {
        OneFragment oneFragment = (OneFragment) getSupportFragmentManager().
                findFragmentById(R.id.One);
        if (oneFragment != null && oneFragment.isInLayout()){
            oneFragment.ChangeName("new name");
        }
    }
}
