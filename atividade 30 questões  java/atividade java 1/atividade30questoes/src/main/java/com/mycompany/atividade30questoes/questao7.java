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
public class questao7 {
    public static void main(String[] args) {
        int numero;
        Scanner dados1=new Scanner(System.in);
        System.out.println("qual o numero:");
        numero=dados1.nextInt();
         
        String dia;
        switch(numero){
            case 1:
                dia="domingo";
                break;
            case 2:
                dia="segunda-feira";
                break;
            case 3:
                dia="terça-feira";
                break;
            case 4:
                dia="quarta-feira";
                break;
            case 5:
                dia="quinta-feira";
                break;
            case 6:
                dia="sexta=feira";
                break;
            case 7:
                dia="sabado";
                break;
            default:
                dia="dia invalido";
                break; 
        }
         System.out.println("dia da semana e:"+dia);
    }
}
