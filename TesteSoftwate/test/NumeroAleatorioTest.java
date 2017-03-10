/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testesoftware.NumeroAleatorio;

/**
 *
 * @author diego
 */
public class NumeroAleatorioTest {
    
    NumeroAleatorio numeroAleatorio;

    public NumeroAleatorioTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        numeroAleatorio = new NumeroAleatorio();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void casoDeTeste01() {
        int resp = numeroAleatorio.gerarNumeroAleatorio(1, 10);
        assertTrue(resp >= 1 && resp <= 10);
    }

    @Test
    public void casoDeTeste02() {
        int resp = numeroAleatorio.gerarNumeroAleatorio(-1, 10);
        assertEquals(-1, resp);
    }

    @Test
    public void casoDeTeste03() {
        char s[] = {'a', 'b', 'c', 'd', 'e'};
        String resp = numeroAleatorio.acharCaracter(5, s, 'c');
        assertEquals("2", resp);
    }

    @Test
    public void casoDeTeste04() {
        char s[] = {'a', 'b', 'c', 'd', 'e'};
        String resp = numeroAleatorio.acharCaracter(5, s, 'f');
        assertEquals("caracter nao encontrado", resp);
    }
    /*
    @Test
    public void casaDeTeste05() {
        ArrayList<String> list = new ArrayList<>();
        list.add("andre");
        list.add("joao");
        list.add("josefa");
        list.add("maria");

        try {
            list.get(5);
            fail("Não deveria chegar aqui!");
        } catch (Exception e) {
            assertTrue(e instanceof IndexOutOfBoundsException);
        }
    }

    @Test
    public void casaDeTeste06() {
        ArrayList<String> list = new ArrayList<>();
        list.add("andre");
        list.add("joao");
        list.add("josefa");
        list.add("maria");

        try {
            String resp =  list.get(2);
            assertEquals(resp, "josefa");
        } catch (Exception e) {
            fail("Não deveria chegar aqui!");
        }
    }
    */
}
