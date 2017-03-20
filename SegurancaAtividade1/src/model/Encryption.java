/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author diego
 */
public class Encryption {

    public String encrypt(String message, String key) {
        if (!this.validateParams(message, key)) {
            return null;
        }
        char[] charsKey = key.toCharArray();
        char[] charsMessage = message.toCharArray();
        for (int i = 0; i < charsMessage.length; i++) {
            int numberCharBase = ((int) charsMessage[i]) - 97;
            int increase = ((int) charsKey[i]) - 96;
            char result = (char) (((numberCharBase + increase) % 26) + 97);
            charsMessage[i] = result;
        }
        return new String(charsMessage);
    }

    public String decrypt(String message, String key) {
        if (!this.validateParams(message, key)) {
            return null;
        }
        char[] charsKey = key.toCharArray();
        char[] charsMessage = message.toCharArray();
        for (int i = 0; i < charsMessage.length; i++) {
            int numberCharBase = ((int) charsMessage[i]) - 97;
            int increase = ((int) charsKey[i]) - 96;
            int diference = numberCharBase - increase;
            if (diference < 0) {
                increase -= 26;
            }
            char result = (char) (((numberCharBase - increase)) + 97);
            charsMessage[i] = result;
        }
        return new String(charsMessage);
    }

    public String keyGenerate(int size) {
        char[] key = new char[size];
        for (int i = 0; i < size; i++) {
            key[i] = (char) (int) (97 + (Math.random() * 26));
        }
        return new String(key);
    }

    private boolean validateParams(String message, String key) {
        int messageSize = message.length();
        int keySize = key.length();
        return messageSize == keySize;
    }

}
