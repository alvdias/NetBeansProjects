/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluno2;

/**
 *
 * @author diego
 */
public class Aluno2 {

    private double n1, n2, n3, n4;

    public void recebeNota1(double n1) {
        this.n1 = n1;
    }

    public void recebeNota2(double n2) {
        this.n2 = n2;
    }

    public void recebeNota3(double n3) {
        this.n3 = n3;
    }

    public void recebeNota4(double n4) {
        this.n4 = n4;
    }

    public void imprimeMedia() {
        String situacao;
        double media = (n1 + n2 + n3 + n4) / 4;
        if (media > 6) {
            situacao = " -> aprovado.";
        } else if (media > 4) {
            situacao = " -> recuperação.";
        } else {
            situacao = " -> reprovado.";
        }
        System.out.println("Media: " + media + situacao);
    }
}
