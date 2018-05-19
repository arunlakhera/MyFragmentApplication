package com.pikchillytechnologies.myfragmentapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class AboutFragment extends Fragment {

    View view;
    Button btnBook;
    TextView txtReadMore,txtReadLess, txtAbout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        // Inflate the layout for this instance
        view = inflater.inflate(R.layout.fragment_about,container,false);// inflate(R.layout.fragment_about,container, false);

        //get the reference if the button
        btnBook = view.findViewById(R.id.btn_Book);

        txtAbout = view.findViewById(R.id.txt_About);
        txtReadMore = view.findViewById(R.id.txt_ReadMore);
        txtReadLess = view.findViewById(R.id.txt_ReadLess);

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"About Fragment",Toast.LENGTH_LONG).show();
            }
        });

        txtReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtReadMore.setVisibility(View.GONE);
                txtReadLess.setVisibility(View.VISIBLE);
                txtAbout.setMaxLines(Integer.MAX_VALUE);
            }
        });

        txtReadLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtReadLess.setVisibility(View.GONE);
                txtReadMore.setVisibility(View.VISIBLE);
                txtAbout.setMaxLines(5);
            }
        });

        return view;

    }
}
