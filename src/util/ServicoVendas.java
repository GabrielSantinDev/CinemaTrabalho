package util;

import model.Cliente;
import model.Funcionario;
import model.Ingresso;
import model.Sessao;

public class ServicoVendas {
    public ServicoVendas() {
    }

    public void venderIngresso(Cliente cliente, Funcionario funcionario, String tipo, Sessao sessao) {
        if (sessao.isEncerrado()) {
            System.out.println("Sessão encerrada, não é possível comprar ingressos");
        } else if (sessao.getIngressosDisponiveis() > 0) {
            Ingresso novoIngresso = new Ingresso(cliente, sessao, tipo);
            cliente.adicionarIngresso(novoIngresso);
            sessao.venderIngressos();
            System.out.println("Ingresso do tipo " + tipo + " vendido para o cliente " + cliente.getNome() + " pelo funcionário " + funcionario.getNome() + " para o filme " + sessao.getFilme() + " no horário das " + sessao.getHorario());
        } else {
            System.out.println("Quantidade máxima de ingressos vendida");
        }

    }

    public boolean devolverIngresso(Cliente cliente, Sessao sessao, String tipo) {
        for(Ingresso ingresso : cliente.getListaIngressos()) {
            if (ingresso.getSessaoIngresso().equals(sessao) && ingresso.getTipoIngresso().equals(tipo)) {
                cliente.removerIngresso(ingresso);
                sessao.devolverIngressos();
                System.out.println("Ingresso devolvido com sucesso pelo cliente " + cliente.getNome());
                return true;
            }
        }

        System.out.println("Ingresso não encontrado para devolução");
        return false;
    }
}
