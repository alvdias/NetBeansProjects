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
public class Inteiro {

    int valor = 0;
    
    public void carregaValor(int v) {
        valor = v;
    }
    
    public int devolveValor() {
        return valor;
    }
    
    public int devolveValorAbsoluto() {
        return valor * -1; 
    }
    
    public void imprime() {
        System.out.println("Valor do inteiro: " + valor);
    }
    
    public int soma(int v) {
        valor += v;
        return valor;
    }
    
    public int subtrai(int v) {
        valor -= v;
        return valor;
    }
    
    public int multiplicaPor(int v) {
        valor *= v;
        return valor;
    }
    
    public int dividePor(int v) {
        if (v == 0) {
            System.out.println("Erro divisão por zero inválida!");
        } else {
            valor /= v;
        }
        return valor;
    }
}
