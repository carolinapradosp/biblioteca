import java.util.ArrayList;

class CadastroLivro {
    private ArrayList<Livro> livros = new ArrayList();

    public CadastroLivro() {
    }

    public void cadastrarLivro(String titulo, String autor) {
        Livro livro = new Livro(titulo, autor);
        this.livros.add(livro);
        System.out.println("Livro cadastrado com sucesso! '__'");
    }

    public ArrayList<Livro> getLivros() {
        return this.livros;
    }
}