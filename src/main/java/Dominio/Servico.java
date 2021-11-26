package Dominio;


//TODO IMPLEMENTAR OS SERVICOS
public class Servico {
    private long id;
    private Porcao porcao;
    private Refeicao refeicao;
    private AlimentoPersonalizado alimentoPersonalizado;

    public Servico() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Porcao getPorcao() {
        return porcao;
    }

    public void setPorcao(Porcao porcao) {
        this.porcao = porcao;
    }

    public AlimentoPersonalizado getAlimentoPersonalizado() {
        return alimentoPersonalizado;
    }

    public void setAlimentoPersonalizado(AlimentoPersonalizado alimentoPersonalizado) {
        this.alimentoPersonalizado = alimentoPersonalizado;
    }

    //TODO REGRA DE NEGOCIO, INCLUIR, EDITAR ALIMENTO PERSONALIZADO
    //TODO REGRA DE NEGOCIO, CREATE , DELETE PORCAO, READ TOTAL CALORIAS, CARBOIDRATOS, GORDURA, PROTEINAS REFEICAO

}