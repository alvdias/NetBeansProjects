package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciarArquivos {

    private FileReader leitor;
    private BufferedReader leitorBuffer;
    private FileWriter escritor;
    private BufferedWriter escritorBuffer;

    public void EscreveTexto(File arq, ArrayList texto, boolean flush) throws IOException {
        if (arq == null) {
            JOptionPane.showMessageDialog(null, "Abre Arquivo");
        } else {
            escritor = new FileWriter(arq, true);
            escritorBuffer = new BufferedWriter(escritor);
            for (int i = 0; i < texto.size(); i++) {
                escritorBuffer.write(texto.get(i).toString());
                escritorBuffer.write("\n");
            }
        }
        if (flush) {
            escritorBuffer.flush();
            fechar();
        }

    }

    public void escreveTextoAlterado(File arq, ArrayList<String> cliente, boolean flush) throws IOException {
        escritor = new FileWriter(arq);
        escritorBuffer = new BufferedWriter(escritor);
        for (int i = 0; i < cliente.size(); i++) {
            escritorBuffer.write(cliente.get(i).toString());
            escritorBuffer.write("\n");
        }
        if (flush) {
            escritorBuffer.flush();
            fechar();
        }
    }

    public ArrayList<String> LerTexto(File arq) throws FileNotFoundException, IOException {
        ArrayList<String> arquivo = new ArrayList<>();
        StringBuilder aux = new StringBuilder();
        String auxiliar = null;
        leitor = new FileReader(arq);
        leitorBuffer = new BufferedReader(leitor);
        auxiliar = leitorBuffer.readLine();
        while (auxiliar != null) {
            arquivo.add(auxiliar);
            auxiliar = leitorBuffer.readLine();

        }
        return arquivo;

    }

    public void fechar() throws IOException {
        if (escritorBuffer != null) {
            escritorBuffer.close();
            escritorBuffer.close();
        }
    }

}
