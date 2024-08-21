public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, int idade, String habitat, double altura, double peso, double envergaduraAsa) {
        super(nome, "Pombo", idade, habitat, altura, peso, envergaduraAsa, 2 );
        this.quantidadeComida = 0.0;
        this.horasDormidas = 0.0;
        this.distanciaPercorrida = 0.0;
    }

    @Override
    public void comer() {
        quantidadeComida += 15;
        System.out.println("O pombo, "+ nome + " comeu: " + quantidadeComida+ " g de comida hoje");
    }

    @Override
    public void moverse() {
       voar();
    }

    @Override
    public void dormir() {
        horasDormidas += 12;
        System.out.println("O pombo, "+ nome+ " dormiu: " + horasDormidas + " horas hoje");
    }

    @Override
    public void voar() {

        distanciaPercorrida += 31;
        System.out.println("O pombo, " + nome + " voou: "+ distanciaPercorrida +" km hoje");
    }

    public double getEnvergaduraAsa() {
        return envergaduraAsa ;
    }

    
    
}
