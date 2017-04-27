package controller;

/**
 * @author fabricio@utfpr.edu.br
 */
public class Cliente implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private String fone;
    private int idade;
    private String cpf;
    private String email;
    private float rendimento;

    private Cliente() {
        nome = "não informado";
        fone = "não informado";
        idade = 0;
    }

    public Cliente(int idade) {
        this.idade = idade;
    }
    
    public Cliente(String nm, String fon, int id) {
        nome = nm;
        fone = fon;
        idade = id;
    }

    @Override
    public String toString() {
        if (this != null) {
            return (nome + "  " + fone + " " + idade + " " + cpf + " " + rendimento);
        } else {
            return (null);
        }
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the fone
     */
    public String getFone() {
        return fone;
    }

    /**
     * @param fone the fone to set
     */
    public void setFone(String fone) {
        this.fone = fone;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
