package Dominio;

import java.time.LocalDate;

public class Refeicao {
    private Long id;
    private String nome;
    private Enum tipo;
    private LocalDate diaDaSemana;

    public Refeicao(Long id, String nome, Enum tipo, LocalDate diaDaSemana) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.diaDaSemana = diaDaSemana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Enum getTipo() {
        return tipo;
    }

    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }

    public LocalDate getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(LocalDate diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }
    //TODO IMPLEMENTAR REGRA DE NEGOCIO
}