/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabancaria;

/**
 *
 * @author anton
 */
public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double quantia) {
        saldo += quantia;
        System.out.println("Depósito de R$" + quantia + " realizado com sucesso.");
    }

    public void sacar(double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
            System.out.println("Saque de R$" + quantia + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + quantia + ".");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}