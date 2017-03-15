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
public class Criptografia {

    public String encrypt(String message, String key) {
        char[] charsKey = key.toCharArray();
        char[] charsMessage = message.toCharArray();
        for (char charKey : charsKey) {
            for (int i = 0; i < charsMessage.length; i++) {
                charsMessage[i] = (char) (((int) charsMessage[i]) + ((int) charKey));
            }
        }
        return new String(charsMessage);
    }
    
    public String decrypt(String message, String key) {
        char[] charsKey = key.toCharArray();
        char[] charsMessage = message.toCharArray();
        for (char charKey : charsKey) {
            for (int i = 0; i < charsMessage.length; i++) {
                charsMessage[i] = (char) (((int) charsMessage[i]) - ((int) charKey));
            }
        }
        return new String(charsMessage);
    }
    
    public String keyGenerate(int tamanho) {
        char[] key = new char[tamanho];
        for (int i = 0; i < tamanho; i++) {
         key[i] = (char) (int) (96 + (Math.random() * 27));   
        }
        return new String(key);
    }
    
}
