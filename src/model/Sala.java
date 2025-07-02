package model;

import java.util.ArrayList;

public class Sala {

    private int capacidadeMax;
    private ArrayList<Sessao> listaSessoes = new ArrayList<>();

    public Sala(int capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public int getCapacidadeMax() {
        return capacidadeMax;
    }

    public void addSessao(Sessao sessao) {
        listaSessoes.add(sessao);
    }

    public ArrayList<Sessao> getListaSessoes() {
        return listaSessoes;
    }
}
