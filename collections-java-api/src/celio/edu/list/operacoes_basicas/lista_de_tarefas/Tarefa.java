package celio.edu.list.operacoes_basicas.lista_de_tarefas;

public class Tarefa {
    private String descrição;

    public Tarefa(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }

    @Override
    public String toString() {
        // return "Tarefa {descrição=" + descrição + "}";
        return descrição;
    }
}