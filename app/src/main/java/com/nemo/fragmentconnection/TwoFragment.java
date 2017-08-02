package com.nemo.fragmentconnection;



import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
        View view = inflater.inflate(R.layout.fragment_two, container, false);
        Button button = (Button)view.findViewById(R.id.bChange);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChangeName();
            }
        });
        return view;
    }

    interface onFragmentinterectionListener{
        void onFragmentinterection();
    }

    public void ChangeName(){
        mListener.onFragmentinterection();
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
