import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do Fornecedor:");
        String nomeFornecedor = scanner.nextLine();
        System.out.println("Endereço do Fornecedor:");
        String enderecoFornecedor = scanner.nextLine();
        System.out.println("Telefone do Fornecedor:");
        String telefoneFornecedor = scanner.nextLine();
        System.out.println("Valor de crédito do Fornecedor:");
        double valorCreditoFornecedor = scanner.nextDouble();
        System.out.println("Valor da dívida do Fornecedor:");
        double valorDividaFornecedor = scanner.nextDouble();
        scanner.nextLine();

        Fornecedor fornecedor = new Fornecedor(nomeFornecedor, enderecoFornecedor, telefoneFornecedor, valorCreditoFornecedor, valorDividaFornecedor);
        System.out.println("Fornecedor: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Saldo do Fornecedor: " + fornecedor.obterSaldo());

        System.out.println("\nNome do Empregado:");
        String nomeEmpregado = scanner.nextLine();
        System.out.println("Endereço do Empregado:");
        String enderecoEmpregado = scanner.nextLine();
        System.out.println("Telefone do Empregado:");
        String telefoneEmpregado = scanner.nextLine();
        System.out.println("Código do setor:");
        int codigoSetor = scanner.nextInt();
        System.out.println("Salário base:");
        double salarioBase = scanner.nextDouble();
        System.out.println("Imposto (%):");
        double imposto = scanner.nextDouble();
        scanner.nextLine();

        Empregado empregado = new Empregado(nomeEmpregado, enderecoEmpregado, telefoneEmpregado, codigoSetor, salarioBase, imposto);
        System.out.println("Empregado: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Salário do Empregado: " + empregado.calcularSalario());

        System.out.println("\nNome do Administrador:");
        String nomeAdministrador = scanner.nextLine();
        System.out.println("Endereço do Administrador:");
        String enderecoAdministrador = scanner.nextLine();
        System.out.println("Telefone do Administrador:");
        String telefoneAdministrador = scanner.nextLine();
        System.out.println("Código do setor:");
        int codigoSetorAdm = scanner.nextInt();
        System.out.println("Salário base:");
        double salarioBaseAdm = scanner.nextDouble();
        System.out.println("Imposto (%):");
        double impostoAdm = scanner.nextDouble();
        System.out.println("Valor da ajuda de custo:");
        double ajudaDeCusto = scanner.nextDouble();
        scanner.nextLine();

        Administrador administrador = new Administrador(nomeAdministrador, enderecoAdministrador, telefoneAdministrador, codigoSetorAdm, salarioBaseAdm, impostoAdm, ajudaDeCusto);
        System.out.println("Administrador: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Salário do Administrador: " + administrador.calcularSalario());

        System.out.println("\nNome do Operário:");
        String nomeOperario = scanner.nextLine();
        System.out.println("Endereço do Operário:");
        String enderecoOperario = scanner.nextLine();
        System.out.println("Telefone do Operário:");
        String telefoneOperario = scanner.nextLine();
        System.out.println("Código do setor:");
        int codigoSetorOperario = scanner.nextInt();
        System.out.println("Salário base:");
        double salarioBaseOperario = scanner.nextDouble();
        System.out.println("Imposto (%):");
        double impostoOperario = scanner.nextDouble();
        System.out.println("Valor da produção:");
        double valorProducao = scanner.nextDouble();
        System.out.println("Comissão (%):");
        double comissaoOperario = scanner.nextDouble();
        scanner.nextLine();

        Operario operario = new Operario(nomeOperario, enderecoOperario, telefoneOperario, codigoSetorOperario, salarioBaseOperario, impostoOperario, valorProducao, comissaoOperario);
        System.out.println("Operário: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Salário do Operário: " + operario.calcularSalario());

        System.out.println("\nNome do Vendedor:");
        String nomeVendedor = scanner.nextLine();
        System.out.println("Endereço do Vendedor:");
        String enderecoVendedor = scanner.nextLine();
        System.out.println("Telefone do Vendedor:");
        String telefoneVendedor = scanner.nextLine();
        System.out.println("Código do setor:");
        int codigoSetorVendedor = scanner.nextInt();
        System.out.println("Salário base:");
        double salarioBaseVendedor = scanner.nextDouble();
        System.out.println("Imposto (%):");
        double impostoVendedor = scanner.nextDouble();
        System.out.println("Valor das vendas:");
        double valorVendas = scanner.nextDouble();
        System.out.println("Comissão (%):");
        double comissaoVendedor = scanner.nextDouble();

        Vendedor vendedor = new Vendedor(nomeVendedor, enderecoVendedor, telefoneVendedor, codigoSetorVendedor, salarioBaseVendedor, impostoVendedor, valorVendas, comissaoVendedor);
        System.out.println("Vendedor: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());

        scanner.close();
    }
}
