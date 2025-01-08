package _2_POO.SobreCarga_vs_SobreEscritura;

public abstract class BankAccount {
    private String accountOwner;
    protected Double balance;

    public BankAccount(String accountOwner) {
        this.accountOwner = accountOwner;
        this.balance = 0.0;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount){
        if (balance >= amount){
            balance -= amount;
        }
    }
}
