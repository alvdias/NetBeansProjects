package controller;

/**
 *
 * @author diego
 */
public class Animal implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private int id;
    private String nome;
    private int idade;
    private int racaId;

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

    public int getRacaId() {
        return racaId;
    }

    public void setRacaId(int racaId) {
        this.racaId = racaId;
    }

}
