package beans;

/**
 * Created by guilherme on 20/02/17.
 */
public class Aluno {
    private String id;
    private String nome;
    private String senha;
    private int idade;

    public Aluno() {
    }

    public Aluno(String id, String nome, String senha, int idade) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
