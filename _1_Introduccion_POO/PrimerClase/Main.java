package _1_Introduccion_POO.PrimerClase;

public class Main {
    public static void main(String[] args){

        BankAccount bankAccount = new BankAccount("Augusto");

        bankAccount.deposit(1000.0);
        bankAccount.deposit(1000.0);
        bankAccount.withdraw(500.0);
        bankAccount.withdraw(1600.0);
    }
}
