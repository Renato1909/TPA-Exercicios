/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.operacoestpa.cadastrousuario;
import java.util.InputMismatchException; // Importe esta classe para tratar a exceção
import java.util.Locale; // Importe esta classe para definir a localidade
import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author RENATO SILVA
 */
public class CadastroUsuario {

    public static void main(String[] args) {

        // Define a localidade do Scanner para pt-BR para aceitar vírgula como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua data de nascimento (DD/MM/AAAA):");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite o nome do curso:");
        String curso = scanner.nextLine();

        System.out.println("Digite a série:");
        String serie = scanner.nextLine();

        double altura = 0.0; // Inicializa com um valor padrão
        boolean entradaValidaAltura = false;
        while (!entradaValidaAltura) {
            System.out.println("Digite sua altura (ex: 1,75):");
            try {
                altura = scanner.nextDouble();
                entradaValidaAltura = true; // Se chegou aqui, a entrada foi válida
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida para altura. Por favor, digite um número com vírgula ou ponto.");
                scanner.next(); // Consome a entrada inválida para evitar loop infinito
            }
        }
        scanner.nextLine(); // Consome a quebra de linha restante após nextDouble()

        double peso = 0.0; // Inicializa com um valor padrão
        boolean entradaValidaPeso = false;
        while (!entradaValidaPeso) {
            System.out.println("Digite seu peso (ex: 70,5):");
            try {
                // Ao usar nextLine() e Double.parseDouble(), já consome a linha inteira.
                // Isso é útil para tratar entradas que não são apenas números.
                peso = Double.parseDouble(scanner.nextLine().replace(',', '.')); // Substitui vírgula por ponto para o parse
                entradaValidaPeso = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida para peso. Por favor, digite um número com vírgula ou ponto.");
            }
        }
        // Não é necessário scanner.nextLine(); aqui, pois Double.parseDouble(scanner.nextLine()) já consome a linha.

        System.out.println("\n--- DADOS CADASTRADOS ---");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Curso: " + curso);
        System.out.println("Série: " + serie);
        System.out.println("Altura: " + String.format(Locale.ROOT, "%.2f", altura) + " m"); // Formata para 2 casas decimais com ponto
        System.out.println("Peso: " + String.format(Locale.ROOT, "%.2f", peso) + " kg"); // Formata para 2 casas decimais com ponto

        scanner.close(); // Sempre feche o Scanner ao final para liberar recursos
    }
}
