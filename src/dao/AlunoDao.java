package dao;

import beans.Aluno;
import java.io.*;
import java.util.ArrayList;

public class AlunoDao {
    private static final String NOME_ARQUIVO = "Alunos.txt";
    private static ArrayList<Aluno> alunosAux = new ArrayList<>();

    public void inserir(Aluno a) {
        alunosAux.add(a);

        escreverArquivo();
    }

    public void excluir(String id) {
        Aluno alunoTemp = buscarPorId(id);
        alunosAux.remove(alunoTemp);

        escreverArquivo();
    }

    public void alterar(Aluno a) {
        Aluno alunoTemp = buscarPorId(a.getId());

        //Alterar os dados do item do arraylist, conforme o argumento passado

        alunoTemp.setId(a.getId());
        alunoTemp.setNome(a.getNome());

        escreverArquivo();
    }

    public Aluno buscarPorId(String id) {
        for (Aluno alunoTemp : alunosAux) {
            if (alunoTemp.getId().equals(id)) {
                return alunoTemp;
            }
        }

        return null;
    }

    public ArrayList<Aluno> buscarPorNome(String nome) {
        ArrayList<Aluno> busca = new ArrayList<Aluno>();

        for (Aluno alunoTemp : alunosAux) {
            if (alunoTemp.getNome().toUpperCase().contains(nome.toUpperCase())) {
                busca.add(alunoTemp);
            }
        }

        return busca;
    }

    public ArrayList<Aluno> listar() {
        return alunosAux;
    }

    private void escreverArquivo() {
        File f = new File(NOME_ARQUIVO);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (Aluno alunoTemp : alunosAux) {
                bw.write(alunoTemp.getId() + ";" + alunoTemp.getNome() + ";" + alunoTemp.getIdade() + ";");
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        File f = new File(NOME_ARQUIVO);
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                Aluno a = new Aluno(dados[0], dados[1], dados[2], Integer.parseInt(dados[3]));
                alunosAux.add(a);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
