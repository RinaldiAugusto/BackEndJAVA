package _1_Introduccion_POO.PrimerClase;

public class BankAccount {
    private String accountOwner;
    private Double balance;

    public BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;
        this.balance = 0.0;
    }

    public void deposit(Double amount){
        this.balance += amount;
        System.out.println("|Se deposito: $" + amount);
        System.out.println("Balance: $" + balance);
    }

    public void withdraw(Double amount){
        if (balance >= amount){
            this.balance -= amount;
            System.out.println("|Se retiro: $" + amount);
            System.out.println("Balance: " + balance);
        }else {
            System.out.println("No hay suficiente dinero para retirar.");
        }
    }
}
