package Funcionarios;
public class Graduado extends EnsinoMedio {
    private String universidade;
    public Graduado(int codigoFuncionario, String nome, String escolaBasico, String escolaMedio, String universidade) {
        super(codigoFuncionario, nome, escolaBasico, escolaMedio);
        this.universidade = universidade;
        this.salarioBase *= 2.0;
    }
    @Override
    public String getInformacoes() {
        return "Código 5.4 - Nome: " + nome + ", Código Funcionario: " + codigoFuncionario + ", Escola Básico: " + escolaBasico + ", Escola Médio: " + escolaMedio + ", Universidade: " + universidade;
    }
}