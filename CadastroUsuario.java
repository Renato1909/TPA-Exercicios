/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrousuario;
import java.util.Scanner;
/**
 *
 * @author RENATO SILVA
 */

public class CadastroUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua data de nascimento (DD/MM/AAAA):");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite o nome do curso:");
        String curso = scanner.nextLine();

        System.out.println("Digite a série:");
        String serie = scanner.nextLine();

        System.out.println("Digite sua altura (ex: 1.75):");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Consome a quebra de linha

        System.out.println("Digite seu peso (ex: 70.5):");
        double peso = Double.parseDouble(scanner.nextLine());
        scanner.nextLine(); // Por segurança, embora não seja mais necessário depois

        System.out.println("\n--- DADOS CADASTRADOS ---");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
    }
}