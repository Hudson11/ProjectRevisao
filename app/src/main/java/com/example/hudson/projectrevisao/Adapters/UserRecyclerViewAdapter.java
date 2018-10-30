package com.example.hudson.projectrevisao.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hudson.projectrevisao.Model.User;
import com.example.hudson.projectrevisao.R;
import com.example.hudson.projectrevisao.ViewHolders.UserViewHolder;

import java.util.List;

public class UserRecyclerViewAdapter extends RecyclerView.Adapter {

    Context context;
    List<User> listaUsers;

    public UserRecyclerViewAdapter(Context context, List<User> listaUsers) {
        this.context = context;
        this.listaUsers = listaUsers;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_user_inflate_recycler, parent, false);
        UserViewHolder userHolder = new UserViewHolder(view);
        return userHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        UserViewHolder userHolder = (UserViewHolder) holder;
        User user = listaUsers.get(position);
        userHolder.getNome().setText(user.getNome());
        userHolder.getCpf().setText(user.getCpf());
        userHolder.getRg().setText(user.getRg());
    }

    @Override
    public int getItemCount() {
        return listaUsers == null ? 0 : listaUsers.size();
    }
}
