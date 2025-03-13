package orientacaoObjeto;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;
        p1.desconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.printf("O produto é: %s ", p1.nome);
        System.out.printf("\nO produto é: %s", p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        System.out.printf("\nO preço final do produto é de R$%.2f", precoFinal1);

        double precoFinal2 = p2.precoComDesconto(0.1);
        System.out.printf("\nO preço final do produto com desconto do gerente é de R$%.2f", precoFinal2);

        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
        System.out.printf("\nA média do carinho é de : R$%.2f" , mediaCarrinho);
    }
}
