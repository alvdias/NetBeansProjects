package model;

import java.io.Serializable;

/**
 * @author fabricio@utfpr.edu.br
 */
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1;
    private String nome;
    private int idade;
    private String fone;
    private String CPF;
    private float altura;
    private float peso;

    public Cliente(String zezinho, String string, int i) {
        this.nome = zezinho;
        this.fone = string;
        this.idade = i;
    }

    public Cliente() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + ";" + idade + ";" + fone + ";" + CPF + ";" + altura + ";" + peso + ";";
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
