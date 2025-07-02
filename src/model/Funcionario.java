package model;

import util.ServicoVendas;

public class Funcionario extends Pessoa {

    private ServicoVendas servicoVendas = new ServicoVendas();

    public Funcionario(String nome, int idade) {
        super(nome, idade);
    }
}
