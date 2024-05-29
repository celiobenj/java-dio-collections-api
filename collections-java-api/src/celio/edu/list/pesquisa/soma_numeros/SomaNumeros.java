package celio.edu.list.pesquisa.soma_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Numeros> listaNum;

    public SomaNumeros() {
        this.listaNum = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNum.add(new Numeros(numero));
    }

    public int calcularSoma(){
        int soma = 0;
        if (!listaNum.isEmpty()) {
            for (Numeros n : listaNum) {
                soma += n.getNumero();
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNum = Integer.MIN_VALUE;
        if(!listaNum.isEmpty()){
            for (Numeros n : listaNum) {
                if(n.getNumero() > maiorNum){
                    maiorNum = n.getNumero();
                }
            }
        }
        
        return maiorNum;
    }

    public int encontrarMenorNumero(){
        int menorNum = Integer.MAX_VALUE;
        if(!listaNum.isEmpty()){
            for (Numeros n : listaNum) {
                if(n.getNumero() < menorNum){
                    menorNum = n.getNumero();
                }
            }
        }
        
        return menorNum;
    }

    public void exibirNumeros(){
        System.out.println(listaNum);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-1);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(-5);

        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();
    }
    
}
