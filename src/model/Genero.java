package model;

import java.util.ArrayList;

public class Genero {
    private String generoNome;
    private ArrayList<Filme> listaFilmes = new ArrayList<>();

    public Genero(String nome) {
        this.generoNome = nome;
    }

    public String getGeneroNome() {
        return generoNome;
    }

    public void addFilme(Filme filme) {
        listaFilmes.add(filme);
    }

    public ArrayList<Filme> getListaFilmes() {
        return listaFilmes;
    }
}
