public class Pessoa {

    //Definição de atributos
    private String nome;
    private int idade;
    private String email;
    private double salario;

    //método construtor com parametros
    public Pessoa(String _nome, int _idade, String _email, double _salario) {
        this.nome = _nome == "" ? "*****" : _nome;
        this.idade = _idade;
        this.email = _email;
        this.salario = _salario;
    }

    public double ValorParcelaVeiculo(double salario) {
        double valorParcela = 0;

        if (salario <= 5000) {
            valorParcela = salario * 0.2;

        } else if (salario > 5000 && salario <= 8000) {
            valorParcela = salario * 0.3;

        } else {
            valorParcela = salario * 0.35;
        }

        return valorParcela;
    }

    public void ImprimirDados(double valorParcela) {
        System.out.println("Prezado(a), " + this.nome +
                            " você poderá utilizar R$ " + valorParcela +
                            " do seu salário R$ " + this.salario +
                            " em um financiamento de veículo.");
    }

    public double ValorParcFinanImob(double salario) {
        double valorParc = 0;

        if (salario <= 5000) {
            valorParc = salario * 0.05;

        } else if (salario > 5000 && salario <= 8000) {
            valorParc = salario * 0.06;

        } else {
            valorParc = salario * 0.065;
        }

        return valorParc;
    }

    public void ImprimirDadosFinan(double valorParc) {
        System.out.println("Prezado(a), " + this.nome +
                            " você poderá fazer um financiamento imobiliário de R$ " + valorParc +
                            " com o seu salário R$ " + this.salario);
    }
}
