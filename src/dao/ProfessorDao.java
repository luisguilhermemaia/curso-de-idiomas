package dao;

import beans.Aluno;
import beans.Professor;

import java.io.*;
import java.util.ArrayList;

public class ProfessorDao {
    private static final String NOME_ARQUIVO = "Professores.txt";
    private static ArrayList<Professor> professorAux = new ArrayList<>();

    public void inserir(Professor p) {
        professorAux.add(p);

        escreverArquivo();
    }

    public void excluir(String id) {
        Professor professorTemp = buscarPorId(id);
        professorAux.remove(professorTemp);

        escreverArquivo();
    }

    public void alterar(Professor p) {
        Professor professorTemp = buscarPorId(p.getId());

        professorTemp.setId(p.getId());
        professorTemp.setNome(p.getNome());

        escreverArquivo();
    }

    public Professor buscarPorId(String id) {
        for (Professor professorTemp : professorAux) {
            if (professorTemp.getId().equals(id)) {
                return professorTemp;
            }
        }

        return null;
    }

    public ArrayList<Professor> buscarPorNome(String nome) {
        ArrayList<Professor> busca = new ArrayList<>();

        for (Professor professorTemp : professorAux) {
            if (professorTemp.getNome().toUpperCase().contains(nome.toUpperCase())) {
                busca.add(professorTemp);
            }
        }

        return busca;
    }

    public ArrayList<Professor> listar() {
        return professorAux;
    }

    private void escreverArquivo() {
        File f = new File(NOME_ARQUIVO);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (Professor professorTemp : professorAux) {
                bw.write(professorTemp.getId() + ";" + professorTemp.getNome() + ";");
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
                Professor p = new Professor(dados[0], dados[1]);
                professorAux.add(p);
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
