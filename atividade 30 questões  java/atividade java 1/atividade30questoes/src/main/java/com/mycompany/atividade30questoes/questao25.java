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
public class questao25 {
     public static void main(String[] args) {
         String nome;
         double produto;
         Scanner dados=new Scanner(System.in);
         do{
         System.out.println("informe o numero do produto");
         nome=dados.nextLine();
         System.out.println("digite o valor do produto");
         produto=dados.nextDouble();
         }
         while(!"sair".equals(nome));
     }
}
