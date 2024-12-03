package Bai_Test_2.Cau1;

public class Address {
    private String street;
    private String city;
    // Constructor
    public Address() {}
    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    //Getter
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }

    //Setter
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
