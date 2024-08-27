import java.util.*;
import java.lang.*;
import java.io.*;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario = new Operario("Carlos Souza", "Rua D, 101", "8765-4321", 303, 4000.0, 10.0, 50000.0, 5.0);

        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto() + "%");
        System.out.println("Valor da Produção: " + operario.getValorProducao());
        System.out.println("Comissão: " + operario.getComissao() + "%");
        System.out.println("Salário Líquido: " + operario.calcularSalario());
    }
}
