package prova1;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author diego
 */
public class TesteJfile {
    
    public static void main(String[] args) {
        getArquivo("Selecione o Arquivo");
    }

    public static File getArquivo(String txtbtn) {
        File arquivo = null;
        String pastainicial = System.getProperty("user.dir");

        //caso queiram saber mais:
        System.out.println("Propriedades: " + System.getProperties());

        JFileChooser chooser = new JFileChooser(pastainicial);

        //chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //ou
        //chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        //ou
        //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int opcao = chooser.showDialog(null, txtbtn);

        if (opcao == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();

            System.out.println("O Arquivo selecionado foi: "
                    + arquivo.getAbsolutePath());
        }
        return arquivo;
    }
}
