package celio.edu.map.operacoes_basicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> palavraMap;

    public Dicionario() {
        this.palavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        palavraMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        palavraMap.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(palavraMap);
    }

    public String pesquisarPorPalavra(String palavra){
        return palavraMap.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Pizza", "Pizza é legal");
        dicionario.adicionarPalavra("Banana", "Banana é legal");
        dicionario.adicionarPalavra("Maça", "Maça é legal");
        dicionario.adicionarPalavra("Pizza", "Pizza não é legal");

        // dicionario.exibirPalavras();
        
        System.out.println("Definição é: "+dicionario.pesquisarPorPalavra("Pizza"));
        
        dicionario.removerPalavra("Banana");
        dicionario.exibirPalavras();
    }
}
