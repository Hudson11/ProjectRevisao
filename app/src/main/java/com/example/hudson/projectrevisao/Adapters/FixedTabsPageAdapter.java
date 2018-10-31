package com.example.hudson.projectrevisao.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.hudson.projectrevisao.FragmentClass.Fragment1;
import com.example.hudson.projectrevisao.FragmentClass.Fragment2;

public class FixedTabsPageAdapter extends FragmentPagerAdapter {

    public FixedTabsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            default:
                return  null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){
        switch(position){
            case 0:
                return "FRAGMENT1";
            case 1:
                return "FRAGMENT2";
            default:
                return null;
        }
    }
}
