package org.example.projectAccount;

/**
 * Esta clase denominada SavingsAccount modela una cuenta de ahorros
 * que es una subclase de Account. Tiene un nuevo atributo: status.
 * @version 1.2/2025
 */
public class SavingsAccount extends Account {
    
    
    // Atributo que identifica si una cuenta está activa; lo está si su saldo es superior a
    // 10000
    private boolean status;
    
    /**
     * Constructor de la clase SavingsAccount
     * @param balance Parámetro que define el saldo de la cuenta de ahorros
     * @param annualFee Parámetro que define la tasa anual de interés de la
     * cuenta de ahorros
     */
    public SavingsAccount(float balance, float annualFee) {
        super(balance, annualFee);
        status = (balance >= 10000);
    }
    
    public SavingsAccount() {
        super();
        status = false;
    }
    
    @Override
    public String toString () {
        return "SavingsAccount{" + "status=" + status + toString(true);
    }
    
    @Override
    public void withdraw(float amount) {
        // Si la cuenta está activa, se puede retirar dinero
        if (status) super.withdraw(amount); // Invoca al metodo retirar de la clase padre
    }
    
    @Override
    public void deposit(float amount) {
        // Si la cuenta está activa, se puede consignar dinero
        if (status) super.deposit(amount); // Invoca al metodo consignar de la clase padre
    }
    
    @Override
    public void monthlyStatement() {
        // Si la cantidad de retiros es superior a cuatro, se genera una comisión mensual
        if (withdrawalsNumber > 4) monthlyCommission += (withdrawalsNumber - 4) * 1000;
        
        super.monthlyStatement(); // Invoca al metodo de la clase padre
        
        // Si el saldo actualizado de la cuenta es menor a 10000, la cuenta no se activa
        status = (balance >= 10000);
    }
    
    /**
     * Metodo que muestra en pantalla los datos de una cuenta de ahorros
     */
    @Override
    public void info() {
        System.out.println("Saldo = $ " + balance + "\nComisión mensual = $ " + monthlyCommission + "\nNúmero" +
                " de transacciones = " + (appropriationsNumber + withdrawalsNumber));
    }
    
    public boolean isStatus () {
        return status;
    }
}
