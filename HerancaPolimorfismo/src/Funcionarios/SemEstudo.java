package Funcionarios;
public class SemEstudo extends Funcionario {
    public SemEstudo(int codigoFuncionario, String nome) {
        super(codigoFuncionario, nome);
    }
    @Override
    public String getInformacoes() {
        return "Código 5.1 - Nome: " + nome + ", Código Funcionario: " + codigoFuncionario;
    }
}