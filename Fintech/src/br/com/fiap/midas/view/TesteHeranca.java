package br.com.fiap.midas.view;

import br.com.fiap.midas.model.subclasse.Ganhos;
import br.com.fiap.midas.model.subclasse.Gastos;

public class TesteHeranca {
    public static void main(String[] args) {
        Ganhos ganho = new Ganhos(1650, "19/04/2024", "Dinheiro ganho com freelance.");
        Gastos gasto = new Gastos(258, "30/06/2024", "Um gasto feito durante o mês de Junho para" +
                "a locomação ao tabalho.", "Transporte");
        ganho.toString();
        gasto.toString();
    }
}
