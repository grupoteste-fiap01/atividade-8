package br.com.fiap.model;

public class Gastos extends Transacao {
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

    // Getter e Setter específicos de br.com.fiap.model.Gastos
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}