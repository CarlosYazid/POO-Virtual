package org.example.projectAccount;

import java.util.Scanner;

// Herencia

/**
 * Esta clase prueba diferentes acciones realizadas por cuentas bancarias
 * de tipo Cuenta de ahorros y Cuenta corriente
 * @version 1.2/2025
 */
public class TestAccount {
    
    /**
     * Metodo main que crea una cuenta de ahorros con un saldo inicial
     * y una tasa de interés solicitados por teclado, a la cual se realiza una
     * consignación y un retiro, y luego se le genera el extracto mensual
     */
    
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Cuenta de ahorros\nIngrese saldo inicial = $");
        float initialBalance = input.nextFloat();
        
        System.out.print("Ingrese tasa de interés = ");
        float initialAnnualFee = input.nextFloat();
        
        Account account = new SavingsAccount(initialBalance, initialAnnualFee);
        
        System.out.print("Ingresar cantidad a consignar: $");
        float deposit = input.nextFloat();
        account.deposit(deposit);
        
        
        System.out.print("Ingresar cantidad a retirar: $");
        float withdraw = input.nextFloat();
        account.withdraw(withdraw);
        
        account.monthlyStatement();
        account.info();
        
    }
}
