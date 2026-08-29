public class Calculadora {
    private double resultado;

    public Calculadora() {
        this.resultado = 0.0;
    }
    public Calculadora(double resultadoInicial) {
        this.resultado = resultadoInicial;
    }
    public double obterResultado() {
        return this.resultado;
    }
    public double somar(double num1, double num2) {
        this.resultado = num1 + num2;
        return this.resultado;
    }
}
