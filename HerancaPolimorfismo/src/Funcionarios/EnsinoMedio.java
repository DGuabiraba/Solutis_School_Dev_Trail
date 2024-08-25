package Funcionarios;
public class EnsinoMedio extends EnsinoBasico {
    protected String escolaMedio;
    public EnsinoMedio(int codigoFuncionario, String nome, String escolaBasico, String escolaMedio) {
        super(codigoFuncionario, nome, escolaBasico);
        this.escolaMedio = escolaMedio;
        this.salarioBase *= 1.5  ;
    }
    @Override
    public String getInformacoes() {
        return "Código 5.3 - Nome: " + nome + ", Código Funcionario: " + codigoFuncionario + ", Escola Básico: " + escolaBasico + ", Escola Médio: " + escolaMedio;
    }
}