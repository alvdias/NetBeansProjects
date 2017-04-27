package arquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class TestaArquivo2 {

    private File arquivo = null;
    private BufferedReader entrada = null;
    private BufferedWriter estritor = null;

    private void abrirarquivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.CANCEL_OPTION) {
            return;
        }
        arquivo = fileChooser.getSelectedFile();
        System.out.println(arquivo);

        if (arquivo == null || arquivo.getName().equals("")) {
            JOptionPane.showMessageDialog(
                    null, "Nome de Arquivo Inválido",
                    "Nome de Arquivo Inválido",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                entrada = new BufferedReader(new FileReader(arquivo));
            } catch (IOException ioException) {
                JOptionPane.showMessageDialog(
                        null, "Error ao Abrir Arquivo",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File diretorio = new File("/home/diego/temp/");
        diretorio.mkdir();

        TestaArquivo2 obj = new TestaArquivo2();
        obj.arquivo = new File("/home/diego/temp/log.txt");
        obj.escrever("Ola Mundo!\n", true);
        obj.escrever("Ola Mundo 2!\n", true);
        
        obj.abrirarquivo();
        if (obj.entrada != null) {
            System.out.println("Leitura do Arquivo: ");
            System.out.println(obj.ler());
        }
    }

    public boolean escrever(
            String texto,
            boolean append) {
        try {
            BufferedWriter escritorbuffer;
            escritorbuffer = new BufferedWriter(new FileWriter(arquivo, append));
            escritorbuffer.write(texto);
            escritorbuffer.close();
            return false;
        } catch (IOException erro) {
            System.err.println("Erro na escrita do arquivo!\n" + erro);
        }
        return false;
    }
    
    public String ler () {
        StringBuilder sb = new StringBuilder();
        try {
            entrada = new BufferedReader(new FileReader(arquivo));
            while (entrada.ready()) {
                sb.append(entrada.readLine()).append("\n");
            }
            return sb.toString();
        } catch(IOException erro) {
            System.err.println("Erro na escrita do arquivo!\n" + erro);
        }
        return null;
    }
}
