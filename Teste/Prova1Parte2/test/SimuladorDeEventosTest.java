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
public class SimuladorDeEventosTest {
    
    public SimuladorDeEventosTest() {
    }

    @Test
    public void testaStatus() {
        //New
        SimuladorDeEventos simuladorDeEventos = new SimuladorDeEventos();
        
        //eventA
        simuladorDeEventos.eventA();
        
        //Estado01 status/true
        assertTrue(simuladorDeEventos.status());
        
        //eventB
        simuladorDeEventos.eventB();
        
        //Estado02 status/true
        assertTrue(simuladorDeEventos.status());
        
        //eventC
        simuladorDeEventos.eventC();
        
        //Estado04 status/false
        assertFalse(simuladorDeEventos.status());
        
        //eventD
        simuladorDeEventos.eventD();
        
        //Estado03 status/false
        assertFalse(simuladorDeEventos.status());
    }
    
    @Test
    public void outrasTransicoes() {
        //New
        SimuladorDeEventos simuladorDeEventos = new SimuladorDeEventos();
        //eventA
        simuladorDeEventos.eventA();
        //eventA
        assertTrue(simuladorDeEventos.eventA());
        
        //New
        SimuladorDeEventos simuladorDeEventos2 = new SimuladorDeEventos();
        //eventA
        simuladorDeEventos2.eventA();
        //eventC
        assertTrue(simuladorDeEventos2.eventC());
    }
}
