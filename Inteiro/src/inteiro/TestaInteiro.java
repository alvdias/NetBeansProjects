/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteiro;

/**
 *
 * @author diego
 */
public class TestaInteiro {
    public static void main(String[] args) {
        int resp;
        Inteiro i = new Inteiro();
        i.carregaValor(14);
        resp = i.devolveValor();
        System.out.println(resp);
        i.carregaValor(-473158);
        resp = i.devolveValor();
        System.out.println(resp);
        resp = i.devolveValorAbsoluto();
        System.out.println(resp);
        i.imprime();
        i.carregaValor(20);
        i.soma(15);
        i.subtrai(15);
        i.multiplicaPor(2);
        i.dividePor(0);
        i.dividePor(2);
        i.imprime();
    }
}
