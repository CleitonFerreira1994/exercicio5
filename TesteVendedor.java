import java.util.*;
import java.lang.*;
import java.io.*;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("João Pereira", "Rua E, 202", "3456-7890", 404, 4500.0, 8.0, 30000.0, 7.0);

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto() + "%");
        System.out.println("Valor das Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão: " + vendedor.getComissao() + "%");
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
    }
}
