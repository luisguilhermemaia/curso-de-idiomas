package beans;

/**
 * Created by guilherme on 20/02/17.
 */
public class Curso {
    private String id;
    private String idiomaId;
    private String nivel;

    public Curso() {
    }

    public Curso(String id, String idiomaId, String nivel) {
        this.id = id;
        this.idiomaId = idiomaId;
        this.nivel = nivel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdiomaId() {
        return idiomaId;
    }

    public void setIdiomaId(String idiomaId) {
        this.idiomaId = idiomaId;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
