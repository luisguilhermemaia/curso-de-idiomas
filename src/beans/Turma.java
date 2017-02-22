package beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guilherme on 20/02/17.
 */
public class Turma {
    private String id;
    private String professorId;
    private String idiomaId;

    public Turma() {
    }

    public Turma(String id, String professorId, String idiomaId) {
        this.id = id;
        this.professorId = professorId;
        this.idiomaId = idiomaId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfessorId() {
        return professorId;
    }

    public void setProfessorId(String professorId) {
        this.professorId = professorId;
    }

    public String getIdiomaId() {
        return idiomaId;
    }

    public void setIdiomaId(String idiomaId) {
        this.idiomaId = idiomaId;
    }


}
