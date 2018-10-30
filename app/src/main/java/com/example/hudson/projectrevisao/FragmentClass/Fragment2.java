package com.example.hudson.projectrevisao.FragmentClass;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hudson.projectrevisao.R;

public class Fragment2 extends Fragment{

    @Override
    public View onCreateView(LayoutInflater layout, ViewGroup view, Bundle savaInstanceState){
        View v = layout.inflate(R.layout.activity_user_inflate_fragment2, view, false);

        return v;
    }
}
