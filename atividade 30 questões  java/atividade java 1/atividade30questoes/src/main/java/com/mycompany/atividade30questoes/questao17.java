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
public class questao17 {
    public static void main(String[] args){
        int numero;
        int fatorial=1;
        
        Scanner dados = new Scanner(System.in);
        System.out.println("qual o numero para calcular o fatorial");
        numero=dados.nextInt();
        
        while(numero>0){
            fatorial*=numero;
            numero--;
        }
        System.out.println("o fatorial e:"+fatorial);
        
    }
}
