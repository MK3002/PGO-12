import java.util.ArrayList;
public class User {
    private String name;
    private String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Admin> admins = new ArrayList<>();
    ArrayList<Client> clients = new ArrayList<>();
    public void addClient(Client client) {
        clients.add(client);
    }
    public void removeClient(Client client) {
        clients.remove(client);
    }
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

}
