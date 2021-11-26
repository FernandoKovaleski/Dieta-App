package Dominio;

import java.time.LocalDate;

//TODO REGRA DE NEGOCIO
public class Alimento {
    private Long id;
    private Porcao porcao;
    private Float carboidrato;
    private Float proteina;
    private Float gordura;
    private LocalDate dataRegistro;

    public Alimento(Long id, Porcao porcao, Float carboidrato, Float proteina, Float gordura
                    ,LocalDate dataRegistro) {

        this.id = id;
        this.porcao = porcao;
        this.carboidrato = carboidrato;
        this.proteina = proteina;
        this.gordura = gordura;
        this.dataRegistro = dataRegistro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Porcao getPorcao() {
        return porcao;
    }

    public void setPorcao(Porcao porcao) {
        this.porcao = porcao;
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

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
