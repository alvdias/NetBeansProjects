/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.EmptyStackException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diego
 */
public class StackTest {
    
    public StackTest() {
    }

    @Test(expected = EmptyStackException.class)
    public void pilhaVazia() {
        Stack stack = new Stack();
        stack.pop();
    }
    
    @Test
    public void recuperaEmpilhado() {
        Stack stack = new Stack();
        stack.push(10);
        int resp = stack.pop();
        assertEquals(10, resp);
    }
    
    @Test
    public void empilhaNoLimite() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }
    
    @Test
    public void aumentaPillha() {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        int resp = stack.values.length;
        assertEquals(6, resp);
        assertEquals(40, stack.pop());
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }
    
    @Test
    public void desafio() {
        Stack stack = new Stack() {
//            private void resize() {
//                // nao escreve cabecalho no arquivo
//            }
        };
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        assertEquals(40, stack.pop());
        assertEquals(30, stack.pop());
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }
}
