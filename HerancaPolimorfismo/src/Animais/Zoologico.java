package Animais;

public class Zoologico {
    private Animal[] jaulas = new Animal[10];

    public void adicionarAnimal(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        }
    }
    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                if (animal instanceof Cachorro) {
                    ((Cachorro) animal).correr();
                } else if (animal instanceof Cavalo) {
                    ((Cavalo) animal).correr();
                }
            }
        }
    }
}