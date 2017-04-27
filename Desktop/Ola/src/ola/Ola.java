/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ola;

/**
 *
 * @author diego
 */
public class Ola {

    String[] olas = {"Blz?", "Como vai?", "Tudo em Cima?"};
    int usar = 0;

    public void comprimenta() {
        System.out.println(olas[usar++]);
        usar %= 3;
    }
    
}
