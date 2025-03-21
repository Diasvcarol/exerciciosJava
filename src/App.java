public class App {
    public static void main(String[] args) throws Exception {

        //new -> Alocar espaço de memória para variáveis de tipo primitivo.
        Pessoa pessoa = new Pessoa("Carolina Viola",
                                    24,
                                    "araujocarolina@edu.unisinos.br",
                                    1550.00);
        
        //Calcular o valor da parcela possível de acordo com o salário.
        double retornoCalcParcela = pessoa.ValorParcelaVeiculo(1550.00);
        //Imprimir dados.
        pessoa.ImprimirDados(retornoCalcParcela);

        double totalFinanImob = (pessoa.ValorParcFinanImob(1550.00) * 360);
        pessoa.ImprimirDadosFinan(totalFinanImob);
    }
}
