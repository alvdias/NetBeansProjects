/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segurancaatividade1;

/**
 *
 * @author diego
 */
public class SegurancaAtividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Criptografia criptografia = new Criptografia();
        String key = criptografia.keyGenerate(10);
        System.out.println(key);
        String resp = criptografia.encrypt("emerson", "segredo");
        System.out.println("Mesagem: " + resp);
        resp = criptografia.decrypt(resp, "segredo");
        System.out.println(resp);
    }
    
}
