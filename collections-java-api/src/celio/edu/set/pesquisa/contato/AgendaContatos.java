package celio.edu.set.pesquisa.contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        
        agendaContatos.adicionarContato("A Silva", 1);
        agendaContatos.adicionarContato("B Silva", 4);
        agendaContatos.adicionarContato("C Benjamim", 2);
        agendaContatos.adicionarContato("C Carvalho", 3);
        agendaContatos.adicionarContato("D Souza", 4);
        
        agendaContatos.exibirContatos();
        
        // System.out.println(agendaContatos.pesquisarPorNome("A"));
        
        agendaContatos.atualizarNumeroContato("A Silva", 110011);

        agendaContatos.exibirContatos();
    }

}
