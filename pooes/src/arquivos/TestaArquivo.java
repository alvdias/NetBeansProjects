/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class TestaArquivo {

    public static void main(String[] args) throws IOException {
        //O objeto file representa uma abstracao que permite
        //acesso a um arquivo ou diretorio.
        //Construtor usa caminho completo, naso cria o arquivo
        File diretorio = new File("/home/diego/temp/");
        diretorio.mkdir();
        File arquivo = new File(diretorio, "lixo.txt");
        
        //File writer cria arquivo
        //Sobrescreve o arquivo
        //FileWriter escritor = new FileWriter(arquivo);
        //Nao sobrescreve
        FileWriter escritor = new FileWriter("/home/diego/temp/log.txt", false);
        BufferedWriter escritorBuffer = new BufferedWriter(escritor);
        escritorBuffer.write("Ola javoso!");
        escritorBuffer.close();
        //Descarrega sem fechar
        //escritorBuffer.flush(); 
        escritor.close();

        FileReader leitor = new FileReader(arquivo);
        BufferedReader leitorBuffer = new BufferedReader(leitor);
        System.out.println("Leitura do arquivo: ");
        while(leitorBuffer.ready()) {
            JOptionPane.showMessageDialog(null, leitorBuffer.readLine());
            System.out.println(leitorBuffer.readLine());
        }
        leitorBuffer.close();
        leitor.close();
        
        File subdir = new File(diretorio, "subdir1");
        subdir.mkdir();
        String[] arquivos = diretorio.list();
        for (String arquivo1 : arquivos) {
            File filho = new File(diretorio, arquivo1);
            System.out.println(filho.getAbsolutePath());
            System.out.println(filho.getParent());
            System.out.println("É diretorio? " + filho.isDirectory());
            System.out.println("É arquivo? " + filho.isFile());
            System.out.println("Tamanho = " + filho.length() + " bytes.");
        }
//        if (arquivo.exists()) {
//            arquivo.delete();
//        } else {
//            não sobrescreve se ja existe
//            arquivo.createNewFile();
//        }
    }
}
