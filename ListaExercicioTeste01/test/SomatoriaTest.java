/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author diego
 */
public class SomatoriaTest {
    
    public SomatoriaTest() {
    }

    @Test
    public void ct01() {
        MathOps mathOpsMock = mock(MathOps.class);
        when(mathOpsMock.fatorial(3)).thenReturn(6);
        when(mathOpsMock.fatorial(4)).thenReturn(24);
        
        Somatoria somatoria = new Somatoria(mathOpsMock);
        int numeros[] = {3, 4};
        int resultado = somatoria.somaDeFatoriais(numeros);
        assertEquals(30, resultado);
        
        verify(mathOpsMock).fatorial(3);
        verify(mathOpsMock).fatorial(4);
        verify(mathOpsMock, times(2)).fatorial(anyInt());
    }
    
    @Test
    public void ct02() {
        MathOps mathOpsMock = mock(MathOps.class);
        when(mathOpsMock.fatorial(0)).thenReturn(1);
        when(mathOpsMock.fatorial(1)).thenReturn(1);
        when(mathOpsMock.fatorial(2)).thenReturn(2);
        when(mathOpsMock.fatorial(3)).thenReturn(6);
        when(mathOpsMock.fatorial(4)).thenReturn(24);
        
        Somatoria somatoria = new Somatoria(mathOpsMock);
        int numeros[] = {0, 1, 2, 3, 4};
        int resultado = somatoria.somaDeFatoriais(numeros);
        assertEquals(34, resultado);
        
        verify(mathOpsMock).fatorial(1);
        verify(mathOpsMock).fatorial(2);
        verify(mathOpsMock).fatorial(3);
        verify(mathOpsMock).fatorial(4);
        verify(mathOpsMock, times(5)).fatorial(anyInt());
    }
}
