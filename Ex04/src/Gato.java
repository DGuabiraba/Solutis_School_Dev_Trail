public class Gato  extends AnimaisTerrestreAB {

    public Gato(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso,
            int quantidadePatas) {
        super(nome, "Gato", idade, habitat, altura, peso, 4);
    }

    @Override
    public void comer() {
        quantidadeComida += 55;
        System.out.println("O gato, " + nome +" comeu: " + quantidadeComida + " g de ração");
    }

    @Override
    public void moverse() {
        distanciaPercorrida += 3;
        System.out.println("O gato, " + nome + " andou: " + distanciaPercorrida + " km hoje");
    }

    @Override
    public void dormir() {
        horasDormidas += 16;
        System.out.println("O gato, " + nome + " dormiu: " + horasDormidas + " horas hoje");
    }


    

}

