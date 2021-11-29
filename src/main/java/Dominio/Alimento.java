package Dominio;

import java.time.LocalDate;

//TODO REGRA DE NEGOCIO
public class Alimento {
    private Long id;
    private String nome;
    private Float carboidrato;
    private Float proteina;
    private Float gordura;
    private LocalDate dataRegistro;
    private TipoAlimento tipoAlimento;

    public Alimento() {
    }

    public Alimento(String nome, Float carboidrato, Float proteina, Float gordura, LocalDate dataRegistro) {
        this.nome = nome;
        this.carboidrato = carboidrato;
        this.proteina = proteina;
        this.gordura = gordura;
        this.dataRegistro = dataRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getCarboidrato() {
        return carboidrato;
    }

    public void setCarboidrato(Float carboidrato) {
        this.carboidrato = carboidrato;
    }

    public Float getProteina() {
        return proteina;
    }

    public void setProteina(Float proteina) {
        this.proteina = proteina;
    }

    public Float getGordura() {
        return gordura;
    }

    public void setGordura(Float gordura) {
        this.gordura = gordura;
    }
}