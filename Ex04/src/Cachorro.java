public class Cachorro extends AnimaisTerrestreAB {

    public Cachorro(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso,
            int quantidadePatas) {
        super(nome, "Cachorro", idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer() {
        quantidadeComida += 145;
        System.out.println("O cachorro, " + nome +" comeu: " + quantidadeComida + " g de ração");
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 10;
        System.out.println("O cachorro, " + nome + " andou: " + distanciaPercorrida + " km hoje");
    }

    @Override
    public void dormir() {
        horasDormidas += 12;
        System.out.println("O cachorro, " + nome + " dormiu: " + horasDormidas + " horas hoje");
    }

}
