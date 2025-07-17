public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }
    
    @Override
    double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta()) {
            double difference = departamento.getValorAtingidoMeta() - departamento.getValorMeta();
            return 0.2 * this.salarioFixo + (0.01 * difference);
        } else {
            return 0.0;
        }
    }
}
