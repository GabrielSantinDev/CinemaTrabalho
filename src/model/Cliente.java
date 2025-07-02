package model;

import java.util.ArrayList;

public class Cliente extends Pessoa {

    private ArrayList<Ingresso> listaIngressos = new ArrayList<>();

    public Cliente(String nome, int idade) {
        super(nome, idade);
    }
}
