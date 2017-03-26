/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portao;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author diego
 */
public class PortaoControllerTest {
    
    public PortaoControllerTest() {
    }

    @Test
    public void ct01() {
        Display displayMock = mock(Display.class);
        when(displayMock.limpar()).thenReturn();
    }
}
