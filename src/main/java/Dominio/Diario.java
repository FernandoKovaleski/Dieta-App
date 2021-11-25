package Dominio;

import java.time.LocalDate;

public class Diario {
    private Long id;
    private LocalDate data;
    private String relatorio;

    public Diario(Long id, LocalDate data, String relatorio) {
        this.id = id;
        this.data = data;
        this.relatorio = relatorio;
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

    //TODO IMPLEMENTAR REGRA DE NEGOCIO
}
