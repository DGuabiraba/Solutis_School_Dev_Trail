package Funcionarios;
public enum Comissao {
    GERENTE(1500),
    SUPERVISOR(600),
    VENDEDOR(250);
    private double valor;
    Comissao(double valor) {
        this.valor = valor;
    }
    public double getValor() {
        return valor;
    }
}
