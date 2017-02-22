package beans;

/**
 * Created by guilherme on 20/02/17.
 */
public class Professor {
    private String id;
    private String nome;

    public Professor() {
    }

    public Professor(String id, String nome) {
        this.id = id;
        this.nome = nome;
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

}
