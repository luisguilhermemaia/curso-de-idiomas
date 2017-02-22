package dao;

import beans.Turma;

import java.io.*;
import java.util.ArrayList;

public class TurmaDao {
    private static final String NOME_ARQUIVO = "Turmas.txt";
    private static ArrayList<Turma> turmaAux = new ArrayList<>();

    public void inserir(Turma a) {
        turmaAux.add(a);

        escreverArquivo();
    }

    public void excluir(String id) {
        Turma turmaTemp = buscarPorId(id);
        turmaAux.remove(turmaTemp);

        escreverArquivo();
    }

    public void alterar(Turma t) {
        Turma turmaTemp = buscarPorId(t.getId());

        turmaTemp.setIdiomaId(t.getIdiomaId());
        turmaTemp.setProfessorId(t.getProfessorId());
        turmaTemp.setId(t.getId());

        escreverArquivo();
    }

    public Turma buscarPorId(String id) {
        for (Turma turmaTemp : turmaAux) {
            if (turmaTemp.getId().equals(id)) {
                return turmaTemp;
            }
        }

        return null;
    }

    public Turma buscarPorProfessorId(String professorId) {
        for (Turma turmaTemp : turmaAux) {
            if (turmaTemp.getProfessorId().equals(professorId)) {
                return turmaTemp;
            }
        }
        return null;
    }

    public ArrayList<Turma> listar() {
        return turmaAux;
    }

    private void escreverArquivo() {
        File f = new File(NOME_ARQUIVO);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (Turma turmaTemp : turmaAux) {
                bw.write(turmaTemp.getId() + ";" + turmaTemp.getProfessorId() + ";" + turmaTemp.getIdiomaId() + ";");
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
                Turma a = new Turma(dados[0], dados[1],dados[3]);
                turmaAux.add(a);
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
