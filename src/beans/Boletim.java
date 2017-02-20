package beans;

/**
 * Created by guilherme on 20/02/17.
 */
public class Boletim {
    private String idAluno;
    private String idTurma;
    private String nota1;
    private String nota2;
    private String frequencia;

    public Boletim() {
    }

    public Boletim(String idAluno, String idTurma, String nota1, String nota2, String frequencia) {
        this.idAluno = idAluno;
        this.idTurma = idTurma;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.frequencia = frequencia;
    }

    public String getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(String idAluno) {
        this.idAluno = idAluno;
    }

    public String getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(String idTurma) {
        this.idTurma = idTurma;
    }

    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
}
