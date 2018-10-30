package com.example.hudson.projectrevisao;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.hudson.projectrevisao.Adapters.UserRecyclerViewAdapter;
import com.example.hudson.projectrevisao.Adapters.UserViewPagerAdapter;
import com.example.hudson.projectrevisao.DAO.UserDao;
import com.example.hudson.projectrevisao.Model.Personagem;
import com.example.hudson.projectrevisao.Model.User;
import com.example.hudson.projectrevisao.RoomDataBase.AppDataBase;

import java.util.List;

public class ActivityListarViewPager extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarviewpage_user);

        ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
        pager.setAdapter(new UserViewPagerAdapter(ActivityListarViewPager.this, Personagem.getListaPersonagem()));

        ViewPager.OnPageChangeListener listener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                Toast.makeText(ActivityListarViewPager.this, "Item Selecionado", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        };
        pager.addOnPageChangeListener(listener);
    }
}
