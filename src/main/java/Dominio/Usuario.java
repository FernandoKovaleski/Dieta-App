package Dominio;

import java.time.LocalDate;

public class Usuario extends Pessoa {
    private Float altura;
    private Float peso;
    private Float metabolismo;
    private Enum sexo;
    private Enum situacao;
    private Enum fatorAtividade;
    private Servico servico;

    public Usuario(Long id, String nome, String login, String senha, LocalDate dataNascimento, Float altura,
                   Float peso, Float metabolismo, Enum sexo, Enum situacao, Enum fatorAtividade,
                   Servico servico) {
        super(id, nome, login, senha, dataNascimento);
        this.altura = altura;
        this.peso = peso;
        this.metabolismo = metabolismo;
        this.sexo = sexo;
        this.situacao = situacao;
        this.fatorAtividade = fatorAtividade;
        this.servico = servico;
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

    public Float getMetabolismo() {
        return metabolismo;
    }

    public void setMetabolismo(Float metabolismo) {
        this.metabolismo = metabolismo;
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

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
}