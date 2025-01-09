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
public class questao8 {
    public static void main(String[] args) {
        int numerodomes;
        String mes;
        Scanner dados=new Scanner(System.in);
        System.out.println("qual o numero do mes:");
        numerodomes=dados.nextInt();
        
        switch(numerodomes){
            case 1:
                mes="janeiro";
                break;
            case 2:
                mes="fevereiro";
                break;
            case 3:
                mes="março";
                break;
            case 4:
                mes="abril";
                break;
            case 5:
                mes="maio";
                break;
            case 6:
                mes="junho";
                break;
            case 7: 
                mes="julho";
                break;
            case 8:
                mes="agosto";
                 break;
            case 9:
                mes="setembro";
                 break;
            case 10:
                mes="outubro";
                break;
            case 11:
                mes="novembro";
                break;
            case 12:
                mes="dezembro";
                break;
            default:
                mes="mes invalido";
                break;          
        }
        System.out.println("o mes do ano correspondente a o numero e:"+mes);
    }
}
