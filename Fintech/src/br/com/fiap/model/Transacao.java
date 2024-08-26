package br.com.fiap.model;

public class Transacao {
    // Atributos
    private double valor;
    private String data;
    private String descricao;

    // Construtor padrão
    public Transacao() {

    }

    // Construtor da superclasse
    public Transacao(double valor, String data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    // Getters e Setters da superclasse (comuns a br.com.fiap.model.Gastos e br.com.fiap.model.Ganhos)
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
}