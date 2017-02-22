package dao;

import beans.Boletim;

import java.io.*;
import java.util.ArrayList;

public class BoletimDao {
    private static final String NOME_ARQUIVO = "Boletins.txt";
    private static ArrayList<Boletim> boletinsAux = new ArrayList<>();

    public void inserir(Boletim a) {
        boletinsAux.add(a);
        escreverArquivo();
    }

    public void excluir(String id) {
        Boletim boletinsTemp = buscarPorIdAluno(id);
        boletinsAux.remove(boletinsTemp);
        escreverArquivo();
    }

    public void alterar(Boletim a) {
        Boletim boletinsAux = buscarPorIdAluno(a.getIdAluno());

        boletinsAux.setIdAluno(a.getIdAluno());
        boletinsAux.setIdTurma(a.getIdTurma());
        boletinsAux.setNota1(a.getNota1());
        boletinsAux.setNota2(a.getNota2());
        boletinsAux.setFrequencia(a.getFrequencia());

        escreverArquivo();
    }

    public Boletim buscarPorIdAluno(String id) {
        for (Boletim boletinsAux : boletinsAux) {
            if (boletinsAux.getIdAluno().equals(id)) {
                return boletinsAux;
            }
        }

        return null;
    }

    public Boletim buscarPorIdTurma(String id) {
        for (Boletim boletinsAux : boletinsAux) {
            if (boletinsAux.getIdTurma().equals(id)) {
                return boletinsAux;
            }
        }

        return null;
    }

    public ArrayList<Boletim> listar() {
        return boletinsAux;
    }

    private void escreverArquivo() {
        File f = new File(NOME_ARQUIVO);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (Boletim boletinsAux : boletinsAux) {
                bw.write(boletinsAux.getIdAluno() + ";"
                        + boletinsAux.getIdTurma() + ";"
                        + boletinsAux.getNota1() + ";"
                        + boletinsAux.getNota2() + ";"
                        + boletinsAux.getFrequencia() + ";");
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
                Boletim a = new Boletim(dados[0], dados[1], dados[2], dados[3], dados[4]);
                boletinsAux.add(a);
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
