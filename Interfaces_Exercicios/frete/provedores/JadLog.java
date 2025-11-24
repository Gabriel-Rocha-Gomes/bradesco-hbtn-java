package provedores;

public class JadLog implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso < 2000) {
            return new Frete(valor * 0.045, obterTipoProvedorFrete());
        }
        return new Frete(valor * 0.07, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
