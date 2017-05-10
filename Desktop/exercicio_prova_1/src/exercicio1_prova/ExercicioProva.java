package exercicio1_prova;

import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class ExercicioProva {    
    public static final boolean incluiTexto(File arquivo, String texto) throws IOException {
        if (arquivo.exists()) {
            BufferedReader leitorBuffer = new BufferedReader(new FileReader(arquivo));
            while(leitorBuffer.ready()) {
                if(leitorBuffer.readLine().contains(texto)) {
                    return true;
                }
            }
            leitorBuffer.close();
        }
        return false;
    }
}
