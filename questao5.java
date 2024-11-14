/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade30questoes;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class questao5 {

    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        Scanner dados1=new Scanner(System.in);
        System.out.println("qual a primeira nota:");
        nota1=dados1.nextInt();
        
        Scanner dados2=new Scanner(System.in);
        System.out.println("qual a segunda nota:");
        nota2=dados2.nextInt();
        
        Scanner dados3=new Scanner(System.in);
        System.out.println("qual a terceira nota:");
        nota3=dados3.nextInt();
        
        media=nota1+nota2+nota3/3;
        
        if(media>=6){
            System.out.println("você esta aprovado!");
        }else if(media<6){
            System.out.println("você foi reprovado!");
        }else{
            System.out.println("você esta em recuperação");
        }
        
        
    }
}
