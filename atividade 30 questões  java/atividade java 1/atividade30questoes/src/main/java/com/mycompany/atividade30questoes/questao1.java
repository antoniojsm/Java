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
public class questao1 {
     public static void main(String[] args) {
      int numero;
      Scanner dados = new Scanner (System.in);
        System.out.println("qual o numero");
        numero=dados.nextInt();
        
        if(numero%2==0){
            System.out.println("e par");
        }else{
            System.out.println("e impar");
        }
      
    }
}
