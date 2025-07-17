public class Retangulo extends FormaGeometrica {
    protected double largura;
    protected double altura;

    public double area() {
        return this.largura * this.altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        if (largura <= 0) {
            throw new IllegalArgumentException("Largura deve ser maior que zero");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Largura deve ser maior que zero");
        }
        this.altura = altura;
    }

    public String toString() {
        return String.format("[Retangulo] %.2f / %.2f", largura, altura);
    }
}
