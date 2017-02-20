package beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guilherme on 20/02/17.
 */
public class Turma {
    private String id;
    private String professorId;
    private String cursoId;
    private List<Aluno> listaDeAlunos = new ArrayList<>();

    public Turma(String id) {
        this.id = id;
    }

    public Turma(String id, String professorId, String cursoId, List<Aluno> listaDeAlunos) {
        this.id = id;
        this.professorId = professorId;
        this.cursoId = cursoId;
        this.listaDeAlunos = listaDeAlunos;
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

    public String getCursoId() {
        return cursoId;
    }

    public void setCursoId(String cursoId) {
        this.cursoId = cursoId;
    }

    public List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }

    public void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        this.listaDeAlunos = listaDeAlunos;
    }
}
