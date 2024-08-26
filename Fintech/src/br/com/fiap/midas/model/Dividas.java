package br.com.fiap.midas.model;

public class Dividas {
    // Atributos
    private double valorDivida;

    private String dataDivida; // dd/mm/aaaa

    private String dataPagamento; // dd/mm/aaaa

    private String descricaoDivida;

    private boolean paga;

    private double juros;

    // Construtor padrão
    public Dividas() { }

    // Construtor com todos os atributos obrigatórios

    public Dividas(double valorDivida, String dataPagamento, String dataDivida, String descricaoDivida, boolean paga, double juros) {
        this.valorDivida = valorDivida;
        this.dataPagamento = dataPagamento;
        this.dataDivida = dataDivida;
        this.descricaoDivida = descricaoDivida;
        this.paga = paga;
        this.juros = juros;
    }

    // Construtor com a data da dívida e a descrição opcionais

    public Dividas(double valorDivida, String dataPagamento, boolean paga, double juros) {
        this.valorDivida = valorDivida;
        this.dataPagamento = dataPagamento;
        this.paga = paga;
        this.juros = juros;
    }

    // Método

    public void divida() {

        System.out.println("Sua dívida no valor de: " + valorDivida + " reais, foi cadastrada e você receberá um lembrete no dia: " + dataPagamento);

    }

    // Getters e Setters de dívidas
    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public String getDataDivida() {
        return dataDivida;
    }

    public void setDataDivida(String dataDivida) {
        this.dataDivida = dataDivida;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getDescricaoDivida() {
        return descricaoDivida;
    }

    public void setDescricaoDivida(String descricaoDivida) {
        this.descricaoDivida = descricaoDivida;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}
