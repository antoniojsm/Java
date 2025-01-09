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
public class questao2 {
     public static void main (String[]args){
        int numero1;
        int numero2;
        int numero3;
        
        Scanner dados=new Scanner(System.in);
        System.out.println("qual o numero 1:");
        numero1=dados.nextInt();
        
        Scanner dados2=new Scanner(System.in);
        System.out.println("qual o numero 2:");
        numero2=dados2.nextInt();
        
        Scanner dados3=new Scanner(System.in);
        System.out.println("qual o numero 3:");
        numero3=dados3.nextInt();
        
        if(numero1>numero2&&numero1>numero3){
            System.out.println("o maior numero e:"+ numero1);
        }
        else if(numero2>numero1&&numero2>numero3){
            System.out.println("o meior numero e"+ numero2); 
        }
        else if(numero3>numero1&&numero3>numero2){
            System.out.println("o maior numero e:"+ numero3);
        }
        
    }

}
