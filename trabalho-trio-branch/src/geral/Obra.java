package geral;

public abstract class Obra {
    private String nome;
    private String paisOrigem;
    private String genero;
    private String classificacaoIndicativa;

    Obra(String nome, String paisOrigem, String genero, String classificacaoIndicativa){
        this.nome = nome;
        this.paisOrigem = paisOrigem;
        this.genero = genero;
        this.classificacaoIndicativa = classificacaoIndicativa;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

  
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
}

