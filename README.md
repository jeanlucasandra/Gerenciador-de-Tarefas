# Gerenciador-de-Tarefas
Gerenciador de tarefas feito inteiramente em Java (auxilio do Claude com fim de aprendizado).

Gerenciador de tarefas totalmente executável no CMD (prompt de comando). 
Sistema de Gerenciamento de tarefas, como Cadastro de tarefas, Listagem de tarefas, Exclusão de tarefas, e opção de Marcar como concluída.

Envolve Array List, Switch...Case, métodos e classes, Getter e Setter, Private.

IDE utilizada: Intellij IDEA;
*Feito totalmente com auxílio de IA para fins de aprendizado (Claude).*

## Como executar

### Pré-requisitos
- Java JDK instalado (versão 14 ou superior, por causa do `switch` moderno usado no código)
- Verifique se está instalado rodando no terminal: `java -version` e `javac -version`

### Rodando pelo terminal (cmd/bash)

1. Clone o repositório:
   git clone <URL-do-seu-repositorio>
   
   cd <nome-da-pasta-do-projeto>

2. Compile os arquivos `.java`:

   javac Tarefa.java GerenciadorTarefas.java Main.java

   Isso vai gerar arquivos `.class` (o bytecode que a JVM executa) na mesma pasta.

3. Execute o programa:
4. 
   java Main
   
   > Obs: não coloque `.java` nem `.class` no final aqui, só o nome da classe que tem o `main`.

5. Interaja com o menu que vai aparecer no terminal.

### Rodando pela IDE (IntelliJ, Eclipse, VS Code, etc.)

1. Abra a pasta do projeto na IDE (File > Open, ou "Import Project", dependendo da IDE).
2. Certifique-se de que os 3 arquivos (`Tarefa.java`, `GerenciadorTarefas.java`, `Main.java`) estão no mesmo diretório/pacote.
3. Abra o arquivo `Main.java`.
4. Clique no botão de "Run" (▶) ao lado do método `main`, ou use o atalho:
   - **IntelliJ**: `Shift + F10`
   - **Eclipse**: `Ctrl + F11`
   - **VS Code** (com extensão Java): botão "Run" que aparece acima do `public static void main`
5. O terminal integrado da IDE vai abrir com o menu do programa.
