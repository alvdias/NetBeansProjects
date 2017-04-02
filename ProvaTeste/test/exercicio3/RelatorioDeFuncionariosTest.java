/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
/**
 *
 * @author diego
 */
public class RelatorioDeFuncionariosTest {
    
    public RelatorioDeFuncionariosTest() {
    }

    @Test
    public void doisTecnicosNaoBloqueados() {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Diego");
        funcionario1.setId(1);
        funcionario1.setCpf("123456789-00");
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Gustavo");
        funcionario2.setId(2);
        funcionario2.setCpf("987654321-98");
        ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
        funcs.add(funcionario1);
        funcs.add(funcionario2);
        
        FuncionarioDAO funcDaoMock = mock(FuncionarioDAO.class);
        when(funcDaoMock.getFuncionarioBy("tecnico")).thenReturn(funcs);
        
        ReceitaFederal rfMock = mock(ReceitaFederal.class);
        when(rfMock.isCPFBLOQUEADO(anyString())).thenReturn(false);
        
        RelatorioDeFuncionarios relatorioDeFuncionarios = new RelatorioDeFuncionarios(funcDaoMock);
        relatorioDeFuncionarios.setRf(rfMock);
        int resp = relatorioDeFuncionarios.getFuncComCFPBloqueado("tecnico");
        
        assertEquals(0, resp);
        
        verify(funcDaoMock, times(1)).getFuncionarioBy("tecnico");
        verify(rfMock, times(1)).isCPFBLOQUEADO("123456789-00");
        verify(rfMock, times(1)).isCPFBLOQUEADO("987654321-98");
        verify(rfMock, times(2)).isCPFBLOQUEADO(anyString());
    }
    
    @Test
    public void umAnalistaBloqueado() {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Diego");
        funcionario1.setId(1);
        funcionario1.setCpf("123456789-00");
        ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
        funcs.add(funcionario1);
        
        FuncionarioDAO funcDaoMock = mock(FuncionarioDAO.class);
        when(funcDaoMock.getFuncionarioBy("analista")).thenReturn(funcs);
        
        ReceitaFederal rfMock = mock(ReceitaFederal.class);
        when(rfMock.isCPFBLOQUEADO(anyString())).thenReturn(true);
        
        RelatorioDeFuncionarios relatorioDeFuncionarios = new RelatorioDeFuncionarios(funcDaoMock);
        relatorioDeFuncionarios.setRf(rfMock);
        int resp = relatorioDeFuncionarios.getFuncComCFPBloqueado("analista");
        
        assertEquals(1, resp);
        
        verify(funcDaoMock, times(1)).getFuncionarioBy("analista");
        verify(rfMock, times(1)).isCPFBLOQUEADO("123456789-00");
        verify(rfMock, times(1)).isCPFBLOQUEADO(anyString());
    }
    
    @Test
    public void quatroGerentesDoisBloqueados() {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Diego");
        funcionario1.setId(1);
        funcionario1.setCpf("123456789-00");
        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Gustavo");
        funcionario2.setId(2);
        funcionario2.setCpf("111222333-44");
        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Tiago");
        funcionario3.setId(3);
        funcionario3.setCpf("654321987-23");
        Funcionario funcionario4 = new Funcionario();
        funcionario4.setNome("Vitor");
        funcionario4.setId(4);
        funcionario4.setCpf("098876654-99");
        ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
        funcs.add(funcionario1);
        funcs.add(funcionario2);
        funcs.add(funcionario3);
        funcs.add(funcionario4);
        
        FuncionarioDAO funcDaoMock = mock(FuncionarioDAO.class);
        when(funcDaoMock.getFuncionarioBy("gerente")).thenReturn(funcs);
        
        ReceitaFederal rfMock = mock(ReceitaFederal.class);
        when(rfMock.isCPFBLOQUEADO("123456789-00")).thenReturn(false);
        when(rfMock.isCPFBLOQUEADO("111222333-44")).thenReturn(true);
        when(rfMock.isCPFBLOQUEADO("654321987-23")).thenReturn(false);
        when(rfMock.isCPFBLOQUEADO("098876654-99")).thenReturn(true);
        
        RelatorioDeFuncionarios relatorioDeFuncionarios = new RelatorioDeFuncionarios(funcDaoMock);
        relatorioDeFuncionarios.setRf(rfMock);
        int resp = relatorioDeFuncionarios.getFuncComCFPBloqueado("gerente");
        
        assertEquals(2, resp);
        
        verify(funcDaoMock, times(1)).getFuncionarioBy("gerente");
        verify(rfMock, times(1)).isCPFBLOQUEADO("123456789-00");
        verify(rfMock, times(1)).isCPFBLOQUEADO("111222333-44");
        verify(rfMock, times(1)).isCPFBLOQUEADO("654321987-23");
        verify(rfMock, times(1)).isCPFBLOQUEADO("098876654-99");
        verify(rfMock, times(4)).isCPFBLOQUEADO(anyString());
    }
}
