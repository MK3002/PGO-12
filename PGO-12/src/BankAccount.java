import java.util.ArrayList;
public class BankAccount implements AccountOperations {
    private double accountBalance = 0;
    private ArrayList Transactions;
    private double transferAmount;

    public BankAccount(double accountBalance, ArrayList transactions, double transferAmount) {
        this.accountBalance = accountBalance;
        this.Transactions = transactions;
        this.transferAmount = transferAmount;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public ArrayList getTransactions() {
        return Transactions;
    }
    public double getTransferAmount() {
        return transferAmount;
    }

    public BankAccount() {
        super();
    }

    @Override
    public double checkBalance() {
        return accountBalance;

    }

    @Override
    public double transferFunds() {
        double newAccountBalance = accountBalance-transferAmount;
        return newAccountBalance;
    }

    @Override
    public double addfunds() {
        double newAccountBalance = accountBalance + transferAmount;
        return newAccountBalance;

    }
}
