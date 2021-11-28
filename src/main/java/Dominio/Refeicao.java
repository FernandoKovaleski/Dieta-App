package Dominio;

public class Refeicao {
    private Integer id;
    private TipoRefeicao tipoRefeicao;
    private Alimento alimento;

    public Refeicao(Integer id, TipoRefeicao tipoRefeicao, Alimento alimento) {
        this.id = id;
        this.tipoRefeicao = tipoRefeicao;
        this.alimento = alimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TipoRefeicao getTipoRefeicao() {
        return tipoRefeicao;
    }

    public void setTipoRefeicao(TipoRefeicao tipoRefeicao) {
        this.tipoRefeicao = tipoRefeicao;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }
}
