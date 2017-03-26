/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
/**
 *
 * @author diego
 */
public class PessoaDAOTest {
    
    public PessoaDAOTest() {
    }

    @Test
    public void pessoaExisteTest() {
        RHService rHServiceMock = mock(RHService.class);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Joao da Silva");
        pessoas.add(pessoa1);
        Pessoa pessoa2 = new Pessoa();
        pessoa1.setNome("Maria Souza");
        pessoas.add(pessoa2);
        when(rHServiceMock.getAllPessoas()).thenReturn(pessoas);
        PessoaDAO dao = new PessoaDAO(rHServiceMock);
        boolean resposta = dao.existePessoa("Maria Souza");
        assertEquals(true, resposta);
        verify(rHServiceMock, times(1)).getAllPessoas();
    }
    
    @Test
    public void pessoaNaoExisteTest() {
        RHService rHServiceMock = mock(RHService.class);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Joao da Silva");
        pessoas.add(pessoa1);
        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Maria Souza");
        pessoas.add(pessoa2);
        when(rHServiceMock.getAllPessoas()).thenReturn(pessoas);
        PessoaDAO dao = new PessoaDAO(rHServiceMock);
        boolean resposta = dao.existePessoa("Carlos Andrade");
        assertEquals(false, resposta);
        verify(rHServiceMock, times(1)).getAllPessoas();
    }
}
