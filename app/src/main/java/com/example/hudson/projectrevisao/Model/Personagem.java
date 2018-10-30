package com.example.hudson.projectrevisao.Model;

import com.example.hudson.projectrevisao.R;

import java.util.ArrayList;
import java.util.List;

public class Personagem {

    private Integer img;
    private String nome;

    public Personagem(Integer img, String nome) {
        this.img = img;
        this.nome = nome;
    }

    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static List<Personagem> getListaPersonagem(){

        List<Personagem> lista = new ArrayList<>();
        lista.add(new Personagem(R.drawable.imagem,"Personagem 1"));
        lista.add(new Personagem(R.drawable.imagem1, "Personagem 2"));
        lista.add(new Personagem(R.drawable.imagem2, "Personagem 3"));

        return lista;
    }
}
