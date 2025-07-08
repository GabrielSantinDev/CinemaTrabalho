package model;

public class Sessao {
    private Sala sala;
    private Filme filme;
    private String horario;
    private int ingressosVendidos = 0;
    private final int capacidadeMax;
    private boolean encerrado = false;

    public Sessao(Sala sala, Filme filme, String horario) {
        this.sala = sala;
        this.filme = filme;
        this.horario = horario;
        sala.addSessao(this);
        this.capacidadeMax = sala.getCapacidadeMax();
    }

    public int getIngressosDisponiveis() {
        return this.capacidadeMax - this.ingressosVendidos;
    }

    public void venderIngressos() {
        ++this.ingressosVendidos;
    }

    public Sala getSala() {
        return this.sala;
    }

    public String getFilme() {
        return this.filme.getTitulo();
    }

    public String getHorario() {
        return this.horario;
    }

    public int getIngressosVendidos() {
        return this.ingressosVendidos;
    }

    public void devolverIngressos() {
        --this.ingressosVendidos;
    }

    public boolean isEncerrado() {
        return this.encerrado;
    }

    public void setEncerrado(boolean encerrado) {
        this.encerrado = encerrado;
    }

    public int getCapacidadeMax() {
        return this.capacidadeMax;
    }
}
