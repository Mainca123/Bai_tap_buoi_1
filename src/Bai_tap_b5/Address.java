package Bai_tap_b5;

import java.util.Scanner;

public class Address {
    private String commune;
    private String district;
    private String city;

    /// Constructor
    public Address() {}
    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    /// Getter Setter
    public String getCommune() {
        return commune;
    }
    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    /// Input
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter commune: ");
        this.setCommune(sc.nextLine());
        System.out.print("Enter district: ");
        this.setDistrict(sc.nextLine());
        System.out.print("Enter city: ");
        this.setCity(sc.nextLine());
    }

    /// Output
    public void display() {
        System.out.printf("%-20s%-20s%-20s", commune, district, city);
    }
}
