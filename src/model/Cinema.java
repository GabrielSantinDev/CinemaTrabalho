package model;

import java.util.ArrayList;

public class Cinema {

    private ArrayList<Sala> listaSalas = new ArrayList<>();

    private Funcionario funcionario;


    public Sala addSala(Sala sala) {
        this.listaSalas.add(sala);
        return sala;
    }

    public ArrayList<Sala> getListaSalas() {
        return listaSalas;
    }

    public void setListaSalas(ArrayList<Sala> listaSalas) {
        this.listaSalas = listaSalas;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
