
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n ====Gerenciador De tarefas ====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Marcar tarefa como concluída");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção:");

            opcao = Integer.parseInt(leia.nextLine());

            switch (opcao) {
                case 1 -> {
                    System.out.print("Nome da tarefa: ");
                    String nome = leia.nextLine();

                    System.out.print("Descrição da tarefa: ");
                    String descricao = leia.nextLine();

                    System.out.print("Prioridade (1 - Alta, 2 - Média, 3 - Baixa): ");
                    int prioridade = Integer.parseInt(leia.nextLine());

                    gerenciador.adicionarTarefa(nome, descricao, prioridade);
                }

                case 2 -> gerenciador.listarTarefas();

                case 3 -> {
                    gerenciador.listarTarefas();
                    System.out.println("Número da tarefa a marcar como concluída:  ");
                    int indice = Integer.parseInt(leia.nextLine()) - 1;
                    gerenciador.marcarComoConcluida(indice);
                }

                case 4 -> {
                    gerenciador.listarTarefas();
                    System.out.println("Número da tarefa a remover: ");
                    int indice = Integer.parseInt(leia.nextLine()) - 1;
                    gerenciador.removerTarefa(indice);
                }

                case 0 -> System.out.println("Saindo do programa!....");

                default -> System.out.println("Opção inválida!");
            }
        }

        leia.close();
    }
}

