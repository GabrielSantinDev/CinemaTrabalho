package model;

public class Papel {

    private Filme filme;
    private String nomeDoPapel;

    public Papel(Filme filme, String nomeDoPapel) {
        this.nomeDoPapel = nomeDoPapel;
        this.filme = filme;
    }

    public String getNomeDoPapel() {
        return nomeDoPapel;
    }

    public Filme getFilme() {
        return filme;
    }

}
