package com.example.hudson.projectrevisao.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.hudson.projectrevisao.Model.Personagem;
import com.example.hudson.projectrevisao.R;

import java.util.List;

public class UserViewPagerAdapter extends PagerAdapter {

    Context context;
    List<Personagem> listaPerson;

    public UserViewPagerAdapter(Context context, List<Personagem> lista){
        this.context = context;
        this.listaPerson = lista;
    }

    @Override
    public int getCount() {
        return listaPerson == null ? 0: listaPerson.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){

        View view = LayoutInflater.from(context).inflate(R.layout.activity_user_inflate_pageview, container, false);
        ImageView img = view.findViewById(R.id.imageView);
        img.setImageResource(listaPerson.get(position).getImg());
        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object view){
        container.removeView((View) view);
    }

    @Override
    public CharSequence getPageTitle(int position){
        return listaPerson.get(position).getNome();
    }
}
