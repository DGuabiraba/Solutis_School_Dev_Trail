

public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Danilo", "R.Nova Aliança","(81)997812165",15000.0,500.0);

        System.out.println(" Fornecedor(a) ");
        System.out.println("--------------------");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Crédito:" + fornecedor.getValorCredito());
        System.out.println("Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
        System.out.println("--------------------");
        System.out.println();

        Empregado empregado = new Empregado("João", "R.Leal de Barros ","(81)997968525",010,1500.0,10.0);

        System.out.println(" Empregado(a) " );
        System.out.println("--------------------");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " +empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Impostos: " + empregado.getImposto()+ "%");
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
        System.out.println("--------------------");
        System.out.println();

        Administrador administrador = new Administrador("Helena", "R.Pereira Passos","(81)997056165",011,3500.0,15.0,1000.0);

        System.out.println(" Administrador(a) ");
        System.out.println("--------------------");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor:" + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Impostos: " + administrador.getImposto()+ "%");
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());
        System.out.println("--------------------");
        System.out.println();

        Operario operario = new Operario("Danilo", "Rua Araripina","(81)997981236",012,2500,6.0,11000.0,6);

        System.out.println(" Operário(a) ");
        System.out.println("--------------------");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do setor:" + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto()+ "%");
        System.out.println("Valor Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao());
        System.out.println("Salário Líquido: " + operario.calcularSalario());
        System.out.println("--------------------");
        System.out.println();

        Vendedor vendedor = new Vendedor("Alice", "Rua do Brum","(81)996542565",013,3500,9.0,11000,6);

        System.out.println(" Vendedor(a) ");
        System.out.println("--------------------");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do setor:" + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto()+ "%");
        System.out.println("Valor Venda: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao());
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
        System.out.println("--------------------");
       
    }
}
