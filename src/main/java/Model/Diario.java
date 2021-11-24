package Model;

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


}
