package model;

import java.util.ArrayList;

public class Cliente extends Pessoa {
    private ArrayList<Ingresso> listaIngressos = new ArrayList();

    public Cliente(String nome, int idade) {
        super(nome, idade);
    }

    public ArrayList<Ingresso> getListaIngressos() {
        return this.listaIngressos;
    }

    public void adicionarIngresso(Ingresso ingresso) {
        this.listaIngressos.add(ingresso);
    }

    public boolean removerIngresso(Ingresso ingresso) {
        return this.listaIngressos.remove(ingresso);
    }
}
