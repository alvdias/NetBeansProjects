import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author diego
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void PCE_O1() throws Exception {
        //Parametros
        String regiao = "nordeste";
        int peso = 570;
        int valorRegiao = 3;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    @Test(expected = Exception.class)
    public void PCE_O2() throws Exception {
        //Parametros
        String regiao = "oeste";
        int peso = 570;
        int valorRegiao = -10;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    @Test(expected = Exception.class)
    public void PCE_O3() throws Exception {
        //Parametros
        String regiao = "nordeste";
        int peso = -5;
        int valorRegiao = 3;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    @Test(expected = Exception.class)
    public void PCE_O4() throws Exception {
        //Parametros
        String regiao = "nordeste";
        int peso = 3_000_000;
        int valorRegiao = 3;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    //Testa Primeira Regiao do Array
    @Test
    public void AVL_O1() throws Exception {
        //Parametros
        String regiao = "norte";
        int peso = 570;
        int valorRegiao = 1;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    //Testa Ultima Regiao do Array
    @Test
    public void AVL_02() throws Exception {
        //Parametros
        String regiao = "sul";
        int peso = 570;
        int valorRegiao = 5;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    //Testa Peso == 0
    @Test(expected = Exception.class)
    public void AVL_03() throws Exception {
        //Parametros
        String regiao = "nordeste";
        int peso = 0;
        int valorRegiao = 3;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    //Testa Peso == 1
    @Test()
    public void AVL_04() throws Exception {
        //Parametros
        String regiao = "nordeste";
        int peso = 1;
        int valorRegiao = 3;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    //Testa Peso == 2
    @Test()
    public void AVL_05() throws Exception {
        //Parametros
        String regiao = "nordeste";
        int peso = 2;
        int valorRegiao = 3;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    //Testa Peso == 1999999
    @Test()
    public void AVL_06() throws Exception {
        //Parametros
        String regiao = "nordeste";
        int peso = 1999999;
        int valorRegiao = 3;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    //Testa Peso == 2000000
    @Test()
    public void AVL_07() throws Exception {
        //Parametros
        String regiao = "nordeste";
        int peso = 2000000;
        int valorRegiao = 3;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
    
    //Testa Peso == 2000001
    @Test(expected = Exception.class)
    public void AVL_08() throws Exception {
        //Parametros
        String regiao = "nordeste";
        int peso = 2000001;
        int valorRegiao = 3;
        
        //Mock
        CustoDAO custoDAOMock = mock(CustoDAO.class);
        when(custoDAOMock.getCustoPorGrama(regiao)).thenReturn(valorRegiao);
        
        //Chama o Metodo
        Calculadora calculadora = new Calculadora(custoDAOMock);
        int resp = calculadora.calcularFrete(regiao, peso);
        
        //Testes
        assertEquals(peso * valorRegiao, resp);
        verify(custoDAOMock, times(1)).getCustoPorGrama(regiao);
    }
        
}
