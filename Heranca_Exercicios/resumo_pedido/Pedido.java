import static java.lang.String.format;

public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
        }
        return total * (1 - percentualDesconto / 100);
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }

    public void apresentarResumoPedido() {
        Double totalPedido = 0.0;
        System.out.println("------- RESUMO PEDIDO -------");
        for (ItemPedido item : itens) {
            totalPedido += item.getQuantidade() * item.getProduto().obterPrecoLiquido();
            System.out.println(
                    format("Tipo: %s Titulo: %s Preco: %.2f  Quant: %d  Total: %.2f",
                    item.getProduto().getClass().getSimpleName(),
                    item.getProduto().getTitulo(),
                    item.getProduto().obterPrecoLiquido(),
                    item.getQuantidade(),
                    (item.getQuantidade() * item.getProduto().obterPrecoLiquido())));
        }
        System.out.println("----------------------------");
        System.out.println(format("DESCONTO: %.2f", getPercentualDesconto() != 0.0 ? totalPedido / getPercentualDesconto(): 0.0));
        System.out.println(format("TOTAL PRODUTOS: %.2f", totalPedido));
        System.out.println("----------------------------");
        System.out.println(format("TOTAL PEDIDO: %.2f", calcularTotal()));
        System.out.println("----------------------------");
    }
}
