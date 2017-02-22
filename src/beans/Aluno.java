package beans;

/**
 * Created by guilherme on 20/02/17.
 */
public class Aluno {
    private String id;
    private String nome;
    private int idade;

    public Aluno() {
    }

    public Aluno(String id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
