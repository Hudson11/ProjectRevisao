package com.example.hudson.projectrevisao.RoomDataBase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.hudson.projectrevisao.DAO.UserDao;
import com.example.hudson.projectrevisao.Model.User;

@Database(entities = {User.class}, version = 2)
public abstract class AppDataBase extends RoomDatabase {

    public abstract UserDao userDao();

    private static AppDataBase INSTANCE;

    public static AppDataBase getDataBase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDataBase.class, "User_DataBase").allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

}
