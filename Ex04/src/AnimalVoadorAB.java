public abstract class AnimalVoadorAB extends AnimalAB {

    protected double envergaduraAsa;
    protected int quantidadeAsas;


    public  AnimalVoadorAB( String nome, String tipoAnimal, int idade, String habitat, double altura, double peso, double envergaduraAsa, int quantidadeAsas) {
        super(nome, "Animal Voador", idade, habitat, altura, peso);
        this.envergaduraAsa = envergaduraAsa;
        this.quantidadeAsas = quantidadeAsas;
    }

    public abstract void voar();

}
