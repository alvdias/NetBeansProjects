package exercicio_10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author diego
 */
public class BancoDeDadosTest {
    
    public BancoDeDadosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void PCE_01() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab12";
        int numeroAlunos = 12;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Sucesso", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    @Test
    public void PCE_02() {
        //Parametros
        String codigoDisciplina = "aba2c";
        String codigoTurma = "ab12";
        int numeroAlunos = 12;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(false);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Codigo de disciplina invalido", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    @Test
    public void PCE_03() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "aba2";
        int numeroAlunos = 12;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(false);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Codigo de turma invalido", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    @Test
    public void PCE_04() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab12";
        int numeroAlunos = 1;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Numero de alunos invalido", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    @Test
    public void PCE_05() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab12";
        int numeroAlunos = 60;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Numero de alunos invalido", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    //Tamanho do Codigo da disciplina invalido 4 caracteres
    @Test
    public void AVL_01() {
        //Parametros
        String codigoDisciplina = "ab12";
        String codigoTurma = "ab12";
        int numeroAlunos = 12;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(false);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Codigo de disciplina invalido", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    //Tamanho do Codigo da disciplina invalido 6 caracteres
    @Test
    public void AVL_02() {
        //Parametros
        String codigoDisciplina = "ab12cd";
        String codigoTurma = "ab12";
        int numeroAlunos = 12;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(false);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Codigo de disciplina invalido", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    //Tamanho do Codigo da turma invalido 3 caracteres
    @Test
    public void AVL_03() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab1";
        int numeroAlunos = 12;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(false);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Codigo de turma invalido", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    //Tamanho do Codigo da turma invalido 5 caracteres
    @Test
    public void AVL_04() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab12c";
        int numeroAlunos = 12;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(false);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Codigo de turma invalido", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    //Numero de alunos invalido 2 alunos
    @Test
    public void AVL_05() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab12";
        int numeroAlunos = 2;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Numero de alunos invalido", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    //Numero de alunos valido 3 alunos
    public void AVL_06() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab12";
        int numeroAlunos = 3;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Sucesso", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    public void AVL_07() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab12";
        int numeroAlunos = 4;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Sucesso", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    //Numero de alunos valido 43 alunos
    public void AVL_08() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab12";
        int numeroAlunos = 43;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Sucesso", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    //Numero de alunos valido 44 alunos
    public void AVL_09() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab12";
        int numeroAlunos = 44;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Sucesso", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
    
    //Numero de alunos invalido 45 alunos
    public void AVL_10() {
        //Parametros
        String codigoDisciplina = "ab12c";
        String codigoTurma = "ab12";
        int numeroAlunos = 45;
        
        //Mock
        VerificadorDeCodigos verificadorMock = mock(VerificadorDeCodigos.class);
        when(verificadorMock.verificarCodigoDisciplina(codigoDisciplina)).thenReturn(true);
        when(verificadorMock.verificarCodigoTurma(codigoTurma)).thenReturn(true);
        
        //Chamada do Metodo
        BancoDeDados bd = new BancoDeDados(verificadorMock);
        String resp = bd.cadastrarTurma(codigoDisciplina, codigoTurma, numeroAlunos);
        
        //Testes
        assertEquals("Numero de alunos invalido", resp);
        verify(verificadorMock, times(1)).verificarCodigoDisciplina(codigoDisciplina);
        verify(verificadorMock, times(1)).verificarCodigoTurma(codigoTurma);
        
    }
}
