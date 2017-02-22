package beans;

/**
 * Created by guilherme on 20/02/17.
 */
public class Idioma {
    private String id;
    private String descricao;

    public Idioma() {
    }

    public Idioma(String id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
