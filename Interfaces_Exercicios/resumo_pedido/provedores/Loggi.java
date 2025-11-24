package provedores;

public class Loggi implements ProvedorFrete{
    @Override
    public Frete calcularFrete(double peso, double valor) {
        if (peso < 5000) {
            return new Frete(valor * 0.04, obterTipoProvedorFrete());
        }
        return new Frete(valor * 0.12, obterTipoProvedorFrete());
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
