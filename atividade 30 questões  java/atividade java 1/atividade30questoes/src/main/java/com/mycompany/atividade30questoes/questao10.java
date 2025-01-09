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
public class questao10 {
     public static void main(String[] args) {
         int numero;
         String estacao;
         
         Scanner dados=new Scanner(System.in);
         System.out.println("qual o numero:");
         numero=dados.nextInt();
         
         switch(numero){
             case 1:
                 estacao="verão";
                 break;
             case 2:
                 estacao="outono";
                 break;
             case 3:
                 estacao="inverno";
                 break;
             case 4: 
                 estacao="primavera";
                 break;
             default:
                 estacao="estaçao invalida";
                 break;
                 
          }
         System.out.println("a estação do ano escolhida foi:"+estacao);
     }
}
