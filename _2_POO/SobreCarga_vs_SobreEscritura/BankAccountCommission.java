package _2_POO.SobreCarga_vs_SobreEscritura;

public class BankAccountCommission extends BankAccount{
    private Double commission;

    public BankAccountCommission(String accountOwner, Double commission) {
        super(accountOwner);
        this.commission = commission;
    }

    @Override
    public void withdraw(Double amount) {
        Double realWithdraw = amount + (amount*commission);
        super.withdraw(realWithdraw);
    }

    public void deposit(Check check) {
        super.deposit(check.getAmount());
    }
}
