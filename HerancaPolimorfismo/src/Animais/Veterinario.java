package Animais;

public class Veterinario {
    public void examinar(Animal animal){
        System.out.println("Examinando animal: "+animal.getNome());
        animal.emitirSom();
    }

}