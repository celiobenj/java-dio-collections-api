package celio.edu.map.operacoes_basicas.agenda_contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 1000000);
        agendaContatos.adicionarContato("Contato 4", 2000000);
        agendaContatos.adicionarContato("Contato 3", 5000000);
        agendaContatos.adicionarContato("Contato 1", 2000000);
        agendaContatos.adicionarContato("Contato 2", 4000000);

        // agendaContatos.removerContato("Contato 4");

        agendaContatos.exibirContatos();

        System.out.println("O número é: "+agendaContatos.pesquisarPorNome("Contato 2"));
    }
    
    
}
