import java.util.*;
import java.lang.*;
import java.io.*;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador administrador = new Administrador("Ana Costa", "Rua C, 789", "1234-5678", 202, 6000.0, 12.0, 800.0);

        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto() + "%");
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());
    }
}

