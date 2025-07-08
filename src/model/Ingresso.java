package model;

public class Ingresso {
    private String tipoIngresso;
    private Sessao sessaoIngresso;
    private Cliente clienteIngresso;

    public Ingresso(Cliente cliente, Sessao sessao, String tipo) {
        this.clienteIngresso = cliente;
        this.sessaoIngresso = sessao;
        this.tipoIngresso = tipo;
    }

    public String getTipoIngresso() {
        return this.tipoIngresso;
    }

    public Sessao getSessaoIngresso() {
        return this.sessaoIngresso;
    }

    public Cliente getClienteIngresso() {
        return this.clienteIngresso;
    }

    public String toString() {
        String var10000 = this.tipoIngresso;
        return "\nIngresso do tipo " + var10000 + ", para a sessao das " + this.sessaoIngresso.getHorario() + " para o filme " + this.sessaoIngresso.getFilme() + ", cliente = " + this.clienteIngresso.getNome();
    }
}
