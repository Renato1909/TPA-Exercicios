/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.operacoestpa.temperatura;
 import java.util.Scanner; // Importa a classe Scanner
/**
 *
 * @author RENATO
 */
public class Temperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner

        System.out.println("--- Conversor de Temperaturas ---");
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble(); // Lê a temperatura em Celsius

        // Fórmula para Celsius para Fahrenheit: F = C * 1.8 + 32
        double fahrenheit = (celsius * 1.8) + 32;

        // Fórmula para Celsius para Kelvin: K = C + 273.15
        double kelvin = celsius + 273.15;

        System.out.println("Temperatura em Fahrenheit: " + String.format("%.2f", fahrenheit) + " °F"); // Formata para 2 casas decimais
        System.out.println("Temperatura em Kelvin: " + String.format("%.2f", kelvin) + " K"); // Formata para 2 casas decimais

        scanner.close(); // Fecha o Scanner
    }
}

