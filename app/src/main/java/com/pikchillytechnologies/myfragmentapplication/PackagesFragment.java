package com.pikchillytechnologies.myfragmentapplication;

import android.app.Dialog;
import android.app.Fragment;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PackagesFragment extends Fragment{

    View view;
    Button secondButton;
    TextView priceTextView;

    Dialog menuDialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        // Inflate the layout for this instance
        view = inflater.inflate(R.layout.fragment_packages,container, false);

        menuDialog = new Dialog(getContext());

        priceTextView =  view.findViewById(R.id.price_textview);
        priceTextView.setPaintFlags(priceTextView.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);


        view.findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                menuDialog.setContentView(R.layout.dialog_health_popup);
                menuDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                menuDialog.show();
            }
        });

        return view;

    }



}
