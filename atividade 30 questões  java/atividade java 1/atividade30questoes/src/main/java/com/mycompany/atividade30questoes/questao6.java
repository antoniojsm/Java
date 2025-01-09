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
public class questao6 {
    public static void main(String[] args) {
        int numero;
        
        Scanner dados=new Scanner(System.in);
        System.out.println("qual o numero:");
        numero=dados.nextInt();
        
        if(numero<0){
            System.out.println("o numero e negativo");
        }else if(numero==0){
            System.out.println("numero e igual a 0");
         }else if(numero>1){
             System.out.println("o numero e positivo");
         }
    
    }
}
