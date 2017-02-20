package beans;

/**
 * Created by guilherme on 20/02/17.
 */
public class Matricula {
    private String id;
    private String turmaId;

    public Matricula() {
    }

    public Matricula(String id, String turmaId) {
        this.id = id;
        this.turmaId = turmaId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(String turmaId) {
        this.turmaId = turmaId;
    }
}
