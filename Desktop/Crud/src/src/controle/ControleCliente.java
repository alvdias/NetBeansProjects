/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import arquivos.GerenciarArquivos;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author luizf
 */
public class ControleCliente {

    GerenciarArquivos gravaTexto = new GerenciarArquivos();
    // File diretorio = new File("E:/UTFPR/Programação Dektop/Exercicios/ProgDesktop/persiste");
    File arquivo2 = AbreArquivo();
    //File arquivo = new File(arquivo2);

    Cliente mod = new Cliente();
    ArrayList<String> aux = new ArrayList<String>();

    public void insereCliente(ArrayList<Cliente> cliente) throws IOException {

        gravaTexto.EscreveTexto(arquivo2, cliente, true);
        JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso!");
    }

    public ArrayList<Cliente> pesquisaCLiente(String cpf) throws IOException {

        int fim = 0;
        int inicio = 0;
        int indiceLinha;
        String vet[] = new String[6];
        String cliente = null;
        aux = gravaTexto.LerTexto(arquivo2);

        ArrayList<Cliente> cli = new ArrayList<Cliente>();
        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).contains(cpf)) {
                cliente = aux.get(i);
                aux.remove(i);
            }
        }
        for (int j = 0; j < vet.length; j++) {

            fim = cliente.indexOf(';', inicio);
            vet[j] = cliente.substring(inicio, fim);
            inicio = fim + 1;
        }
        mod.setNome(vet[0]);
        mod.setIdade(Integer.parseInt(vet[1]));
        mod.setFone(vet[2]);
        mod.setCPF(vet[3]);
        mod.setAltura(Float.parseFloat(vet[4]));
        mod.setPeso(Float.parseFloat(vet[5]));
        cli.add(mod);

        return cli;

    }

    public void alteraCliente(ArrayList<Cliente> cliente) throws IOException {
        int indice = aux.size();
        aux.add(indice, cliente.get(0).toString());
        gravaTexto.escreveTextoAlterado(arquivo2, aux, true);
        JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso!");
    }

    public void excluiCliente(String cpf) throws IOException {
        aux = gravaTexto.LerTexto(arquivo2);
        for (int i = 0; i < aux.size(); i++) {
            if (aux.get(i).contains(cpf)) {
                aux.remove(i);
            }
        }
        gravaTexto.escreveTextoAlterado(arquivo2, aux, true);
    }

    public File AbreArquivo() {
        File arquivo = null;
        String pastainicial = System.getProperty("user.dir");
        JFileChooser chooser = new JFileChooser(pastainicial);
        int opcao = chooser.showDialog(null, "Salvar");

        if (opcao == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();

            System.out.println("O Arquivo selecionado foi: "
                    + arquivo.getAbsolutePath());
        }
        return arquivo;
    }

}
