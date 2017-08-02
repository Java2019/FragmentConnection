package com.nemo.fragmentconnection;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment {

    private onFragmentInteractionListener mListener;

     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_one, container, false);
         Button button = (Button)view.findViewById(R.id.bUpdate);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 updateDetails();
             }
         });
        return view;
    }

    private void updateDetails() {
        String s = new Date().toString();
        mListener.onFragmentInteraction(s);
    }

    private interface onFragmentInteractionListener{
        void onFragmentInteraction(String link);
    };

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            mListener = (onFragmentInteractionListener)context;
        }catch (Exception e){

        }
    }

    public OneFragment() {
        // Required empty public constructor
    }
}
