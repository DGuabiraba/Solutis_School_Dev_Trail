public abstract class AnimalAB implements AnimalIF {

    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected double altura;
    protected double peso;
    protected double quantidadeComida;
    protected double distanciaPercorrida;
    protected double horasDormidas;

    public AnimalAB(String nome,String  tipoAnimal, int  idade, String habitat, double  altura, double  peso){
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }
    @Override
    public abstract void comer();
    @Override
    public abstract void moverse();
    @Override
    public abstract void dormir();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipoAnimal() {
        return tipoAnimal;
    }
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getQuantidadeComida() {
        return quantidadeComida;
    }
    public void setQuantidadeComida(int quantidadeComida) {
        this.quantidadeComida = quantidadeComida;
    }
    public double getdistanciaPercorrida() {
        return distanciaPercorrida;
    }
    public void setdistanciaPercorrida(int caminhoPercorrida) {
        this.distanciaPercorrida = caminhoPercorrida;
    }
    public double getHorasDormidas() {
        return horasDormidas;
    }
    public void setHorasDormidas(int horasDormidas) {
        this.horasDormidas = horasDormidas;
    }



}
