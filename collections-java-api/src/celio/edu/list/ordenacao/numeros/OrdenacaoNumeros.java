package celio.edu.list.ordenacao.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Numeros> listaNum;

    public OrdenacaoNumeros() {
        this.listaNum = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNum.add(new Numeros(numero));
    }

    public List<Numeros> ordenarAscendente(){
        List<Numeros> numAscendente = new ArrayList<>(listaNum);
        Collections.sort(numAscendente);
        return numAscendente;
    }

    // public List<Numeros> ordenarDescendente(){
    //     List<Numeros> numDescendente = new ArrayList<>(listaNum);
    //     numDescendente.sort(Collections.reverseOrder());
    //     return numDescendente;
    // }

    public List<Numeros> ordenarDescendente(){
        List<Numeros> numDescendente = new ArrayList<>(listaNum);
        Collections.sort(numDescendente);
        Collections.reverse(numDescendente);
        return numDescendente;
    }
    
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(0);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(-3);
        ordenacaoNumeros.adicionarNumero(-9);
        ordenacaoNumeros.adicionarNumero(124);
        ordenacaoNumeros.adicionarNumero(340);
        ordenacaoNumeros.adicionarNumero(13);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }

}
