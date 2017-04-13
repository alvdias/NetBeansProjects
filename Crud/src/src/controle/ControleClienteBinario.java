/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import arquivos.TestaArquivoBinario;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Cliente;

/**
 *
 * @author luizf
 */
public class ControleClienteBinario {

    TestaArquivoBinario binario = new TestaArquivoBinario();
    File arquivo2 = AbreArquivo();
    Cliente mod = new Cliente();
    ArrayList<String> aux = new ArrayList<String>();
    ArrayList<Cliente> clienteGlobal = null;
    int posicao = 0;

    public void insereCliente(ArrayList<Cliente> cliente) throws IOException {
        ArrayList<Cliente> aux;
        Cliente[] vet = (Cliente[]) cliente.toArray(new Cliente[cliente.size()]);
        clienteGlobal = carregaConteudo();

        if (clienteGlobal == null) {
            clienteGlobal = new ArrayList();
            clienteGlobal.add(vet[0]);
        } else {

            clienteGlobal.add(vet[0]);
        }

        ObjectOutputStream out = binario.CriaEscritorBinario(arquivo2, false);
        binario.EscreveObjeto(out, clienteGlobal, true);
        JOptionPane.showMessageDialog(null, "Arquivo Gravado com Sucesso!");
        out.close();
    }

    public ArrayList<Cliente> pesquisaCLiente(String cpf) throws IOException, ClassNotFoundException {
        ArrayList<Cliente> c = new ArrayList<Cliente>();
        ArrayList<Cliente> ret = new ArrayList<Cliente>();
        clienteGlobal = carregaConteudo();
        for (int i = 0; i < clienteGlobal.size(); i++) {
            if (clienteGlobal.get(i).getCPF().contains(cpf)) {
                mod = clienteGlobal.get(i);
                ret.add(mod);
            }
        }
        return ret;
    }

    public void alteraCliente(ArrayList<Cliente> cliente) throws IOException {
        Cliente[] vet = (Cliente[]) cliente.toArray(new Cliente[cliente.size()]);
        clienteGlobal.add(vet[0]);
        ObjectOutputStream out = binario.CriaEscritorBinario(arquivo2, false);
        binario.EscreveObjeto(out, clienteGlobal, true);
        JOptionPane.showMessageDialog(null, "Registro Alterado com Sucesso!");
        out.close();
    }

    public void excluiCliente(String cpf) throws IOException {
        clienteGlobal = conteudoAltera(cpf);
        ObjectOutputStream out = binario.CriaEscritorBinario(arquivo2, false);
        binario.EscreveObjeto(out, clienteGlobal, true);
        JOptionPane.showMessageDialog(null, "Registro Excluido com Sucesso!");
        out.close();

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

    public ArrayList<Cliente> carregaConteudo() throws IOException {
        ArrayList<Cliente> cli = null;
        ObjectInputStream leitor = binario.CriaLeitorBinario(arquivo2);
        cli = (ArrayList) binario.LeObjeto(leitor);
        return cli;
    }

    public ArrayList<Cliente> conteudoAltera(String cpf) throws IOException {
        for (int i = 0; i < clienteGlobal.size(); i++) {
            if (clienteGlobal.get(i).getCPF().contains(cpf)) {
                clienteGlobal.remove(i);
            }
        }
        return clienteGlobal;
    }
}
