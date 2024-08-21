public abstract class AnimalMarinhoAB extends AnimalAB {

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, "Animal Marinho", idade, habitat, altura, peso);

    }

    public abstract void nadar();
}
