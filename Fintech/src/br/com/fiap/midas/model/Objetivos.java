package br.com.fiap.midas.model;

public class Objetivos {
    private String nomeObjetivo;

    private double valorObjetivo;

    private String dataObjetivo; // dd/mm/aaaa

    private String descricaoObjetivo;


    // Construtor padrão

    public Objetivos() { }

    // Construtor com descrição opcional

    public Objetivos(String nomeObjetivo, double valorObjetivo, String dataObjetivo) {

        this.nomeObjetivo = nomeObjetivo;

        this.valorObjetivo = valorObjetivo;

        this.dataObjetivo = dataObjetivo;

    }

    // Construtor com descrição obrigatória

    public Objetivos(String nomeObjetivo, double valorObjetivo, String dataObjetivo, String descricaoObjetivo) {

        this.nomeObjetivo = nomeObjetivo;

        this.valorObjetivo = valorObjetivo;

        this.dataObjetivo = dataObjetivo;

        this.descricaoObjetivo = descricaoObjetivo;

    }

    // Método

    public void objetivo() {

        System.out.println("Seu objetivo: " + nomeObjetivo + ", que necessita de " + valorObjetivo + " reais, foi cadastrado com sucesso!");

    }

    // Getters e Setters de Objetivos

    public String getNomeObjetivo() {
        return nomeObjetivo;
    }

    public void setNomeObjetivo(String nomeObjetivo) {
        this.nomeObjetivo = nomeObjetivo;
    }

    public double getValorObjetivo() {
        return valorObjetivo;
    }

    public void setValorObjetivo(double valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }

    public String getDataObjetivo() {
        return dataObjetivo;
    }

    public void setDataObjetivo(String dataObjetivo) {
        this.dataObjetivo = dataObjetivo;
    }

    public String getDescricaoObjetivo() {
        return descricaoObjetivo;
    }

    public void setDescricaoObjetivo(String descricaoObjetivo) {
        this.descricaoObjetivo = descricaoObjetivo;
    }
}
