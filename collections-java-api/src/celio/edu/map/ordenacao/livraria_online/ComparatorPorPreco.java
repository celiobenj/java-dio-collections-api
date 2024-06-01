package celio.edu.map.ordenacao.livraria_online;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        return Double.compare(l1.getValue().getPreco(), l2.getValue().getPreco());
    }
    
}
