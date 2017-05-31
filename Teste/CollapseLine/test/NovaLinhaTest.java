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
public class NovaLinhaTest {
    
    public NovaLinhaTest() {
    }

    @Test
    public void ct01() {
        NovaLinha novaLinha = new NovaLinha();
        String resp = novaLinha.collapseNewlines("");
        assertEquals("", resp);
    }
    
    @Test
    public void ct02() {
        NovaLinha novaLinha = new NovaLinha();
        String resp = novaLinha.collapseNewlines("a\naa\n\n");
        assertEquals("", resp);
    }
}
