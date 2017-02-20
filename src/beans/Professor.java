package beans;

/**
 * Created by guilherme on 20/02/17.
 */
public class Professor {
    private String nome;
    private String id;
    private String senha;
    private String idioma;

    public Professor() {
    }

    public Professor(String nome, String id, String senha, String idioma) {
        this.nome = nome;
        this.id = id;
        this.senha = senha;
        this.idioma = idioma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
