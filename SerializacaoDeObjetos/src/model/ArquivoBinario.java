package model;

import controller.Animal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class ArquivoBinario {

    private File arquivo;
    private ObjectOutputStream escritor;
    private ObjectInputStream leitor;

    public File getArquivo() {
        return arquivo;
    }

    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

    public void adicionarUm(Object objeto) throws IOException {
        criarEscritor(true);
        escrever(objeto, true);
    }

    public void adicionarTodos(Object objeto) throws IOException {
        criarEscritor(false);
        escrever(objeto, true);
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

    public void escrever(Object objeto, boolean flush) throws IOException {
        escritor.writeObject(objeto);
        if (flush) {
            escritor.flush();
        }
    }

    public ArrayList pegarTodos() throws IOException, ClassNotFoundException {
        criarLeitor();
        return lerTodos();
    }

    public void criarLeitor() throws IOException {
        leitor = null;
        leitor = new ObjectInputStream(new FileInputStream(arquivo));
    }

    public Object ler() throws ClassNotFoundException {
        Object objectLido = null;
        try {
            objectLido = leitor.readObject();
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            return objectLido;
        }
    }

    public ArrayList lerTodos() throws IOException, ClassNotFoundException {
        ArrayList<Object> array = new ArrayList();
        Object object = ler();
        while (object != null) {
            array.add(object);
            object = ler();
        }
        return array;
    }

}
