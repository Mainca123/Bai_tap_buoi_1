package Bai_Test_2.Cau1;

public class Account extends Person{
    private String userName;
    private String password;
    private Role role;
    private Status status;
    //Constructor
    public Account() {
    }
    public Account(String id, String fullName, int age, Address address, String birthday, String userName, String password, Role role, Status status) {
        super(id, fullName, age, address, birthday);
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.status = status;
    }
    public Account(String userName, String password, Role role, Status status) {
        this.userName = userName;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    //Getter Setter
    public String getUserName() {
        return userName;
    }
    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return super.toString() + "Account{" +
                "userName='" + userName +
                ", role=" + role +
                ", status=" + status +
                '}';
    }
}
