package model;

import java.util.ArrayList;

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

    public void venderIngresso() {
        this.ingressosVendidos++;
    }

    public Sala getSala() {
        return sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public String getHorario() {
        return horario;
    }

    public int getIngressosVendidos() {
        return ingressosVendidos;
    }

    public boolean isEncerrado() {
        return encerrado;
    }

    public void setEncerrado(boolean encerrado) {
        this.encerrado = encerrado;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }
}
