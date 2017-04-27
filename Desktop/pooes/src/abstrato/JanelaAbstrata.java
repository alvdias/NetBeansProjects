/*
 * JanelaAbstrata.java
 * @author fabricio@utfpr.edu.br
 */

package abstrato;

import interfaces.PadraoJanela;
import java.awt.Color;
import javax.swing.JFrame;

public abstract class JanelaAbstrata extends JFrame implements PadraoJanela{
    protected int posicaoX = 180;
    protected int posicaoY = 2;
    protected int altura   = 700;
    protected int largura  = 900;
    protected Color corFrente = java.awt.Color.black;
    protected Color corFundo = java.awt.Color.gray;
    protected String titulo = "Comparacao entre "
            + "metodos de ordenacao";

    /**
     * @return the posicaoX
     */
    public int getPosicaoX() {
        return posicaoX;
    }

    /**
     * @param posicaoX the posicaoX to set
     */
    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    /**
     * @return the posicaoY
     */
    public int getPosicaoY() {
        return posicaoY;
    }

    /**
     * @param posicaoY the posicaoY to set
     */
    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }

    /**
     * @return the corFrente
     */
    public java.awt.Color getCorFrente() {
        return corFrente;
    }

    /**
     * @param corFrente the corFrente to set
     */
    public void setCorFrente(java.awt.Color corFrente) {
        this.corFrente = corFrente;
    }

    /**
     * @return the corFundo
     */
    public java.awt.Color getCorFundo() {
        return corFundo;
    }

    /**
     * @param corFundo the corFundo to set
     */
    public void setCorFundo(java.awt.Color corFundo) {
        this.corFundo = corFundo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
