/*
 * PadraoJanela.java
 * @author fabricio@utfpr.edu.br
 */
package interfaces;

public interface PadraoJanela {
    public void redimensiona(int novaLargura, int novaAltura);
    public void mover(int novoX, int novoY);
    public void trocaFrente(java.awt.Color novaCor);
    public void trocaFundo(java.awt.Color novaCor);
    public void trocaTitulo(String novoTitulo);
}