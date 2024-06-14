public class Admin extends User {
    protected int AdminID;

    public Admin(String name, String lastName, int adminID) {
        super(name, lastName);
        AdminID = adminID;
    }

    public Admin(int adminID) {
        AdminID = adminID;
    }

    public Admin(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void removeEmployee(Employee employee) {
        super.removeEmployee(employee);
    }

    @Override
    public void addEmployee(Employee employee) {
        super.addEmployee(employee);
    }

    public Admin() {
        super();
    }

    @Override
    public void addClient(Client client) {
        super.addClient(client);
    }

    @Override
    public void removeClient(Client client) {
        super.removeClient(client);
    }
}
