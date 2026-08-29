public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto("Notebook", 3500.00, 5);

        System.out.println("Valor em estoque p1: " + p1.calcularValorEstoque());
        System.out.println("Valor em estoque p2: " + p2.calcularValorEstoque());

        p2.adicionarEstoque(3);
        System.out.println("Novo valor em estoque p2: " + p2.calcularValorEstoque());

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Ana", 25.0, 160);

        System.out.println("Salario mensal f1: " + f1.calcularSalarioMensal());
        System.out.println("Salario mensal f2: " + f2.calcularSalarioMensal());

        f2.ajustarSalario(10);
        System.out.println("Salario ajustado f2: " + f2.calcularSalarioMensal());

        Retangulo r1 = new Retangulo();
        Retangulo r2 = new Retangulo(4.0, 5.0);

        System.out.println("Area r1: " + r1.calcularArea());
        System.out.println("Area r2: " + r2.calcularArea());

        r2.aumentarTamanho(6.0, 8.0);
        System.out.println("Nova area r2: " + r2.calcularArea());

        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente(1000.0);

        System.out.println("Saldo c1: " + c1.verificarSaldo());
        System.out.println("Saldo c2: " + c2.verificarSaldo());

        c2.depositar(250.0);
        System.out.println("Saldo c2 apos deposito: " + c2.verificarSaldo());

        Calculadora calc1 = new Calculadora();
        Calculadora calc2 = new Calculadora(100.0);

        System.out.println("Resultado calc1: " + calc1.obterResultado());
        System.out.println("Resultado calc2: " + calc2.obterResultado());

        calc2.somar(15, 27);
        System.out.println("Resultado calc2 apos somar: " + calc2.obterResultado());
    }
}