package celio.edu.set.ordenacao.lista_alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Alunos> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Alunos(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        Alunos alunoParaRemover = null;

        for (Alunos a : alunosSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                break;
            }
        }

        alunosSet.remove(alunoParaRemover);
    }

    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> alunosPorNome = new TreeSet<>(alunosSet);
        return alunosPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Carlos", 2415080041l, 10);
        gerenciadorAlunos.adicionarAluno("Andre", 2415080042l, 8);
        gerenciadorAlunos.adicionarAluno("Joao", 2415080043l, 6);
        gerenciadorAlunos.adicionarAluno("Marcelo", 2415080044l, 7);
        gerenciadorAlunos.adicionarAluno("Ana", 2415080043l, 5);
        gerenciadorAlunos.adicionarAluno("Maria", 2415080045l, 0);

        // gerenciadorAlunos.exibirAlunos();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        // System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }


    
}
