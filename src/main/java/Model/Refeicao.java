package Model;

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
}
