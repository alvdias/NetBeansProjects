package controller;

import java.util.ArrayList;
import model.AnimalDAO;

/**
 *
 * @author diego
 */
public class TestaNovaClasse {
    public static void main(String[] args) {
        Animal animal1 = new Animal();        
        AnimalDAO animalDAO = new AnimalDAO();
        ArrayList<Animal> animais;
        animal1.setNome("Duque");
        animal1.setIdade(2);
        animal1.setRacaId(1);
        animalDAO.adicionarUm(animal1);
        animais = animalDAO.pegarTodos();
        for (Animal animal : animais) {
            System.out.println(animal.getNome());
        }
    }
}
