public class MainAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Lina", "Cachorro", 12, "Urbano", 1, 16.30, 4);
        Elefante elefante = new Elefante("Tantor", "Elefante", 30, "savana", 2.8, 4.000, 4);
        Gato gato = new Gato("Lily", "gato", 7, "casa", 0.30, 10, 4);
        Leao leao = new Leao("Mufasa", 15, "savana", 1.2, 190, 4);
        Peixe peixe = new Peixe("Jinbe", "peixe", 3, "oceano", 1, 13);
        Pombo pombo = new Pombo("Chip", 3, "Urbano", 0.3, 1, 64);

        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade()+ " Anos");
        System.out.println("Habitat: " + cachorro.getHabitat());
        System.out.println("Altura: " + cachorro.getAltura()+ " m");
        System.out.println("Peso: " + cachorro.getPeso()+ " kg");

        cachorro.comer();
        cachorro.moverse();
        cachorro.dormir();

        System.out.println("-----------------------------");

        System.out.println("Nome: " + gato.getNome());
        System.out.println("Idade: " + gato.getIdade()+ " anos");
        System.out.println("Habitat: " + gato.getHabitat());
        System.out.println("Altura: " + gato.getAltura()+ " m");
        System.out.println("Peso: " + gato.getPeso()+ " kg");

        gato.comer();
        gato.moverse();
        gato.dormir();

        System.out.println("-----------------------------");

        System.out.println("Nome: " + elefante.getNome());
        System.out.println("Idade: " + elefante.getIdade()+ " anos");
        System.out.println("Habitat: " + elefante.getHabitat());
        System.out.println("Altura: " + elefante.getAltura()+ " m");
        System.out.println("Peso: " + elefante.getPeso()+ " kg");

        elefante.comer();
        elefante.moverse();
        elefante.dormir();

        System.out.println("-----------------------------");

        System.out.println("Nome: " + leao.getNome());
        System.out.println("Idade: " + leao.getIdade()+ " anos");
        System.out.println("Habitat: " + leao.getHabitat());
        System.out.println("Altura: " + leao.getAltura()+ " m");
        System.out.println("Peso: " + leao.getPeso());

        leao.comer();
        leao.moverse();
        leao.dormir();

        System.out.println("-----------------------------");

        System.out.println("Nome: " + peixe.getNome());
        System.out.println("Idade: " + peixe.getIdade()+ " anos");
        System.out.println("Habitat: " + peixe.getHabitat());
        System.out.println("Altura: " + peixe.getAltura()+ " m");
        System.out.println("Peso: " + peixe.getPeso()+ " kg");

        peixe.comer();
        peixe.moverse();
        peixe.dormir();
        

        System.out.println("-----------------------------");

        System.out.println("Nome: " + pombo.getNome());
        System.out.println("Idade: " + pombo.getIdade()+ " anos");
        System.out.println("Habitat: " + pombo.getHabitat());
        System.out.println("Altura: " + pombo.getAltura()+ " m");
        System.out.println("Peso: " + pombo.getPeso()+ " kg");
        System.out.println("Envergadura das Asas: " + pombo.getEnvergaduraAsa());
        
        pombo.comer();
        pombo.moverse();
        pombo.dormir();
       

    }
}
