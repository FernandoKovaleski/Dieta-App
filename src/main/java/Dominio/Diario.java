package Dominio;

import java.sql.Ref;
import java.time.LocalDate;

public class Diario {
    private Long id;
    private LocalDate data;
    private String relatorio;
    private Refeicao refeicao;

    public Diario(Long id, LocalDate data, String relatorio, Refeicao refeicao) {
        this.id = id;
        this.data = data;
        this.relatorio = relatorio;
        this.refeicao = refeicao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    public Refeicao getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(Refeicao refeicao) {
        this.refeicao = refeicao;
    }
    //TODO IMPLEMENTAR REGRA DE NEGOCIO
}
