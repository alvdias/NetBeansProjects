package controller;

import java.io.IOException;
import java.util.ArrayList;
import model.AnimalDAO;

/**
 *
 * @author diego
 */
public class Testa {
    public static void main(String[] args) throws IOException {
        Animal animal1 = new Animal();
        AnimalDAO animalDAO = new AnimalDAO();
        ArrayList<Animal> animais;
        animal1.setNome("Duque");
        animal1.setIdade(2);
        animal1.setRacaId(1);
        animalDAO.criar(animal1);
        animais = animalDAO.recuperar();
        for (Animal animal : animais) {
            System.out.println(animal.getNome());
        }
    }
}
