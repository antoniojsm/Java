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
public class questao20 {
     public static void main(String[] args) {
         double numero;
         
         Scanner dados=new Scanner (System.in);
         System.out.println("informe um numero:");
         numero=dados.nextDouble();
         
         while(numero!=0){
         System.out.println("informe um numero:");
         numero=dados.nextDouble();
         }
             }
}
