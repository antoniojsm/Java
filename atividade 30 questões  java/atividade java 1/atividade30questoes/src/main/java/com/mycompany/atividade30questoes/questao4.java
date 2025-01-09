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
public class questao4 {
    public static void main(String[] args) {
    int idade;
    
    Scanner dados1=new Scanner(System.in);
    System.out.println("qual a primeira nota:");
    idade=dados1.nextInt();
    
    if(idade>18){
        System.out.println("e maior de idade");
        
    }else{
        System.out.println("e menor de idade");
        }
}
    }