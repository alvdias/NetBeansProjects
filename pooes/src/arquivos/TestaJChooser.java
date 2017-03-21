package arquivos;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author diego
 */
public class TestaJChooser {
    
    public static void main(String[] args) {
        File file;
        file = getArquivo("Selecionar");
    }
    
    public static File getArquivo(String txtbtn) {
        File arquivo = null;
        String pastainicial = System.getProperty("user.dir");
        //caso queiram saber mais:
        System.out.println(System.getProperties());
        JFileChooser chooser = new JFileChooser(pastainicial);
        //chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        //ou
        //chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        //ou
        //chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int opcao = chooser.showDialog(null, txtbtn);
        if (opcao == JFileChooser.APPROVE_OPTION) {
            //pega arquivo
            arquivo = chooser.getSelectedFile();
            System.out.println("O Arquivo selecionado foi: "
                    + arquivo.getAbsolutePath());
        } else if (opcao == JFileChooser.CANCEL_OPTION) {
            return null;
        }
        return arquivo;
    }
}
