/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuada;
import java.util.Scanner;
/**
 *
 * @author RENATO SILVA
 */
public class Tabuada {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a tabuada:");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
