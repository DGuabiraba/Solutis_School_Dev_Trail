package Animais;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }
    @Override
    public void emitirSom() {
        System.out.println(getNome() +" está emitindo um Som");
    }

    public void subirArvore(){
        System.out.println(getNome()+ " está subindo em uma arvore!");
    }
}