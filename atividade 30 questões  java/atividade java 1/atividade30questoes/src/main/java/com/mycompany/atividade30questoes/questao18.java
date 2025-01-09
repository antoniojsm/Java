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
public class questao18 {
    public static void main(String[] args) {
        int numero;
        int soma=0;
       
        Scanner dados=new Scanner(System.in);
        System.out.println("qual o numero:");
        numero=dados.nextInt();
       
        while(soma<100){
        System.out.println("qual o numero:");
        soma=dados.nextInt();
        soma+=numero;
        System.out.println("Soma atual: " + soma);
        }
         System.out.println("A soma dos números excedeu 100.");
    }
}
