package geral;
/*essa Classe "Editora" é uma agregação, pois nem todo livro possui uma editora 
(por exemplos os livros que foram criados por pessoas que não são de fato escritoras em tempo integral, e ainda não foram publicados) */
public class Editora {
    private String nome;
    private String endereco;

    public Editora(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}