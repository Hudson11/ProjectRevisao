package com.example.hudson.projectrevisao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.hudson.projectrevisao.DAO.UserDao;
import com.example.hudson.projectrevisao.Model.User;
import com.example.hudson.projectrevisao.RoomDataBase.AppDataBase;

public class ActivityCadastrar extends AppCompatActivity {

    AppDataBase appDataBase;
    UserDao dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);

        final EditText nome = findViewById(R.id.nome);
        final EditText cpf = findViewById(R.id.cpf);
        final EditText rg = findViewById(R.id.rg);
        Button cadastrar = findViewById(R.id.button4);

        appDataBase = AppDataBase.getDataBase(this);
        dao = appDataBase.userDao();

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = new User(nome.getText().toString(), cpf.getText().toString(), rg.getText().toString());
                dao.inserirUser(user);

            }
        });

    }
}
