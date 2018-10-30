package com.example.hudson.projectrevisao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hudson.projectrevisao.DAO.UserDao;
import com.example.hudson.projectrevisao.Model.User;
import com.example.hudson.projectrevisao.RoomDataBase.AppDataBase;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void cadastrar(View v){
        Intent i = new Intent(this, ActivityCadastrar.class);
        startActivity(i);
    }

    public void listar(View v){
        Intent i = new Intent(this, ActivityListar.class);
        startActivity(i);
    }

    public void pagerView(View v){
        Intent i = new Intent(this, ActivityListarViewPager.class);
        startActivity(i);
    }

    public void fragment(View v){
        Intent i = new Intent(this, ActivityFragment.class);
        startActivity(i);
    }
}
