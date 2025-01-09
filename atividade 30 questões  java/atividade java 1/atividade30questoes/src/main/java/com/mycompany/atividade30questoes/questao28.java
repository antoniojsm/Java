/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade30questoes;
import java.util.Scanner;
/**
 *
 * @author anton
 */
public class questao28 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, maiorNumero = Integer.MIN_VALUE;

        do {
            // Solicita ao usuário para digitar um número
            System.out.print("Digite um número (ou -1 para encerrar): ");
            numero = scanner.nextInt();

            // Verifica se o número digitado é maior que o maior número encontrado
            if (numero != -1 && numero > maiorNumero) {
                maiorNumero = numero;
            }

        } while (numero != -1); // O loop termina quando o usuário digitar -1

        if (maiorNumero == Integer.MIN_VALUE) {
            System.out.println("Nenhum número válido foi inserido.");
        } else {
            System.out.println("O maior número digitado foi: " + maiorNumero);
        }
    }
}
