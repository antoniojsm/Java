/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_de_juros;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class Calculadora_De_Juros {

    public static void main(String[] args) {
        double valorprincipal;
        double taxa;
        double tempo;
        double jurosSimples;
        double jurosCompostos;
        
        Scanner dados=new Scanner (System.in);
        
        System.out.println("Digite o valor principal (p):");
        valorprincipal=dados.nextDouble();
        
        System.out.println("Digite a taxa de juros em decimal (ex: 0.05 para 5%:");
        taxa=dados.nextDouble();
        
        System.out.println("Digite o tempo em anos:");
        tempo=dados.nextDouble();
        
        jurosSimples=valorprincipal*taxa*tempo;
        System.out.println("jusros simples ="+jurosSimples);
        
       
        
        
        
    }
}
