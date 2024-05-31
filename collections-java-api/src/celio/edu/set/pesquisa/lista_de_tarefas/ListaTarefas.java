package celio.edu.set.pesquisa.lista_de_tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;

        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaRemover = t;
                break;
            }
        }

        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa t : tarefaSet) {
            if (t.isConcluida() == true) {
                tarefasConcluidas.add(t);
            }
        }

        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa t : tarefaSet) {
            if (t.isConcluida() == false) {
                tarefasPendentes.add(t);
            }
        }

        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao() == descricao) {
                t.setConcluida(true);
            }
        }
    }
    
    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao() == descricao) {
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Dever 1");
        listaTarefas.adicionarTarefa("Dever 2");
        listaTarefas.adicionarTarefa("Dever 3");
        listaTarefas.adicionarTarefa("Dever 4");
        listaTarefas.adicionarTarefa("Dever 5");
        listaTarefas.adicionarTarefa("Dever 3");
        listaTarefas.adicionarTarefa("Dever 2");

        listaTarefas.exibirTarefas();

        listaTarefas.removerTarefa("Dever 1");
        listaTarefas.removerTarefa("Dever 2");

        listaTarefas.marcarTarefaConcluida("Dever 3");
        listaTarefas.marcarTarefaConcluida("Dever 4");

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaPendente("Dever 4");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();
    }


}
