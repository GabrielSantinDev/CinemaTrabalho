package model;

import java.util.ArrayList;

public class Ator extends Pessoa {

    private ArrayList<Papel> listaPapeis = new ArrayList<>();

    public Ator(String nome, int idade) {
        super(nome, idade);
    }

    public void addPapel(Filme filme, String nomeDoPapel) {
        listaPapeis.add(new Papel(filme, nomeDoPapel));
    }

    public ArrayList<Papel> getListaPapeis() {
        return listaPapeis;
    }

}
