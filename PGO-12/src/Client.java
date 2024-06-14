public class Client extends User implements AccountOperations {
 protected int accountNumber;
 protected int clientID;

    public Client(String name, String lastName, int accountNumber, int clientID) {
        super(name, lastName);
        this.accountNumber = accountNumber;
        this.clientID = clientID;
    }

    @Override
    public double checkBalance() {
        return 0;
    }

    @Override
    public double transferFunds() {
        return 0;
    }

    @Override
    public double addfunds() {
        return 0;
    }
}
