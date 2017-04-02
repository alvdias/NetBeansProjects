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
public interface FuncionarioDAO {
    public ArrayList<Funcionario> getFuncionarioBy(String categoria);
}
