public class Empregado {
    double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return this.salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        return departamento.alcancouMeta() ? 0.1 * this.salarioFixo : 0.0;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return this.salarioFixo + this.calcularBonus(departamento);
    }
}
