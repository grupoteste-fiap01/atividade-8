package br.com.fiap.midas.model.subclasse;

import br.com.fiap.midas.model.superclasse.Financas;

public class Ganhos extends Financas {
    // Atributos
    // ...

    // Construtor padrão
    public Ganhos() {
        super();
    }

    // Construtor da subclasse
    public Ganhos(double valor, String data, String descricao) {
        super(valor, data, descricao);
    }

    // Métodos específicos de Ganhos
    // ...

    @Override
    public String toString() {
        String value = STR."Seu ganho:\n Valor: \{getValor()}\n Data: \{getData()}\n Descrição: \{getDescricao()}\n" +
                "Foi cadastrado com sucesso!";
        System.out.println(value);
        return value;
    }
}