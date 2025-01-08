package _2_POO.SobreCarga_vs_SobreEscritura;

public class Main {
    public static void main(String[] args) {
        BankAccountCommission bankAccountCommission = new BankAccountCommission("Augusto", 0.01);
        BankAccountOverdraft bankAccountOverdraft = new BankAccountOverdraft("Augusto", 1000.0);

        bankAccountOverdraft.deposit(700.0);
        bankAccountCommission.deposit(700.0);

        bankAccountOverdraft.withdraw(1200.0);
        bankAccountCommission.withdraw(100.0);
    }
}
