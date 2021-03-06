package com.example.codetribe.circleactionmenu;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Codetribe on 8/3/2017.
 */

public class Hotel_Fragment extends android.support.v4.app.Fragment
{
    private  static final String TAG = "Hotel_Fragment";
    private Button btnGuest;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.guest_house,container,false);
        btnGuest = (Button) view.findViewById(R.id.btnTest);

        btnGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Hotel button clicked",Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}
