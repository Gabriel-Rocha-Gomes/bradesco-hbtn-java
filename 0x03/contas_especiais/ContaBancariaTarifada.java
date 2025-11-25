import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;
    private static final double TARIFA_TRANSACAO = 0.10;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
        this.quantidadeTransacoes = 0;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        aplicarTarifaTransacao();
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        aplicarTarifaTransacao();
    }

    private void aplicarTarifaTransacao() {
        try {
            super.sacar(TARIFA_TRANSACAO);
            quantidadeTransacoes++;
        } catch (OperacaoInvalidaException e) {
            // Se não houver saldo para a tarifa, a transação ainda é contabilizada
            quantidadeTransacoes++;
        }
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }
}
