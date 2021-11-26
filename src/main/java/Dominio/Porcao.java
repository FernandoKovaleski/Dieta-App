package Dominio;

public class Porcao {
    private Long id;
    private Alimento alimento;
    private Refeicao refeicao;
    private Float porcao;

    public Porcao(Long id, Alimento alimento, Refeicao refeicao, Float porcao) {
        this.id = id;
        this.alimento = alimento;
        this.refeicao = refeicao;
        this.porcao = porcao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }

    public Refeicao getRefeicao() {
        return refeicao;
    }

    public void setRefeicao(Refeicao refeicao) {
        this.refeicao = refeicao;
    }

    public Float getPorcao() {
        return porcao;
    }

    public void setPorcao(Float porcao) {
        this.porcao = porcao;
    }
}
