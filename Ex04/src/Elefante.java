public class Elefante extends AnimaisTerrestreAB {

    public Elefante(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso,
            int quantidadePatas) {
        super(nome, "Elefante", idade, habitat, altura, peso, quantidadePatas);
    }

    @Override
    public void comer() {
        quantidadeComida += 200;
        System.out.println("O elefante, " + nome +" comeu: " + quantidadeComida + " kg de comida hoje ");
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 60 ;
        System.out.println("O elefante, " + nome + " andou: " + distanciaPercorrida + " km hoje");
    }

    @Override
    public void dormir() {
        horasDormidas += 2;
        System.out.println("O elefante, " + nome + " dormiu: " + horasDormidas + " horas hoje");
    }

}
