import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        CadastroLivro cadastro = new CadastroLivro();
        ListagemLivros listagem = new ListagemLivros();
        EmprestimoLivro emprestimo = new EmprestimoLivro();
        DevolucaoLivro devolucao = new DevolucaoLivro();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Emprestar Livro");
            System.out.println("4 - Devolver Livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException var11) {
                System.out.println("Por favor, insira um número válido.");
                opcao = -1;
            }

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.print("\nDigite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    cadastro.cadastrarLivro(titulo, autor);
                    break;
                case 2:
                    listagem.listarLivros(cadastro.getLivros());
                    break;
                case 3:
                    System.out.print("Digite o título do livro a ser emprestado: ");
                    String livroEmprestar = scanner.nextLine();
                    emprestimo.emprestarLivro(cadastro.getLivros(), livroEmprestar);
                    break;
                case 4:
                    System.out.print("Digite o título do livro a ser devolvido: ");
                    String livroDevolver = scanner.nextLine();
                    devolucao.devolverLivro(cadastro.getLivros(), livroDevolver);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 0);

        scanner.close();
    }
}
