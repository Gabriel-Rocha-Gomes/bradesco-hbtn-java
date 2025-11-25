package liquido;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10;
    public Supplier<Double> precoComMarkup;
    public Consumer<Double> atualizarMarkup;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
        this.precoComMarkup = () -> preco * (1 + (percentualMarkup / 100));
        this.atualizarMarkup = (Double percentual) -> {
            if (percentual > 0) {
                this.percentualMarkup = percentual;
            }
        };
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkup() {
        return percentualMarkup;
    }

    public void setPercentualMarkup(double percentualMarkup) {
        this.percentualMarkup = percentualMarkup;
    }
}
