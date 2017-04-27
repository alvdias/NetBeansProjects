package model;

import controller.Animal;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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

    public boolean criar(Animal animal) throws IOException {
        if (arquivoAnimais == null) {
            return false;
        }
        try {
            ArquivoBinario arquivoBinario = new ArquivoBinario(this.arquivoAnimais);
            ArrayList<Animal> animalDAO;
            if(arquivoAnimais.exists()) {
                animalDAO = (ArrayList<Animal>)arquivoBinario.recuperar();
            } else {
                animalDAO = new ArrayList();
            }
            animalDAO.add(animal);
            arquivoBinario.criar(animalDAO);
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
            return false;
        }
        return true;
    }

    public ArrayList<Animal> recuperar() {
        if (arquivoAnimais == null) {
            return null;
        }
        try {
            ArquivoBinario arquivoBinario = new ArquivoBinario(arquivoAnimais);
            return(ArrayList<Animal>) arquivoBinario.recuperar();
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println(ex);
            return null;
        }
    }
}
