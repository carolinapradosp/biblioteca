import java.util.ArrayList;

class ListagemLivros {
    public void listarLivros(ArrayList<Livro> livros) {
        System.out.println("\nLista de livros:");
        for (Livro livro : livros) {
            String disponivel = livro.isEmprestado() ? "Não" : "Sim";
            System.out.println("Título: " + livro.getTitulo() + " - " + "Autor: " + livro.getAutor() + " - Disponível: " + disponivel);
        }
    }
}
