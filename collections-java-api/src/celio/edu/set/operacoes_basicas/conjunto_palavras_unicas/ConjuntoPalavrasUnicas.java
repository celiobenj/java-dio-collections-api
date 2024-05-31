package celio.edu.set.operacoes_basicas.conjunto_palavras_unicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraParaRemover = null;

        for (Palavra p : palavraSet) {
            if (p.getPalavra().equalsIgnoreCase(palavra)) {
                palavraParaRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra){
        for (Palavra p : palavraSet) {
            if (p.getPalavra() == palavra) {
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 1");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 3");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 4");
        conjuntoPalavrasUnicas.adicionarPalavra("Palavra 2");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));
        conjuntoPalavrasUnicas.removerPalavra("Palavra 2");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Palavra 2"));
    }

    
}
