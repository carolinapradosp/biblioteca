import java.util.ArrayList;
import java.util.Iterator;

class DevolucaoLivro {
    DevolucaoLivro() {
    }

    public void devolverLivro(ArrayList<Livro> livros, String titulo) {
        Iterator var3 = livros.iterator();

        Livro livro;
        do {
            if (!var3.hasNext()) {
                System.out.println("Livro não encontrado ou não está emprestado.");
                return;
            }

            livro = (Livro)var3.next();
        } while(!livro.getTitulo().equalsIgnoreCase(titulo) || !livro.isEmprestado());

        livro.setEmprestado(false);
        System.out.println("Livro devolvido com sucesso!");
    }
}
