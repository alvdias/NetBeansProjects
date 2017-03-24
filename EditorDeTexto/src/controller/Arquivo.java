package controller;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author diego
 */
public class Arquivo {

    private File arquivo = null;
    private BufferedReader leitorBuffer = null;
    private BufferedWriter escritorBuffer = null;
    
    public static int ABRIRARQUIVO = 1;
    public static int SALVARARQUIVO = 2;

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

    public BufferedReader getLeitorBuffer() {
        return leitorBuffer;
    }

    public void setLeitorBuffer(BufferedReader leitorBuffer) {
        this.leitorBuffer = leitorBuffer;
    }

    public BufferedWriter getEscritorBuffer() {
        return escritorBuffer;
    }

    public void setEscritorBuffer(BufferedWriter escritorBuffer) {
        this.escritorBuffer = escritorBuffer;
    }

    public boolean abrirArquivo(Component parent) {
        if (!apontarArquivo(ABRIRARQUIVO, parent)) return false;
        return validarArquivo();
    }

    private boolean apontarArquivo(int tipo, Component parent) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result;
        if (tipo == ABRIRARQUIVO) {
            result = fileChooser.showOpenDialog(parent);
        } else {
            result = fileChooser.showSaveDialog(parent);
        }
        if (result == JFileChooser.CANCEL_OPTION) {
            return false;
        }
        arquivo = fileChooser.getSelectedFile();
        return true;
    }

    public boolean escrever(String texto, boolean append) {
        try {
            escritorBuffer = new BufferedWriter(new FileWriter(arquivo, append));
            escritorBuffer.write(texto);
            return true;
        } catch (IOException erro) {
            System.err.println("Erro: " + erro);
        }
        return false;
    }

    public String ler() {
        StringBuilder conteudoArquivo = new StringBuilder();
        try {
            leitorBuffer = new BufferedReader(new FileReader(arquivo));
            while (leitorBuffer.ready()) {
                conteudoArquivo.append(leitorBuffer.readLine()).append("\n");
            }
            leitorBuffer.close();
            return conteudoArquivo.toString();
        } catch (IOException erro) {
            System.err.println("Erro: " + erro);
        }
        return null;
    }

    public boolean salvar() {
        try {
            escritorBuffer.close();
            return true;
        } catch (IOException erro) {
            System.err.println("Erro: " + erro);
        }
        return false;
    }

    public boolean salvarComo(String texto, Component parent) {
        if (!apontarArquivo(SALVARARQUIVO, parent)) return false;
        this.escrever(texto, false);
        this.salvar();
        return validarArquivo();
    }

    private boolean validarArquivo() {
        if (arquivo == null || arquivo.getName().equals("")) {
            arquivo = null;
            return false;
        } else {
            try {
                leitorBuffer = new BufferedReader(new FileReader(arquivo));
            } catch (IOException erro) {
                System.err.println("Erro: " + erro);
                return false;
            }
        }
        return true;
    }
}
