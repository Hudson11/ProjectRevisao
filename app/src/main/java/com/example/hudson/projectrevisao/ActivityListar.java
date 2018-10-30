package com.example.hudson.projectrevisao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.example.hudson.projectrevisao.Adapters.UserRecyclerViewAdapter;
import com.example.hudson.projectrevisao.DAO.UserDao;
import com.example.hudson.projectrevisao.Model.User;
import com.example.hudson.projectrevisao.RoomDataBase.AppDataBase;

import java.util.List;

public class ActivityListar extends AppCompatActivity {

    AppDataBase appDataBase;
    UserDao userDao;
    List<User> listauser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarrecycler_user);

        appDataBase = AppDataBase.getDataBase(this);
        userDao = appDataBase.userDao();

        listauser = userDao.listall();

        RecyclerView view = findViewById(R.id.recyclerview);

        UserRecyclerViewAdapter adapter = new UserRecyclerViewAdapter(this, listauser);
        view.setAdapter(adapter);

        RecyclerView.LayoutManager layout =  new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        view.setLayoutManager(layout);

    }
}
