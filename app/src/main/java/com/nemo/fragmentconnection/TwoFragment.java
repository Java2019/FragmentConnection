package com.nemo.fragmentconnection;



import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 *
 */
public class TwoFragment extends Fragment {

    private onFragmentinterectionListener mListener;

    public TwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    interface onFragmentinterectionListener{
        void onFragmentinterection();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            mListener = (onFragmentinterectionListener)context;
        }catch (Exception e){

        }
    }

    public void setText(String item){
        TextView textView = (TextView)getView().findViewById(R.id.text);
        textView.setText(item);
    }

}
