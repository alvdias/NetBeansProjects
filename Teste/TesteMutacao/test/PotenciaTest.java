/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class PotenciaTest {
    
    public PotenciaTest() {
    }

    @Test
    public void ct01potencia() {
        Potencia potencia = new Potencia();
        float resp = potencia.pow(2, 0);
        assertEquals(1, resp, 0.0001);
    }
    
    @Test
    public void ct01potenciaM1() {
        PotenciaM1 potencia = new PotenciaM1();
        float resp = potencia.pow(2, 0);
        assertEquals(1, resp, 0.0001);
    }
    
    @Test
    public void ct02potencia() {
        Potencia potencia = new Potencia();
        float resp = potencia.pow(2, 4);
        assertEquals(16, resp, 0.0001);
    }
    
    @Test(timeout = 500)
    public void ct02potenciaM2() {
        PotenciaM2 potencia = new PotenciaM2();
        float resp = potencia.pow(2, 4);
        assertEquals(16, resp, 0.0001);
    }
    
    @Test
    public void ct03potencia() {
        Potencia potencia = new Potencia();
        float resp = potencia.pow(2, -2);
        assertEquals(0.25, resp, 0.0001);
    }
    
    @Test
    public void ct03potenciaM3() {
        PotenciaM3 potencia = new PotenciaM3();
        float resp = potencia.pow(2, -2);
        assertEquals(0.25, resp, 0.0001);
    }
    
    @Test
    public void ct04potencia() {
        Potencia potencia = new Potencia();
        float resp = potencia.pow(2, -2);
        assertEquals(0.25, resp, 0.0001);
    }
    
    @Test
    public void ct04potenciaM4() {
        PotenciaM4 potencia = new PotenciaM4();
        float resp = potencia.pow(2, -2);
        assertEquals(0.25, resp, 0.0001);
    }
    
    @Test
    public void ct05potencia() {
        Potencia potencia = new Potencia();
        float resp = potencia.pow(2, 0);
        assertEquals(1, resp, 0.0001);
    }
    
    @Test
    public void ct05potenciaM5() {
        PotenciaM5 potencia = new PotenciaM5();
        float resp = potencia.pow(2, 0);
        assertEquals(1, resp, 0.0001);
    }
}
