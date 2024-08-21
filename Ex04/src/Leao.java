public class Leao extends AnimaisTerrestreAB {

    public Leao(String nome, int idade, String habitat, double altura, double peso, int quantidadePatas) {
        super(nome, "Leão", idade, habitat, altura, peso, 4);


        this.quantidadeComida = 0;
        this.distanciaPercorrida = 0;
        this.horasDormidas = 0;
    }

    @Override
    public void comer() {
        quantidadeComida += 6;
        System.out.println("O leão, " + nome +" comeu: " + quantidadeComida + " kg de comida hoje");

    }

    @Override
    public void moverse() {
        distanciaPercorrida += 8;
        System.out.println("O leão, " + nome + " andou: " + distanciaPercorrida + " km hoje");
    }

    @Override
    public void dormir() {
        horasDormidas += 11;
        System.out.println("O leão, " + nome + " dormiu: " + horasDormidas + " horas hoje");
    }

   
       

}
