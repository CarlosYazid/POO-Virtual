package org.example.projectAccount;

/**
 * Esta clase denominada CheckingAccount modela una cuenta corriente bancaria
 * que es una subclase de Account. Tiene un nuevo atributo: overdraft.
 * @version 1.2/2025
 */
public class CheckingAccount extends Account {
    
    // Atributo que define un sobregiro de la cuenta que surge cuando el saldo de la cuenta es
    // negativo
    private float overdraft = 0; // Inicialmente no hay sobregiro
    
    /**
     * Constructor de la clase CheckingAccount
     * @param balance Parámetro que define el saldo de la cuenta corriente
     * @param annualFee Parámetro que define la tasa anual de interés de la
     * cuenta corriente
     */
    public CheckingAccount(float balance, float annualFee) {
        super(balance, annualFee); // Invoca al constructor de la clase padre
    }
    
    public CheckingAccount() {
        super();
    }
    
    /**
     * Metodo que recibe una cantidad de dinero a retirar y actualiza el saldo de la cuenta
     * @param amount Parámetro que define la cantidad de dinero a
     * retirar de la cuenta corriente
     */
    @Override
    public void withdraw(float amount) {
        
        if (balance < amount) {
            
            /* Si el valor a retirar supera el saldo de la cuenta, el valor excedente se
            convierte en sobregiro y el saldo es cero */
            
            overdraft += (amount - balance);
            balance = 0;
            
        } else super.withdraw(amount); // Si no hay sobregiro, se realiza un retiro normal
        
    }
    
    /**
     * Metodo que recibe una cantidad de dinero a consignar y actualiza
     * el saldo de la cuenta
     * @param amount Parámetro que define la cantidad de dinero a
     * consignar en la cuenta corriente
     */
    @Override
    public void deposit(float amount) {
        
        // Si existe sobregiro la cantidad consignada se resta al sobregiro
        if (overdraft > 0) {
            overdraft -= amount;
            
            if (overdraft < 0) {
                balance = -overdraft;
                overdraft = 0;
            }
        } else super.deposit(amount);

    }
    
    /**
     * Metodo que muestra en pantalla los datos de una cuenta corriente
     */
    @Override
    public void info () {
        System.out.println("Saldo = $ " + balance +
                "\nCargo mensual = $ " + monthlyCommission +
                "\nNúmero de transacciones = " + (appropriationsNumber + withdrawalsNumber) +
                "\nValor de sobregiro = $" + overdraft);
    
    }
}
