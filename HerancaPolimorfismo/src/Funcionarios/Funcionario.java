package Funcionarios;
public abstract class Funcionario {
    protected int codigoFuncionario;
    protected String nome;
    protected double salarioBase = 1000.00;
    protected Comissao comissao;
    public Funcionario(int codigoFuncionario, String nome) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
    }
    public abstract String getInformacoes();
    public double getSalarioTotal() {
        return salarioBase + (comissao != null ? comissao.getValor() : 0);
    }
    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + ", Comissão: " + (comissao != null ? comissao.getValor() : 0) + ", Salário Total: " + getSalarioTotal();
    }
}