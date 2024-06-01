package celio.edu.map.pesquisa.contagem_palavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemPalavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavrasMap);
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente() {
        Map<String, Integer> palavraMaisFrequenteMap = new HashMap<>();
        String palavraMaisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;

        if (!contagemPalavrasMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
                if (entry.getValue() > maiorContagem) {
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }

        palavraMaisFrequenteMap.put(palavraMaisFrequente, maiorContagem);
        return palavraMaisFrequenteMap;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        // Exibe a contagem total de linguagens
        contagemLinguagens.exibirContagemPalavras();

        // Encontra e exibe a linguagem mais frequente
        System.out.println("A linguagem mais frequente é: " + contagemLinguagens.encontrarPalavraMaisFrequente());

    }

}
