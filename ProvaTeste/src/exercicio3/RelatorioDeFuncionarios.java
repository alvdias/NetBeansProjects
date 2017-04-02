/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class RelatorioDeFuncionarios {

    FuncionarioDAO funcDao;
    ReceitaFederal rf;

    public RelatorioDeFuncionarios(FuncionarioDAO funcDao) {
        this.funcDao = funcDao;
    }

    public void setRf(ReceitaFederal rf) {
        this.rf = rf;
    }

    public int getFuncComCFPBloqueado(String categoria) {
        int numeroDeFuncionarios = 0;

        ArrayList<Funcionario> funcCategoria = funcDao.getFuncionarioBy(categoria);

        for (Funcionario f : funcCategoria) {
            if (rf.isCPFBLOQUEADO(f.getCpf())) {
                numeroDeFuncionarios++;
            }
        }
        
        return numeroDeFuncionarios;
    }
}
