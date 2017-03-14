/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author diego
 */
public class TestaArquivo {
    public static void main(String[] args) throws IOException {
        // O objeto file representa uma abstração que permite
        // acesso a um arquivo ou diretorio.
        File diretorio = new File("/home/diego/temp/");
        diretorio.mkdir();
        File arquivo = new File(diretorio, "lixo.txt");
        File subdir = new File(diretorio, "subdir1");
        subdir.mkdir();
        String[] arquivos = diretorio.list();
        for (int i = 0; i < arquivos.length; i++) {
            File filho = new File(diretorio, arquivos[i]);
            System.out.println(filho.getAbsolutePath());
            System.out.println(filho.getParent());
            System.out.println("É diretorio? " + filho.isDirectory());
            System.out.println("É arquivo? " + filho.isFile());
            System.out.println("Tamanho = " + filho.length() + " bytes.");
        }
        if (arquivo.exists()) {
            arquivo.delete();
        } else {
            arquivo.createNewFile();
        }
    }
}
