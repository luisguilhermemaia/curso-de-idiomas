package beans;

/**
 * Created by guilherme on 20/02/17.
 */
public class Idioma {
    private String codigo;
    private String descricao;

    public Idioma() {
    }

    public Idioma(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
