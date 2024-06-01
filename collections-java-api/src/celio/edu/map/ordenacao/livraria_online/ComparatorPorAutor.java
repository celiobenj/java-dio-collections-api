package celio.edu.map.ordenacao.livraria_online;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return l1.getValue().getAutor().compareToIgnoreCase(l2.getValue().getAutor());
    }
    
}
