/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.operacoestpa.numerosprimos;
import java.util.Scanner; // Importa a classe Scanner

/**
 *
 * @author RENATO
 */
public class NumerosPrimos {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner

        System.out.println("--- Verificador de Número Primo ---");

        // Desafio adicional: Permitir que o usuário digite vários números
        String continuar = "s";
        while (continuar.equalsIgnoreCase("s")) { // Loop enquanto o usuário quiser continuar
            System.out.print("Digite um número inteiro positivo para verificar se é primo: ");
            int numero = scanner.nextInt(); // Lê o número

            if (numero <= 1) { // Números menores ou iguais a 1 não são primos
                System.out.println(numero + " não é um número primo.");
            } else {
                boolean ehPrimo = true; // Assume que o número é primo inicialmente
                // Loop para verificar divisibilidade de 2 até a raiz quadrada do número
                // Pois se um número tem um divisor maior que sua raiz, ele também terá um menor.
                for (int i = 2; i * i <= numero; i++) {
                    if (numero % i == 0) { // Se o resto da divisão for 0, não é primo
                        ehPrimo = false;
                        break; // Sai do loop assim que encontrar um divisor
                    }
                }

                if (ehPrimo) {
                    System.out.println(numero + " é um número primo.");
                } else {
                    System.out.println(numero + " não é um número primo.");
                }
            }

            System.out.print("Deseja verificar outro número? (s/n): ");
            scanner.nextLine(); // Consome a quebra de linha pendente após nextInt()
            continuar = scanner.nextLine(); // Lê a resposta do usuário
        }

        System.out.println("Programa encerrado. Obrigado!");
        scanner.close(); // Fecha o Scanner
    }
}
