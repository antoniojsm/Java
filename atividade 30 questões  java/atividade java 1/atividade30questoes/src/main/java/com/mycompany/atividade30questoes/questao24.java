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
public class questao24 {
     public static void main(String[] args) {
         int numero,zeros=0, menores=0, maiores=0;
         
         Scanner system = new Scanner(System.in);
         System.out.println("digite 10 para parar o conjunto!!");
         do{
         System.out.println("quais os numeros");
         numero=system.nextInt(); 
         if(numero<0){
             menores++;
         }
         if(numero>1){
             maiores++;
         }
         if(numero==0){
             zeros++;
         }
         }
         while(numero!=10);
     }
}
