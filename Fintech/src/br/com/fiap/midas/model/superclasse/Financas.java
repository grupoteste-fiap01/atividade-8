package br.com.fiap.midas.model.superclasse;

public abstract class Financas {
    // Atributos
    private double valor;
    private String data;
    private String descricao;

    // Construtor padrão
    public Financas() {

    }

    // Construtor personalizado
    public Financas(double valor, String data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    // Getters e Setters comuns aos Gastos e Ganhos
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String toString();
}