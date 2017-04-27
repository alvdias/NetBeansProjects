/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno;

/**
 *
 * @author diego
 */
public class Aluno {
    double n1, n2, n3, n4;
    
    public void carregaNotas(double n1, double n2, double n3, double n4) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }
    
    public void imprimeMedia() {
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
}
