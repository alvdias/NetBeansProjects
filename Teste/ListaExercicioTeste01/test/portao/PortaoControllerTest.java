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
    public void carroNaoTemtag() {
        Display displayMock = mock(Display.class);
        PortaoController portaoController = new PortaoController();
        portaoController.setDisplay(displayMock);
        boolean resp = portaoController.abrir("ERRO");
        
        assertEquals(resp, false);
        
        verify(displayMock, times(1)).limpar();
        verify(displayMock, times(1)).mostrarMsg("Automovel nao possui TAG. Por favor, voltar!");
    }
    
    @Test
    public void carroTemPlacaNaoConhecida() {
        Display displayMock = mock(Display.class);
        AutomovelDAO automovelDAOMock = mock(AutomovelDAO.class);
        
        when(automovelDAOMock.getByTag("123")).thenReturn(null);
        
        PortaoController portaoController = new PortaoController();
        portaoController.setDisplay(displayMock);
        portaoController.setAutomovelDao(automovelDAOMock);
        boolean resp = portaoController.abrir("123");
        
        assertEquals(resp, false);
        
        verify(displayMock, times(1)).limpar();
        verify(displayMock, times(1)).mostrarMsg("TAG desconhecida. Por favor, voltar!");
        verify(automovelDAOMock, times(1)).getByTag("123");
    }
    
    @Test
    public void carroTemPlacaConhecida() {
        Display displayMock = mock(Display.class);
        AutomovelDAO automovelDAOMock = mock(AutomovelDAO.class);
        Automovel automovelMock = mock(Automovel.class);
        Cancela cancelaMock = mock(Cancela.class);
        RegistroEntradaDao registroEntradaDaoMock = mock(RegistroEntradaDao.class);
        
        when(automovelDAOMock.getByTag("123")).thenReturn(automovelMock);
        when(automovelMock.getPlaca()).thenReturn("123");
        when(automovelMock.getProprietario()).thenReturn("Diego");
        
        PortaoController portaoController = new PortaoController();
        portaoController.setDisplay(displayMock);
        portaoController.setAutomovelDao(automovelDAOMock);
        portaoController.setCancela(cancelaMock);
        portaoController.setRegistroEntradaDao(registroEntradaDaoMock);
        boolean resp = portaoController.abrir("123");
        
        assertEquals(true, resp);
        
        verify(displayMock, times(1)).limpar();
        verify(automovelDAOMock, times(1)).getByTag("123");
        verify(automovelMock, times(2)).getProprietario();
        verify(displayMock, times(1)).mostrarMsg("Bem-Vindo, Diego!");
        verify(cancelaMock, times(1)).levantar();
        verify(automovelMock, times(1)).getPlaca();
        
    }
}
