package br.com.fiap.midas.model.subclasse;

import br.com.fiap.midas.model.superclasse.Financas;

public class Gastos extends Financas {
    // Atributos
    private String categoria;

    // Construtor padrão
    public Gastos() {
        super();
    }

    // Construtor da subclasse
    public Gastos(double valor, String data, String descricao, String categoria) {
        super(valor, data, descricao);
        this.categoria = categoria;
    }

    // Métodos específicos de Gastos
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        String value = STR."Seu gasto:\n Valor: \{getValor()}\n Data: \{getData()}\n Descrição: \{getDescricao()}\n" +
                STR." Categoria: \{getCategoria()}\nFoi cadastrado com sucesso!";
        System.out.println(value);
        return value;
    }
}