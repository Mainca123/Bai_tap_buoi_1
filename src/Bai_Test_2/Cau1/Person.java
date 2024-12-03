package Bai_Test_2.Cau1;

public class Person {
    protected String id;
    protected String fullName;
    protected  int age;
    protected Address address;
    protected String birthday;

    //Constructor
    public Person() {
    }
    public Person(String id, String fullName, int age, Address address, String birthday) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.birthday = birthday;
    }

    //Getter Setter
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

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}

