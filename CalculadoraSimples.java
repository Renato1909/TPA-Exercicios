/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.operacoestpa.calculadorasimples;

import java.util.Scanner;   // Importa a classe Scanner para leitura de entrada do usuário

/**
 *
 * @author RENATO
 */
public class CalculadoraSimples {

    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in) // Cria um objeto Scanner
        ) {
            System.out.println("--- Calculadora Simples ---");
            System.out.println("Escolha a operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.print("Digite o número da operação desejada: ");
            int operacao = scanner.nextInt(); // Lê a escolha da operação
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble(); // Lê o primeiro número (pode ser decimal)
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble(); // Lê o segundo número (pode ser decimal)
            double resultado = 0; // Variável para armazenar o resultado
            switch (operacao) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado da Soma: " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado da Subtração: " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado da Multiplicação: " + resultado);
                    break;
                case 4:
                    if (num2 != 0) { // Verifica se o segundo número não é zero para evitar divisão por zero
                        resultado = num1 / num2;
                        System.out.println("Resultado da Divisão: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                    }
                    break;
                default:
                    System.out.println("Operação inválida. Por favor, escolha um número entre 1 e 4.");
                    break;
            }
            // Fecha o Scanner para liberar recursos
        }
    }
}
