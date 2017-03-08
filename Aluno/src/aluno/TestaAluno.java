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
public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.carregaNotas(8.7, 7.2, 9.3, 7.4);
        aluno.imprimeMedia();
        aluno.carregaNotas(5.2, 3.4, 6.5, 2.1);
        aluno.imprimeMedia();
        aluno.carregaNotas(3.4, 5.1, 1.1, 2.0);
        aluno.imprimeMedia();
    }
}
