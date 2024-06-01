package celio.edu.set.ordenacao.lista_alunos;

import java.util.Comparator;

public class ComparatorPorNota implements Comparator<Alunos>{

    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }

    
}