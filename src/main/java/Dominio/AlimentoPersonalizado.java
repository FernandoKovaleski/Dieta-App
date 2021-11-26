package Dominio;

//TODO IMPLEMENTAR REGRA DE NEGOCIO SE HOUVER
public class AlimentoPersonalizado {
    private Long id;
    private Alimento alimento;
    private Enum TipoAlimento;

    public AlimentoPersonalizado(Long id, Alimento alimento, Enum tipoAlimento) {
        this.id = id;
        this.alimento = alimento;
        TipoAlimento = tipoAlimento;
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

    public Enum getTipoAlimento() {
        return TipoAlimento;
    }

    public void setTipoAlimento(Enum tipoAlimento) {
        TipoAlimento = tipoAlimento;
    }
}
