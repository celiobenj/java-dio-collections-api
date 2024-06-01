package celio.edu.map.pesquisa.estoque_produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorValor = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                double valor = p.getPreco()*p.getQuantidade();
                if (valor > maiorValor) {
                    maiorValor = valor;
                    produtoMaiorQuantidadeValorTotalNoEstoque = p;
                }
            }
        }

        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(123, "Produto 2", 1, 10);
        estoqueProdutos.adicionarProduto(124, "Produto 1", 2, 10);
        estoqueProdutos.adicionarProduto(125, "Produto 3", 1, 10);
        estoqueProdutos.adicionarProduto(125, "Produto 5", 1, 10);
        estoqueProdutos.adicionarProduto(126, "Produto 4", 5, 10);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: "+estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais barato: "+estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto mais caro: "+estoqueProdutos.obterProdutoMaisCaro());

        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
