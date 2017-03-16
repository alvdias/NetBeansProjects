/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financiamento;

/**
 *
 * @author diego
 */
public class Proposta {

    private float total;
    private int numeroParcelas;
    private float valorParcelas;

    public Proposta(float total, int numeroParcelas, float valorParcelas) {
        this.total = total;
        this.numeroParcelas = numeroParcelas;
        this.valorParcelas = valorParcelas;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }

    public float getValorParcelas() {
        return valorParcelas;
    }

    public void setValorParcelas(float valorParcelas) {
        this.valorParcelas = valorParcelas;
    }

}
