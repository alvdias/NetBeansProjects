package model;

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
    private BufferedReader entrada = null;
    private BufferedWriter escritorbuffer = null;
    
    public File getArquivo() {
        return arquivo;
    }
    
    public boolean abrirArquivo(Component parent) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(parent);
        if (result == JFileChooser.CANCEL_OPTION) {
            return false;
        }
        arquivo = fileChooser.getSelectedFile();
        return validarArquivo();
    }
    
    public boolean escrever(String texto, boolean append) {
        try {
            escritorbuffer = new BufferedWriter(new FileWriter(arquivo, append));
            escritorbuffer.write(texto);
            return true;
        } catch (IOException erro) {
            System.err.println("Erro: " + erro);
        }
        return false;
    }
    
    public String ler() {
        StringBuilder conteudoArquivo = new StringBuilder();
        try {
            entrada = new BufferedReader(new FileReader(arquivo));
            while (entrada.ready()) {
                conteudoArquivo.append(entrada.readLine()).append("\n");
            }
            entrada.close();
            return conteudoArquivo.toString();
        } catch (IOException erro) {
            System.err.println("Erro: " + erro);
        }
        return null;
    }
    
    public boolean salvar() {
        try {
            escritorbuffer.close();
            return true;
        } catch (IOException erro) {
            System.err.println("Erro: " + erro);
        }
        return false;
    }
    
    public boolean salvarComo(String texto, Component parent) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showSaveDialog(parent);
        if (result == JFileChooser.CANCEL_OPTION) {
            return false;
        }
        arquivo = fileChooser.getSelectedFile();
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
                entrada = new BufferedReader(new FileReader(arquivo));
            } catch (IOException erro) {
                System.err.println("Erro: " + erro);
                return false;
            }
        }
        return true;
    }
}
