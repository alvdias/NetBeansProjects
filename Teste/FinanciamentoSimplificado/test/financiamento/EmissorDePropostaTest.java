/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financiamento;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class EmissorDePropostaTest {
    
    public EmissorDePropostaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void faixaInferiorA1000Reais() {
        Cliente cliente = new Cliente();
        cliente.setNome("João da Silva");
        cliente.setIdade(25);
        cliente.setSalario(900.00F);
        cliente.setValorASerFinanciado(2000.00F);
        
        EmissorDeProposta emissorDeProposta = new EmissorDeProposta();
        ArrayList<Proposta> propostas;
        propostas = emissorDeProposta.definirPropostas(cliente);        
        assertEquals(2, propostas.size());
        
        Proposta proposta1 = propostas.get(0);
        assertEquals(4000.00F, proposta1.getTotal(), 0.001);
        assertEquals(2, proposta1.getNumeroParcelas());
        assertEquals(2000.00F, proposta1.getValorParcelas(), 0.01);
        
        Proposta proposta2 = propostas.get(1);
        assertEquals(4000.00F, proposta2.getTotal(), 0.001);
        assertEquals(3, proposta2.getNumeroParcelas());
        assertEquals(1333.33F, proposta2.getValorParcelas(), 0.01);
    }
}
