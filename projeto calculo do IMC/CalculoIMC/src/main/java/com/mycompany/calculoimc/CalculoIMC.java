/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculoimc;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class CalculoIMC {

    public static void main(String[] args) {
        double altura;
        double peso;
        double IMC;
        
       Scanner dados = new Scanner(System.in);
        System.out.println("informe seu peso:");
        peso=dados.nextDouble();
        
        System.out.println("qual sua altura");
        altura=dados.nextDouble();
        
        IMC=peso/(altura*altura);
        
        if(IMC<18.5){
             System.out.println("baixo peso!!");
             System.out.println("o IMC é "+IMC);
          }else if(IMC>=18.5 && IMC <=24.9){
            System.out.println("peso ideal!!");
            System.out.println("o IMC é "+IMC);
          }else if(IMC>=25 && IMC<=29.9){
              System.out.println("sobrepeso!!");
              System.out.println("o IMC é "+IMC);
          }else if(IMC>=30 && IMC<=34.9){
              System.out.println("obesidade classe 1!!");
              System.out.println("o IMC é "+IMC);
          }else if(IMC >=35 && IMC<=39.9){
              System.out.println("obesidade classe 2!!");
              System.out.println("o IMC é "+IMC);
          }else if(IMC > 40){
              System.out.println("obesidade classe 3!!");
              System.out.println("o IMC é "+IMC);
          }
        
        }
}
