public class Transaction extends BankAccount {
    protected double transferValue;
    protected int accountNumber;
    protected int transferReciver;

    public Transaction(double transferValue, int accountNumber, int transferReciver) {
        this.transferValue = transferValue;
        this.accountNumber = accountNumber;
        this.transferReciver = transferReciver;
    }

    public double getTransferValue() {
        return transferValue;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getTransferReciver() {
        return transferReciver;
    }

}
