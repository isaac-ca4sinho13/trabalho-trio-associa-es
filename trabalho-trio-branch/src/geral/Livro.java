package geral;

public class Livro extends Obra {
    private String autor_a;
    private String qtdPaginas;
    private Editora editora; 

    public Livro(String nome, String paisOrigem, String genero, String classificacaoIndicativa, String qtdPaginas, String autor_a, Editora editora){
        super(nome, paisOrigem, genero, classificacaoIndicativa);
        this.qtdPaginas = qtdPaginas;
        this.autor_a = autor_a;
        this.editora = editora; 
    }

    public String getAutor_a() {
        return autor_a;
    }

    public void setAutor_a(String autor_a) {
        this.autor_a = autor_a;
    }

    public String getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(String qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void imprimirInformacoes() {
        System.out.println("Título: " + getNome());
        System.out.println("País de origem: " + getPaisOrigem());
        System.out.println("Gênero: " + getGenero());
        System.out.println("Classificação indicativa: " + getClassificacaoIndicativa());
        System.out.println("Autor: " + getAutor_a());
        System.out.println("Número de Páginas: " + getQtdPaginas());
        
        
        if (editora != null) {
            System.out.println("Editora: " + editora.getNome());
            System.out.println("Endereço da Editora: " + editora.getEndereco());
        } else {
            System.out.println("Editora não informada.");
        }
        
        System.out.println("---------//--------//---------");
    }
}
