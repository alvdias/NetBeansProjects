package encripta_decripta;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/**
 *
 * @author diego
 */
public class EncriptaDecriptaDES {

    public static void main(String[] args) {
        try {
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey chaveDES = keygenerator.generateKey();
            Cipher cifraDES;
            // Cria a cifra
            cifraDES = Cipher.getInstance("DES/ECB/PKCS5Padding");
            // Inicializa a cifra para o processo de encriptação
            cifraDES.init(Cipher.ENCRYPT_MODE, chaveDES);
            // Texto puro
            byte[] textoPuro = "Exemplo de texto puro".getBytes();
            System.out.println("Texto Puro : " + new String(textoPuro));
            // Texto encriptado
            byte[] textoEncriptado = cifraDES.doFinal(textoPuro);
            System.out.println("Texto Encriptado : " + textoEncriptado);
            // Inicializa a cifra também para o processo de decriptação
            cifraDES.init(Cipher.DECRYPT_MODE, chaveDES);
            // Decriptografa o texto
            byte[] textoDecriptografado = cifraDES.doFinal(textoEncriptado);
            System.out.println("Texto Decriptografado : " + new String(textoDecriptografado));
        } catch (Exception e) {
        }
    }

}
