package Dominio;

import java.time.LocalDate;

// Atributos
public class Pessoa {
    private Long id;
    private String nome;
    private String login;
    private LocalDate dataNascimento;

// Método Construtor


    public Pessoa(Long id, String nome, String login, LocalDate dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.dataNascimento = dataNascimento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //TODO IMPLEMENTAR REGRA DE NEGOCIO
}
