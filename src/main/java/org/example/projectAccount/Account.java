package org.example.projectAccount;

/**
 * Esta clase denominada Account modela una cuenta bancaria con los
 * atributos balance, appropriationsNumber, withdrawalsNumber, annualFee y monthlyCommission.
 * @version 1.2/2025
 */
public abstract class Account {
    
    
    /* Atributo que define el sueldo de una cuenta bancaria protected float saldo; */
    protected float balance;
    
    /* Atributo que define el número de consignaciones realizadas en una cuenta bancaria */
    protected int appropriationsNumber = 0;
    
    // Atributo que define el número de retiros de una cuenta bancaria
    protected int withdrawalsNumber = 0;
    
    // Atributo que define la tasa anual de intereses de una cuenta bancaria
    protected float annualFee;
    
    /* Atributo que define la comisión mensual que se cobra a las cuentas bancarias */
    protected float monthlyCommission = 0;
    
    /**
     * Constructor de la clase Account
     * @param balance Parámetro que define el saldo de la cuenta
     * @param annualFee Parámetro que define la tasa anual de interés de
     * la cuenta
     */
    public Account(float balance, float annualFee) {
        this.balance = balance;
        this.annualFee = annualFee;
    }
    
    public Account() {
        this(0.0f, 0.0f);
    }
    
    
    /**
     * Metodo que recibe una cantidad de dinero a consignar y actualiza
     * el saldo de la cuenta
     * @param balance Parámetro que define la cantidad de dinero a
     * consignar en la cuenta
     */
    public void deposit(float amount) {
        balance += amount; // Se actualiza el saldo con la cantidad consignada
        // Se actualiza el número de consignaciones realizadas en la cuenta
        appropriationsNumber += 1;
    }
    
    /**
     * Metodo que recibe una cantidad de dinero a retirar y actualiza el saldo de la cuenta
     * @param balance Parámetro que define la cantidad de dinero a retirar de la cuenta
     */
    public void withdraw(float amount) {
        if (balance >= amount) {
            withdrawalsNumber += 1;
            balance -= amount;
        } else System.out.println("Saldo insuficiente");
    }
    
    /**
     * Metodo que calcula interés mensual de la cuenta a partir de la tasa anual aplicada
     */
    public void commission() {
        balance += balance * (annualFee / 12); // Actualiza el saldo aplicando el interés mensual
    }
    
    /**
     * Metodo que genera un extracto aplicando al saldo actual
     * una comisión y calculando sus intereses
     */
    public void monthlyStatement() {
        balance -= monthlyCommission;
        commission();
    }
    
    @Override
    public String toString () {
        return "Account{" + "balance=" + balance + ", appropriationsNumber=" + appropriationsNumber + ", withdrawalsNumber=" + withdrawalsNumber + ", annualFee=" + annualFee + ", monthlyCommission=" + monthlyCommission + '}';
    }
    
    public String toString(boolean add) {
        return (add) ? ", balance=" + balance + ", appropriationsNumber=" + appropriationsNumber +
                ", withdrawalsNumber=" + withdrawalsNumber + ", annualFee=" + annualFee + ", " +
                "monthlyCommission=" + monthlyCommission + '}' : toString();
    }
    
    /**
     * Metodo que muestra en pantalla los datos de una cuenta
     */
    public abstract void info();
    
    public float getBalance () {
        return balance;
    }
    
    public void setBalance (float balance) {
        this.balance = balance;
    }
    
    public int getAppropriationsNumber () {
        return appropriationsNumber;
    }
    
    public void setAppropriationsNumber (int appropriationsNumber) {
        this.appropriationsNumber = appropriationsNumber;
    }
    
    public int getWithdrawalsNumber () {
        return withdrawalsNumber;
    }
    
    public void setWithdrawalsNumber (int withdrawalsNumber) {
        this.withdrawalsNumber = withdrawalsNumber;
    }
    
    public float getAnnualFee () {
        return annualFee;
    }
    
    public void setAnnualFee (float annualFee) {
        this.annualFee = annualFee;
    }
    
    public float getMonthlyCommission () {
        return monthlyCommission;
    }
    
    public void setMonthlyCommission (float monthlyCommission) {
        this.monthlyCommission = monthlyCommission;
    }
}
