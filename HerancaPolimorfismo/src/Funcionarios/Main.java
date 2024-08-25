package Funcionarios;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa();
        String[] escolaridade = {"Ensino Básico", "Ensino Médio", "Graduação"};
        int[] distribuicao = {7, 2, 1};
        int contador = 0;
        for (int i = 0; i < distribuicao.length; i++) {
            for (int j = 0; j < distribuicao[i]; j++) {
                System.out.print("Informe o nome do Funcionário " + (contador + 1) + " com " + escolaridade[i] + ": ");
                String nome = scanner.nextLine();
                switch (i) {
                    case 0:
                        empresa.adicionarFuncionario(new EnsinoBasico(
                                contador + 1, nome, "Escola Básica " + (contador + 1)
                        ));
                        break;
                    case 1:
                        empresa.adicionarFuncionario(new EnsinoMedio(
                                contador + 1, nome, "Escola Básica " + (contador + 1), "Escola Média " + (contador + 1)
                        ));
                        break;
                    case 2:
                        empresa.adicionarFuncionario(new Graduado(
                                contador + 1, nome, "Escola Básica " + (contador + 1), "Escola Média " + (contador + 1), "Universidade " + (contador + 1)
                        ));
                        break;
                }
                contador++;
            }
        }
        int numGerentes = 1;
        int numSupervisores = 2;
        int numVendedores = 7;
        int gerentes = 0;
        int supervisores = 0;
        int vendedores = 0;
        for (Funcionario funcionario : empresa.getFuncionarios()) {
            if (funcionario != null) {
                if (funcionario instanceof Graduado && gerentes < numGerentes) {
                    funcionario.setComissao(Comissao.GERENTE);
                    gerentes++;
                } else if (funcionario instanceof EnsinoMedio && supervisores < numSupervisores) {
                    funcionario.setComissao(Comissao.SUPERVISOR);
                    supervisores++;
                } else if (funcionario instanceof EnsinoBasico && vendedores < numVendedores) {
                    funcionario.setComissao(Comissao.VENDEDOR);
                    vendedores++;
                }
            }
        }
        empresa.imprimirFuncionarios();
        empresa.calcularCustosTotais();
        empresa.calcularCustosPorNivelEscolaridade();
    }
}
