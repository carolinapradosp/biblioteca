import java.util.ArrayList;
import java.util.Iterator;

class EmprestimoLivro {
    EmprestimoLivro() {
    }

    public void emprestarLivro(ArrayList<Livro> livros, String titulo) {
        Iterator var3 = livros.iterator();

        Livro livro;
        do {
            if (!var3.hasNext()) {
                System.out.println("Livro não encontrado ou já emprestado.");
                return;
            }

            livro = (Livro)var3.next();
        } while(!livro.getTitulo().equalsIgnoreCase(titulo) || livro.isEmprestado());

        livro.setEmprestado(true);
        System.out.println("Livro emprestado com sucesso!");
    }
}
