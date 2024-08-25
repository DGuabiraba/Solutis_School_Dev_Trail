package Funcionarios;
public class Empresa {
    private Funcionario[] funcionarios = new Funcionario[10];
    private int contador = 0;
    public void adicionarFuncionario(Funcionario funcionario) {
        if (contador < funcionarios.length) {
            funcionarios[contador++] = funcionario;
        }
    }
    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
    public void calcularCustosTotais() {
        double custoTotal = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                custoTotal += funcionario.getSalarioTotal();
            }
        }
        System.out.println("Custo Total: " + custoTotal);
    }
    public void calcularCustosPorNivelEscolaridade() {
        double custoBasico = 0, custoMedio = 0, custoSuperior = 0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Graduado) {
                custoSuperior += funcionario.getSalarioTotal();
            } else if (funcionario instanceof EnsinoMedio) {
                custoMedio += funcionario.getSalarioTotal();
            } else if (funcionario instanceof EnsinoBasico) {
                custoBasico += funcionario.getSalarioTotal();
            }
        }
        System.out.println("Custo Ensino Básico: " + custoBasico);
        System.out.println("Custo Ensino Médio: " + custoMedio);
        System.out.println("Custo Nível Superior: " + custoSuperior);
    }
    public void imprimirFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario != null) {
                System.out.println(funcionario);
            }
        }
    }
}