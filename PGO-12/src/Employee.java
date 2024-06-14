public class Employee extends User {
    protected int EmployeeID;

    public Employee(String name, String lastName, int employeeID) {
        super(name, lastName);
        EmployeeID = employeeID;
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

