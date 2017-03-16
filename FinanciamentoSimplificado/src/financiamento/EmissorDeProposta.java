/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financiamento;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class EmissorDeProposta {

    ArrayList<Proposta> definirPropostas(Cliente cliente) {
        float salario = cliente.getSalario();
        if (salario <= 1000.00F) {
            float total = cliente.getValorASerFinanciado() * 2.0F;
            float valorParcelas = total / 2;
            Proposta proposta1 = 
                    new Proposta(total, 2, valorParcelas);
            
            valorParcelas = total / 3;
            Proposta proposta2 = 
                    new Proposta(total, 3, valorParcelas);
            
            ArrayList<Proposta> propostas = new ArrayList<>();
            propostas.add(proposta1);
            propostas.add(proposta2);
            return propostas;
        } else {
            return null;
        }
    }
    
}
