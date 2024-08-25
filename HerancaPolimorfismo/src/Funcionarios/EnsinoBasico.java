package Funcionarios;
public class EnsinoBasico extends Funcionario {
    protected String escolaBasico;
    public EnsinoBasico(int codigoFuncionario, String nome, String escolaBasico) {
        super(codigoFuncionario, nome);
        this.escolaBasico = escolaBasico;
        this.salarioBase *= 1.1;
    }
    @Override
    public String getInformacoes() {
        return "Código 5.2 - Nome: " + nome + ", Código Funcionario: " + codigoFuncionario + ", Escola Básico: " + escolaBasico;
    }
}