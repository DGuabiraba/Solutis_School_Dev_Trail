public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, "Peixe", idade, habitat, altura, peso);

        this.quantidadeComida = 0;
        this.horasDormidas = 0;
        this.distanciaPercorrida = 0;
    }

    @Override
    public void nadar() {
        distanciaPercorrida += 10;
        System.out.println("O peixe, "+ nome + " nadou: "+ distanciaPercorrida + " km hoje");
    }

    @Override
    public void comer() {

        quantidadeComida =+ 50;
        System.out.println("O peixe, " + nome +" comeu: " + quantidadeComida +" g de comida hoje");
    }

    @Override
    public void moverse() {
        nadar();
    }

    @Override
    public void dormir() {
        horasDormidas += 1;
        System.out.println("O peixe, " + nome + " dormiu:" + horasDormidas + " hora hoje");
    }

}
