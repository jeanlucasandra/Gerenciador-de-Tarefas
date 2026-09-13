

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefas> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String nome, String descricao, int prioridade) {
        Tarefas novaTarefa = new Tarefas(nome, descricao, prioridade);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println((i + 1) + ". " + tarefas.get(i));

        }
    }

    public void marcarComoConcluida(int indice) {
        if (indice < 0 || indice >= tarefas.size()) {
            System.out.println("Indice inválido");
            return;
        }
        tarefas.get(indice).marcarComoConcluida();
        System.out.println("Tarefa marcada como concluida!");
    }

    public void removerTarefa(int indice) {
        if (indice < 0 || indice >= tarefas.size()) {
            System.out.println("Índice inválido!");
            return;
        }
        tarefas.remove(indice);
        System.out.println("Tarefa removida com sucesso!");
    }

}
