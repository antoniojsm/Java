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
public class questao22 {
     public static void main(String[] args) {
          Scanner dados= new Scanner(System.in);
        
        int soma = 0;
        int contador = 0;
        double media;
        
        System.out.println("Digite números para calcular a média.");
        System.out.println("Digite um número negativo para encerrar.");
        
        while (true) {
            System.out.print("Digite um número: ");
            int numero = dados.nextInt();
            
            if (numero < 0) {
                break; // Encerra o loop se o número for negativo
            }
            
            soma += numero;
            contador++;
        }
        
        if (contador > 0) {
            media = (double) soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
    }
}
