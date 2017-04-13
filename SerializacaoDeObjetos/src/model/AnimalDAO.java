package model;

import controller.Animal;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class AnimalDAO {

    private File arquivoAnimais;

    public AnimalDAO() {
        // TODO arrumar caminho padrao
        arquivoAnimais = new File("/home/diego/arquivoAnimais.obj");
    }

    public AnimalDAO(String arquivoAnimais) {
        this.arquivoAnimais = new File(arquivoAnimais);
    }

    public AnimalDAO(File arquivoAnimais) {
        this.arquivoAnimais = arquivoAnimais;
    }

    public boolean adicionarUm(Animal animal) {
        if (this.arquivoAnimais == null) {
            return false;
        }
        ArquivoBinario arquivoBinario = new ArquivoBinario();
        arquivoBinario.setArquivo(arquivoAnimais);
        try {
            arquivoBinario.adicionarUm(animal);
        } catch (IOException ex) {
            System.err.println(ex);
            return false;
        }
        return true;
    }

    public boolean adicionarTodos(Object object) {
        if (this.arquivoAnimais == null) {
            return false;
        }
        ArquivoBinario arquivoBinario = new ArquivoBinario();
        arquivoBinario.setArquivo(arquivoAnimais);
        try {
            arquivoBinario.adicionarTodos(object);
        } catch (IOException ex) {
            System.err.println(ex);
            return false;
        }
        return true;
    }

    public ArrayList<Animal> pegarTodos() {
        if (this.arquivoAnimais == null) {
            return null;
        }
        ArquivoBinario arquivoBinario = new ArquivoBinario();
        arquivoBinario.setArquivo(arquivoAnimais);
        ArrayList<Animal> animalDAO = null;
        try {
            return (ArrayList<Animal>) arquivoBinario.pegarTodos();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
            return null;
        }
    }
}
