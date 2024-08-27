import java.util.*;
import java.lang.*;
import java.io.*;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado = new Empregado("Maria Silva", "Avenida B, 456", "9876-5432", 101, 5000.0, 15.0);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto() + "%");
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
    }
}


