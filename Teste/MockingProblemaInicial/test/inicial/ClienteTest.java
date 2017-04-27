package inicial;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author diego
 */
public class ClienteTest {

    public ClienteTest() {
    }

    @Test(expected = SemFundosException.class)
    public void semSaldoTest() throws SemFundosException {
//        criar o mock
        GerenteDeContas gerenteMock = mock(GerenteDeContas.class);
        when(gerenteMock.acharConta(anyObject())).thenReturn(new Conta());
        when(gerenteMock.recuperarSaldo(anyObject())).thenReturn(200l);
        
        Cliente cliente = new Cliente();
        cliente.setGerenteDeContas(gerenteMock);
        
//        saldo nas conta 200
        long num = cliente.efetuarSaque(400l);
        
        verify(gerenteMock).acharConta(cliente);
        verify(gerenteMock).recuperarSaldo(anyObject());
    }
    
    @Test()
    public void comSaldoTest() throws SemFundosException {
//        criar o mock
        GerenteDeContas gerenteMock = mock(GerenteDeContas.class);
        when(gerenteMock.acharConta(anyObject())).thenReturn(new Conta());
        when(gerenteMock.recuperarSaldo(anyObject())).thenReturn(200l, 50l);
        
        Cliente cliente = new Cliente();
        cliente.setGerenteDeContas(gerenteMock);
        
//        saldo nas conta 200
        long num = cliente.efetuarSaque(150l);
        assertEquals(50l, num);
        
        verify(gerenteMock).acharConta(cliente);
        verify(gerenteMock, times(2)).recuperarSaldo(anyObject());
    }
    
}
