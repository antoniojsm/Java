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
public class questao21 {
    public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) { // Continua até que o usuário escolha sair (opção 4)
            System.out.println("===== MENU DE OPÇÕES =====");
            System.out.println("1. Opção 1");
            System.out.println("2. Opção 2");
            System.out.println("3. Opção 3");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Opção 1.");
                    // Ação para a Opção 1
                    break;
                case 2:
                    System.out.println("Você escolheu a Opção 2.");
                    // Ação para a Opção 2
                    break;
                case 3:
                    System.out.println("Você escolheu a Opção 3.");
                    // Ação para a Opção 3
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
            }  
    }
}
}
