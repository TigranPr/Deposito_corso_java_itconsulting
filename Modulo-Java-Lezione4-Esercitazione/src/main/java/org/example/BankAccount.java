package org.example;
//scrivere un programma che costruisca un conto bancario chiamato
//harrysChecking, versi in esso $1000, prelevi da esso $500, prelevi altri $400 e
//infine visualizzi il saldo rimanente.
//Il programma deve poi creare un altro conto bancario chiamato momsSaving,
//utilizzando il costruttore che inizializza la variabile balance.
//Su quest’ultimo conto deve essere poi applicato un interesse del 10%, a seguito
//del quale viene stampato il saldo.
public class BankAccount {
    private double balance;// saldo del conto

    public BankAccount() {//inizializza il saldo a 0
        this.balance = 0.0;
    }

    public BankAccount(double initialBalance) {//inizializza il saldo a un valore specifico
        this.balance = initialBalance;
    }

    public void deposit(double amount) {//metodo per versare denaro
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposito negativo non consentito.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Prelievo non valido.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void applyInterest(double interestRate) {
        if (interestRate > 0) {
            balance += balance * interestRate;
        } else {
            System.out.println("Tasso di interesse non valido.");
        }
    }
    public static void main(String[] args) {
        // Creazione del conto bancario harrysChecking
        BankAccount harrysChecking = new BankAccount();
        harrysChecking.deposit(1000);// Deposito iniziale
        harrysChecking.withdraw(500);// Prelievo di $500
        harrysChecking.withdraw(400);// Prelievo di $400
        System.out.println("Saldo rimanente in harrysChecking: " + harrysChecking.getBalance());

        // Creazione del conto bancario momsSaving
        BankAccount momsSaving = new BankAccount(0);
        momsSaving.deposit(1000); // Deposito iniziale
        momsSaving.applyInterest(0.10); // Applicazione dell'interesse del 10%
        System.out.println("Saldo in momsSaving dopo l'applicazione dell'interesse: " + momsSaving.getBalance());
    }
}
