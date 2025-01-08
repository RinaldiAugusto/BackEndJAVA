package _2_POO.SobreCarga_vs_SobreEscritura;

public class BankAccountOverdraft extends BankAccount{
    private Double extraAmount;

    public BankAccountOverdraft(String accountOwner, Double extraAmount) {
        super(accountOwner);
        this.extraAmount = extraAmount;
    }
}
