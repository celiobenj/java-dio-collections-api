package celio.edu.map.ordenacao.agenda_eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    Map<LocalDate, Evento> agendaMap;

    public AgendaEventos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        agendaMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();

        for (Map.Entry<LocalDate, Evento> entry : agendaMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("O próximo evento " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(1999, 7, 20), "Live AID 1", "Queens");
        agenda.adicionarEvento(LocalDate.of(2020, 7, 20), "Live AID 2", "BEATLES");
        agenda.adicionarEvento(LocalDate.of(2024, 4, 20), "Live AID 3", "ACDC");
        agenda.adicionarEvento(LocalDate.of(2024, 4, 20), "Live AID MAIS NOVO POSSÍVEL", "BEATLES");
        agenda.adicionarEvento(LocalDate.of(2025, 6, 1), "Live AID 4", "PINK FLOYD");
        agenda.adicionarEvento(LocalDate.of(2028, 8, 20), "Live AID 1", "METALICA");
        agenda.adicionarEvento(LocalDate.of(2036, 7, 20), "Live AID 4", "Michael Jackson");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }
}