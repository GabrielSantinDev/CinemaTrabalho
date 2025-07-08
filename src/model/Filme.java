package model;

import java.util.ArrayList;

public class Filme {

    private String titulo;
    private double duracao;
    private Genero genero;
    private String anoLancamento;

    private ArrayList<Ator> listaAtores = new ArrayList<>();

    public Filme(String titulo, double duracao, String anoLancamento, Genero genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.anoLancamento = anoLancamento;

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

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void imprimirElenco() {
        System.out.println("\nElenco de " + getTitulo() + ": ");

        for (Ator ator : listaAtores) {
            ArrayList<Papel> papeis = ator.getListaPapeis();

            for (Papel papel : papeis) {
                if (papel.getFilme().equals(this)) {
                    System.out.println(ator.getNome() + " no papel de: " + papel.getNomeDoPapel());
                }
            }
        }
    }
}


