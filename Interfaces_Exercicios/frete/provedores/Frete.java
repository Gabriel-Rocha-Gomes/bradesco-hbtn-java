package provedores;

public class Frete {
    private Double valor;
    private TipoProvedorFrete tipoProvedorFrete;

    public Frete(Double valor, TipoProvedorFrete tipoProvedorFrete) {
        this.valor = valor;
        this.tipoProvedorFrete = tipoProvedorFrete;
    }

    public Double getValor() {
        return valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }
}
