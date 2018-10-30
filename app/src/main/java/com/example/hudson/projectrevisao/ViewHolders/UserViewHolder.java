package com.example.hudson.projectrevisao.ViewHolders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.hudson.projectrevisao.R;

public class UserViewHolder extends RecyclerView.ViewHolder {

     static TextView nome;
     TextView cpf;
     TextView rg;

    public UserViewHolder(View itemView) {
        super(itemView);
        nome = itemView.findViewById(R.id.nomeUser);
        cpf = itemView.findViewById(R.id.cpfUser);
        rg = itemView.findViewById(R.id.rgUser);
    }

    public TextView getNome() {
        return nome;
    }

    public TextView getCpf() {
        return cpf;
    }

    public TextView getRg() {
        return rg;
    }
}
