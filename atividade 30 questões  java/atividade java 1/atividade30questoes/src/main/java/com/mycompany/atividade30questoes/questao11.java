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
public class questao11 {
     public static void main(String[] args) {
         String letra;
         String verificador;
         
         Scanner dados=new Scanner(System.in);
         System.out.println("qual a letra:");
         letra=dados.nextLine();
         
         switch(letra){
             case "a":
               verificador="vogal";
               break;
             case "e":
                 verificador="vogal";
                 break;
             case "i":
                 verificador="vogal";
                 break;
             case "o":
                 verificador="vogal";
                 break;
             case "u":
                 verificador="vogal";
                 break;
             default:
                     verificador="consoante";
                     break;
                     
                }
         System.out.println("a letra informada e uma: "+verificador);
     }
}
