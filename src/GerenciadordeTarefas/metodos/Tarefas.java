package GerenciadordeTarefas.metodos;

public class Tarefas {
    private String nome;
    private String descricao;
    private int prioridade;
    private boolean concluida;

    public Tarefas(String nome, String descricao, int prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        String status = concluida ? "[X]" : "[ ]"; //tipo um if/else, só que resumido.
        String prioridadeTexto = switch (prioridade) {
            case 1 -> "Alta";
            case 2 -> "Média";
            case 3 -> "Baixa";
            default -> "Indefinido";
        };
        return status + " " + nome + " (Prioridade: " + prioridadeTexto + ") - " + descricao;
    }


}
