/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class ClassificadorTest {

    public ClassificadorTest() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void idadeInvalida() {
        Pessoa pessoa = new Pessoa("Diego", -3);
        Classificador classificador = new Classificador();
        classificador.definirFaixaEtaria(pessoa);
    }
    
    @Test
    public void idadeCrianca() {
        Pessoa pessoa = new Pessoa("Diego", 8);
        Classificador classificador = new Classificador();
        String resp = classificador.definirFaixaEtaria(pessoa);
        assertEquals("Diego eh crianca", resp);
    }
    
    @Test
    public void idadeAdolescente() {
        Pessoa pessoa = new Pessoa("Diego", 16);
        Classificador classificador = new Classificador();
        String resp = classificador.definirFaixaEtaria(pessoa);
        assertEquals("Diego eh adolescente", resp);
    }
    
    @Test
    public void idadeAdulto() {
        Pessoa pessoa = new Pessoa("Diego", 40);
        Classificador classificador = new Classificador();
        String resp = classificador.definirFaixaEtaria(pessoa);
        assertEquals("Diego eh adulto", resp);
    }
    
    @Test
    public void idadeIdosa() {
        Pessoa pessoa = new Pessoa("Diego", 65);
        Classificador classificador = new Classificador();
        String resp = classificador.definirFaixaEtaria(pessoa);
        assertEquals("Diego eh idoso", resp);
    }
}
