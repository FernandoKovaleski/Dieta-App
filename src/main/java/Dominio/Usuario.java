package Dominio;

import java.time.LocalDate;

public class Usuario extends Pessoa {
    private Float altura;
    private Float peso;
    private Enum sexo;
    private Enum situacao;
    private Enum fatorAtividade;
    private Refeicao refeicao;
    private Float metabolismo;

    public Usuario(Long id, String nome, String login, String senha, LocalDate dataNascimento,
                   Float altura, Float peso, Enum sexo, Enum situacao, Enum fatorAtividade,
                   Refeicao refeicao, Float metabolismo) {
        super(id, nome, login, senha, dataNascimento);
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.situacao = situacao;
        this.fatorAtividade = fatorAtividade;
        this.refeicao = refeicao;
        this.metabolismo = metabolismo;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Enum getSexo() {
        return sexo;
    }

    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }

    public Enum getSituacao() {
        return situacao;
    }

    public void setSituacao(Enum situacao) {
        this.situacao = situacao;
    }

    public Enum getFatorAtividade() {
        return fatorAtividade;
    }

    public void setFatorAtividade(Enum fatorAtividade) {
        this.fatorAtividade = fatorAtividade;
    }

    public Refeicao getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(Refeicao refeicao) {
        this.refeicao = refeicao;
    }

    public Float getMetabolismo() {
        return metabolismo;
    }

    public void setMetabolismo(Float metabolismo) {
        this.metabolismo = metabolismo;
    }

    //TODO REGRA DE NEGOCIO
}