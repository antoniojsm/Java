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
public class questao9 {
     public static void main(String[] args) {
         int nota;
         String resultado;
         
         Scanner dados = new Scanner (System.in);
         System.out.println("qual a nota de 0 a 10:");
         nota=dados.nextInt();
         
         switch (nota) {
            case 10:
            case 9:
                resultado = "A";
                break;
            case 8:
            case 7:
                resultado = "B";
                break;
            case 6:
            case 5:
                resultado = "C";
                break;
            case 4:
            case 3:
                resultado = "D";
                break;
            case 2:
            case 1:
            case 0:
                resultado = "E";
                break;
            default:
                resultado=("Nota inválida.");
                break;
         }
         System.out.println("o resultado e:"+resultado);
     }
}
