package dao;

import beans.Idioma;

import java.io.*;
import java.util.ArrayList;

public class IdiomaDao {
    private static final String NOME_ARQUIVO = "Professores.txt";
    private static ArrayList<Idioma> idiomaAux = new ArrayList<>();

    public void inserir(Idioma p) {
        idiomaAux.add(p);
        escreverArquivo();
    }

    public void excluir(String id) {
        Idioma idiomaTemp = buscarPorId(id);
        idiomaAux.remove(idiomaTemp);
        escreverArquivo();
    }

    public void alterar(Idioma i) {
        Idioma idiomaTemp = buscarPorId(i.getId());

        idiomaTemp.setId(i.getId());
        idiomaTemp.setDescricao(i.getDescricao());

        escreverArquivo();
    }

    public Idioma buscarPorId(String id) {
        for (Idioma idiomaTemp : idiomaAux) {
            if (idiomaTemp.getId().equals(id)) {
                return idiomaTemp;
            }
        }

        return null;
    }

    public ArrayList<Idioma> buscarPorDescricao(String descricao) {
        ArrayList<Idioma> busca = new ArrayList<>();

        for (Idioma idiomaTemp : idiomaAux) {
            if (idiomaTemp.getDescricao().toUpperCase().contains(descricao.toUpperCase())) {
                busca.add(idiomaTemp);
            }
        }

        return busca;
    }

    public ArrayList<Idioma> listar() {
        return idiomaAux;
    }

    private void escreverArquivo() {
        File f = new File(NOME_ARQUIVO);
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);

            for (Idioma idiomaTemp : idiomaAux) {
                bw.write(idiomaTemp.getId() + ";" + idiomaTemp.getDescricao() + ";");
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
                Idioma p = new Idioma(dados[0], dados[1]);
                idiomaAux.add(p);
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
