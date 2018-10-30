package com.example.hudson.projectrevisao.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.hudson.projectrevisao.Model.User;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    long inserirUser(User user);

    @Delete
    int deletaUser(User user);

    @Query("select * from user")
    List<User> listall();
}
