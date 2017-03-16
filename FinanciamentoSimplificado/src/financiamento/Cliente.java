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
public class Cliente {
    
    private String nome;
    private int idade;
    private float salario;
    private float valorASerFinanciado;

    void setNome(String nome) {
        this.nome = nome;
    }
    
    String getNome() {
        return nome;
    }

    void setIdade(int idade) {
        this.idade = idade;
    }
    
    int getIdade() {
        return idade;
    }

    void setSalario(float salario) {
        this.salario = salario;
    }
    
    float getSalario() {
        return salario;
    }

    void setValorASerFinanciado(float valorASerFinanciado) {
        this.valorASerFinanciado = valorASerFinanciado;
    }
    
    float getValorASerFinanciado() {
        return valorASerFinanciado;
    }
    
}
