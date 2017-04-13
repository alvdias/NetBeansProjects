package controller;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author fabricio@utfpr.edu.br
 */
public class TestaArquivoBinario {

    private File arquivo;
    private ObjectOutputStream escritor;
    private ObjectInputStream leitor;

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

    public void criarEscritor(boolean append) throws IOException {
        escritor = null;
        if (arquivo.exists()) {
            escritor = new ObjectOutputStream(new FileOutputStream(arquivo, append)) {
                @Override
                protected void writeStreamHeader() {
                    // nao escreve cabecalho no arquivo
                }
            };
        } else {
            escritor = new ObjectOutputStream(new FileOutputStream(arquivo, append));
        }
    }

    public void criarLeitor() throws FileNotFoundException, IOException {
        leitor = null;
        leitor = new ObjectInputStream(new FileInputStream(arquivo));
    }

    public void escrever(Object object, boolean flush) throws IOException {
        escritor.writeObject(object);
        if (flush) {
            escritor.flush();
        }
    }

    public Object ler(ObjectInputStream objectInputStream) {
        Object objectLido = null;
        try {
            objectLido = objectInputStream.readObject();
        } catch (ClassNotFoundException erro) {
            System.out.println("Erro: " + erro);
        } catch (java.io.EOFException erro) {
            System.out.println("Erro: " + erro);
        } catch (IOException erro) {
            System.out.println("Erro: " + erro);
        } finally {
            return objectLido;
        }
    }

    public void imprimirCliente(Cliente cliente) {
        if (cliente != null) {
            System.out.println(cliente.toString());
        } else {
            System.out.println("Cliente nulo.");
        }
    }

    public void imprimirTodosClientes() {
        Cliente cliente = (Cliente) ler(leitor);
        while (cliente != null) {
            imprimirCliente(cliente);
            cliente = (Cliente) ler(leitor);
        }
    }

    public static void main(String[] args) throws IOException {
        TestaArquivoBinario testaArquivoBinario = new TestaArquivoBinario();

        Cliente c1 = new Cliente("Zezinho", "3354-2000", 53);
        Cliente c2 = new Cliente("Huginho", "3354-2000", 50);
        Cliente c3 = new Cliente("Luizinho", "3354-2000", 51);
        File arquivo = new File("/home/diego/temp/clientes.obj");

        testaArquivoBinario.setArquivo(arquivo);
        testaArquivoBinario.criarEscritor(true);

        testaArquivoBinario.escrever(c1, false);
        testaArquivoBinario.escrever(c2, false);
        testaArquivoBinario.escrever(c3, true);

        testaArquivoBinario.criarLeitor();

        testaArquivoBinario.imprimirTodosClientes();
    }
}
