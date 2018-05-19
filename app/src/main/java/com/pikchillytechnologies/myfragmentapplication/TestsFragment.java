package com.pikchillytechnologies.myfragmentapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class TestsFragment extends Fragment{

    View view;
    Button thirdButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        // Inflate the layout for this instance
        view = inflater.inflate(R.layout.fragment_tests,container,false);

        //get the reference if the button
        thirdButton = view.findViewById(R.id.thirdButton);

        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Tests Fragment",Toast.LENGTH_LONG).show();
            }
        });
        return view;

    }

}
