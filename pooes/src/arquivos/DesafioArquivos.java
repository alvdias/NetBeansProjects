/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author diego
 */
// pasta, arquivos, diretorios, tamanho
public class DesafioArquivos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dirName;
        System.out.print("Pasta a ser listada: ");
        dirName = scanner.nextLine();
        File diretorio = new File(dirName);
        long tamanho = listaDiretorio(diretorio, 0, 0, 0);
        System.out.println("Tamanho: " + (tamanho / 1000000.0) + "MBs");
    }

    public static long listaDiretorio(File diretorio, long tamanho,
            int arquivos, int diretorios) {
        if (diretorio.isFile()) {
            System.out.println("É um arquivo!");
            arquivos++;
            tamanho += diretorio.length();
        } else {
            System.out.println("É um diretorio!");
            diretorios++;
            for (Object arquivo : diretorio.list()) {
                
            }
            tamanho += listaDiretorio(diretorio, tamanho, arquivos, diretorios);
        }
        System.out.println("Nome: " + diretorio.getName());
        return tamanho;
    }
}
