package com.example.hudson.projectrevisao;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.hudson.projectrevisao.FragmentClass.Fragment1;
import com.example.hudson.projectrevisao.FragmentClass.Fragment2;

public class ActivityFragment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        /*android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction tf = fm.beginTransaction();
        Fragment1 fragment = new Fragment1();
        tf.add(R.id.layout_alvo, fragment, "Fragment1");
        tf.commit();*/

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction tf = fm.beginTransaction();
        Fragment2 fragment = new Fragment2();
        tf.add(R.id.layout_alvo, fragment, "Fragment1");
        tf.commit();

    }


}
