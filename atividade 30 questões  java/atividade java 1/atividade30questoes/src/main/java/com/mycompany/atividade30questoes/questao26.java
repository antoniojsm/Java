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
public class questao26 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        // Variável para contar os dígitos
        int quantidadeDigitos = 0;
        
        // Se o número for 0, ele tem exatamente 1 dígito
        if (numero == 0) {
            quantidadeDigitos = 1;
        } else {
            // Faz o número ser positivo para evitar problemas com números negativos
            numero = Math.abs(numero);
            
            // Conta os dígitos do número
            while (numero > 0) {
                numero /= 10; // Remove o último dígito
                quantidadeDigitos++; // Incrementa o contador de dígitos
            }
        }
        
        // Exibe a quantidade de dígitos
        System.out.println("Quantidade de dígitos: " + quantidadeDigitos);
        
}
}

