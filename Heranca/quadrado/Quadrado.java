package Heranca.quadrado;

import Heranca.retangulo.Retangulo;

public class Quadrado extends Retangulo {
    private double lado;

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        }
        this.lado = lado;
        this.setAltura(lado);
        this.setLargura(lado);
    }

    public String toString() {
        return String.format("[Quadrado] %.2f", lado);
    }

}
