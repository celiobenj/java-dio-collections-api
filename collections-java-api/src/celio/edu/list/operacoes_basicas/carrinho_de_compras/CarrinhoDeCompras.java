package celio.edu.list.operacoes_basicas.carrinho_de_compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemCarrinho;

    public CarrinhoDeCompras() {
        this.itemCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemCarrinho){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemCarrinho.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        int valorTotal = 0;

        for (Item i : itemCarrinho){
            valorTotal += i.getPreco() * i.getQuantidade();
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itemCarrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println(carrinhoDeCompras.calcularValorTotal());
        
        carrinhoDeCompras.adicionarItem("Camisa",50, 5);
        carrinhoDeCompras.adicionarItem("Bermuda", 80, 4);
        carrinhoDeCompras.adicionarItem("Calça",120, 3);
        
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        
        carrinhoDeCompras.removerItem("Camisa");
        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        
    }
}
