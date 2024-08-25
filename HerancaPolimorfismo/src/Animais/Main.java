package Animais;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Lina",12);
        Animal cavalo = new Cavalo("Atlas",12);
        Animal preguica = new Preguica("Flesha",12);

        Animal[] animals = {cachorro,cavalo,preguica};
        for (Animal animal : animals) {
            animal.emitirSom();
            System.out.println("----------------------------");
        }
        Veterinario veterinario = new Veterinario();
        veterinario.examinar(animals[0]);
        veterinario.examinar(animals[1]);
        veterinario.examinar(animals[2]);
        System.out.println("----------------------------");

        Zoologico zoologico = new Zoologico();
        System.out.println("Percorrendo as jaulas");
        System.out.println();
        System.out.println("----------------------------");
        zoologico.adicionarAnimal(0,cachorro);
        zoologico.adicionarAnimal(1,preguica);
        zoologico.adicionarAnimal(2,cavalo);
        zoologico.adicionarAnimal(3,new Cavalo("Docin",5));
        zoologico.adicionarAnimal(4,new Cachorro("Duki",3));
        zoologico.adicionarAnimal(5,new Preguica("Hoffmann ",12));
        zoologico.adicionarAnimal(6,new Cachorro("Bacon",1));
        zoologico.adicionarAnimal(7,new Cavalo("Thor",11));
        zoologico.adicionarAnimal(8,new Cachorro("Mel",2));
        zoologico.adicionarAnimal(9,new Preguica("Fred",30));

        zoologico.percorrerJaulas();
    }

}