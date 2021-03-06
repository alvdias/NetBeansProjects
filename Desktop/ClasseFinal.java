Classe com operador final
Não pode rebercer operador extends(não pode ser herdada)

Atributo primitivo com operador final
pode ser inicializado na declaração ou no metodo construtor
se houver mais de um metodo construtor todos devem inicializar as variaveis estaticas
se tentar modificar em outro lugar causa erro

Atributo objeto com operador final
não pode reinstanciar o objeto
pode modificar os valores do objeto, mas não o objeto em si

/*
 * ClasseFinal.java
 * @author fabricio@utfpr.edu.br
 */
package finais;

import java.awt.Color;
import javax.swing.JButton;

public final class ClasseFinal{
    //tipos primitivos
    private final int i;
    private final float valor;

    //objetos ou vetores.
    protected final int[] vetor = new int[10];
    protected final JButton botao = new JButton();
    protected final String endereco = "Av. X";

    public void Sorteia(){
        for (int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.random()*100;
        }
    }

    public ClasseFinal(){
        i = 10;
        valor = 20;
        vetor[0] = 8;
        vetor[0] = 5;
        vetor[1] = 9;
        vetor[1] = 3;
        //vetor = new int[50];
        //botao = new JButton();
        botao.setBackground(Color.red);
        botao.setBackground(Color.blue);
    }

    public ClasseFinal(float valor){
        this.valor = valor;
        i = 10;
        vetor = new int[10];
    }

    public ClasseFinal(float valor, int x){
        this.valor = valor;
        this.i = x;
        vetor = new int[10];
    }

    public final void Transfere(float valor){
        ///codigo para transferencia.
    }
}
