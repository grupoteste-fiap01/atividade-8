package br.com.fiap.midas.model;

public class Login {
    private String nomeCompleto;

    private String senha;

    private String dataNascimento; // dd/mm/aaaa

    private char genero;

    private String email;


    // Construtor padrão

    public Login() { }

    // Construtor com parâmetros

    public Login(String nomeCompleto, String senha, String dataNascimento, char genero, String email) {

        this.nomeCompleto = nomeCompleto;

        this.senha = senha;

        this.dataNascimento = dataNascimento;

        this.genero = genero;

        this.email = email;
    }



    // Método

    public void login() {

        System.out.println("Olá " + nomeCompleto + ", seu login foi realizado com sucesso!");

    }

    // Getters e Setters de Login


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}