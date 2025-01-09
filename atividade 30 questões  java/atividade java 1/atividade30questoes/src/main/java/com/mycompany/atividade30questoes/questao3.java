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
public class questao3 {
    public static void main (String[]args){
         int ano;
         
         Scanner dados=new Scanner(System.in);
        System.out.println("qual o ano:");
        ano=dados.nextInt();
        
        if((ano%4==0&&ano%100!=0)||(ano%400==0)){
             System.out.println("e um ano bissexto");
        }else{
            System.out.println("não e um ano bissexto");
        }
     }

}
