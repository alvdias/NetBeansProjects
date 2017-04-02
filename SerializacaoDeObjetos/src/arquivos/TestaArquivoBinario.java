package arquivos;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author fabricio@utfpr.edu.br
 */
public class TestaArquivoBinario {

    public ObjectOutputStream criarEscritor(File arquivo, boolean append) {
        ObjectOutputStream objectOutputStream = null;
        try {
            if (arquivo.exists()) {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(arquivo, append)) {
                    @Override
                    protected void writeStreamHeader() {
                        // nao escreve cabecalho no arquivo
                    }
                };
            } else {
                objectOutputStream = new ObjectOutputStream(new FileOutputStream(arquivo, append));
            }
        } catch (IOException erro) {
            System.out.println("Erro: " + erro);
        }
        return objectOutputStream;
    }

    public ObjectInputStream criarLeitor(File arquivo) {
        ObjectInputStream objectInputStream = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(arquivo);
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch (IOException erro) {
            System.out.println("Erro: " + erro);
        }
        return objectInputStream;
    }

    public void escrever(ObjectOutputStream objectOutputStream, Object object,
            boolean flush) {
        try {
            objectOutputStream.writeObject(object);
            if (flush) {
                objectOutputStream.flush();
            }
        } catch (IOException erro) {
            System.out.println("Erro: " + erro);
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
    
    public void imprimirTodosClientes(ObjectInputStream objectInputStream) {
        Cliente cliente = (Cliente) ler(objectInputStream);
        while (cliente != null) {
            imprimirCliente(cliente);
            cliente = (Cliente) ler(objectInputStream);
        }
    }

    public static void main(String[] args) {
        TestaArquivoBinario testaArquivoBinario = new TestaArquivoBinario();
        Cliente c1 = new Cliente("Zezinho", "3354-2000", 53);
        Cliente c2 = new Cliente("Huginho", "3354-2000", 50);
        Cliente c3 = new Cliente("Luizinho", "3354-2000", 51);

        File arquivo = new File("/home/diego/temp/clientes.obj");

        ObjectOutputStream escritor
                = testaArquivoBinario.criarEscritor(arquivo, true);

        testaArquivoBinario.escrever(escritor, c1, false);
        testaArquivoBinario.escrever(escritor, c2, false);
        testaArquivoBinario.escrever(escritor, c3, true);

        ObjectInputStream leitor = testaArquivoBinario.criarLeitor(arquivo);

        testaArquivoBinario.imprimirTodosClientes(leitor);
    }
}
