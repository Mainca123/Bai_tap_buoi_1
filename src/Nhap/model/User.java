package Nhap.model;

public class User {
    private String id;
    private String fullName;
    private String userName;
    private String password;
    private Role role;

    /// Constructor
    public User() {
    }

    public User(String id, String fullName, String userName, String password, Role role) {
        this.id = id;
        this.fullName = fullName;
        this.password = password;
        this.role = role;
        this.userName = userName;
    }

    /// Getter Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", role=" + role +
                '}';
    }
}
