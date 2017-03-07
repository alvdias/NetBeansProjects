/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliadordenotas;

/**
 *
 * @author diego
 */
public class AvaliadorDeNotas {

    public void calculaNotas(double n1, double n2, double n3, double n4) {
        double media = (n1 + n2 + n3 + n4) / 4.0;
        String msg = "Media: " + media;
        if (media > 6) {
            msg += " -> aprovado.";
        } else if (media > 4) {
            msg += " -> recuperação.";
        } else {
            msg += " -> reprovado.";
        }
        System.out.println(msg);
    }

    public void testaTudo() {
        calculaNotas(8.7, 7.2, 9.3, 7.4);
        calculaNotas(5.2, 3.4, 6.5, 2.1);
        calculaNotas(3.4, 5.1, 1.1, 2.0);
    }

}
