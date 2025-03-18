package calculotributos;

import calculotributos.CalculadoraTributos;
import calculotributos.ProdutoAlimentacao;
import calculotributos.ProdutoSaudeBemEstar;
import calculotributos.ProdutoVestuario;
import calculotributos.ProdutoCultura;

public class Main {
    public static void main(String[] args) {
        CalculadoraTributos calculadora = new CalculadoraTributos();

        ProdutoAlimentacao alimentacao = new ProdutoAlimentacao();
        ProdutoSaudeBemEstar saudeBemEstar = new ProdutoSaudeBemEstar();
        ProdutoVestuario vestuario = new ProdutoVestuario();
        ProdutoCultura cultura = new ProdutoCultura();

        double valorProduto = 100.0;

        double tributoAlimentacao = calculadora.calcularTributo(alimentacao, valorProduto);
        double tributoSaudeBemEstar = calculadora.calcularTributo(saudeBemEstar, valorProduto);
        double tributoVestuario = calculadora.calcularTributo(vestuario, valorProduto);
        double tributoCultura = calculadora.calcularTributo(cultura, valorProduto);

        System.out.println("Tributo Alimentação: R$" + tributoAlimentacao);
        System.out.println("Tributo Saúde e Bem-estar: R$" + tributoSaudeBemEstar);
        System.out.println("Tributo Vestuário: R$" + tributoVestuario);
        System.out.println("Tributo Cultura: R$" + tributoCultura);
    }
}