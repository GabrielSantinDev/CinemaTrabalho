package model;

import java.util.ArrayList;

public class Filme {

    private String titulo;
    private double duracao;
    private Genero genero;

    private ArrayList<Ator> listaAtores = new ArrayList<>();

    public Filme(String titulo, double duracao, Genero genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;

        genero.addFilme(this);
    }

    public void addAtor(Ator ator) {
        listaAtores.add(ator);
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public Genero getGenero() {
        return genero;
    }

    public ArrayList<Ator> getListaAtores() {
        return listaAtores;
    }

}
