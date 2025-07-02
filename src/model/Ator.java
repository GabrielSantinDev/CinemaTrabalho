package model;

import java.util.ArrayList;

public class Ator extends Pessoa {

    private ArrayList<String> listaPapeis = new ArrayList<>();

    public Ator(String nome, int idade) {
        super(nome, idade);
    }

    public void addPapel(String nomePapel) {
        listaPapeis.add(nomePapel);
    }
}
