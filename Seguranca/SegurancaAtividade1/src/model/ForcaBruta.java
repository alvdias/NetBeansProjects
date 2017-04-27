/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class ForcaBruta {
    
    public static List<String> ataque(int tamanho) {
        String frase = "abcdefghijklmnopqrstuvxwyz";
        List<String> resultado = new ArrayList<String>();
        gerarChaves(resultado, frase, tamanho, "");
        return resultado;
    }
    
    public static void gerarChaves(List<String> resultado, String palavra, int tamanho, String palavraAtual) {
        String palavraCorrente = palavraAtual;
        for (int i = 0; i < palavra.length(); i++) {
            palavraCorrente += palavra.charAt(i);
            if (palavraCorrente.length() >= tamanho) {
                resultado.add(palavraCorrente);
                palavraCorrente = palavraAtual;
            } else {
                gerarChaves(resultado, palavra, tamanho, palavraCorrente);
                palavraCorrente = palavraAtual;
            }
        }
    }
}
