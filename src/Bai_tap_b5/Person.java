package Bai_tap_b5;

import java.util.Scanner;

public class Person {
    protected String name;
    protected int age;
    Address address;

    /// Constructor
    public Person() {}
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /// Getter Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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

    /// Input
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student name : " );
        this.setName(sc.nextLine());
        System.out.print("Enter Student Age : " );
        this.setAge(sc.nextInt());
        System.out.println("Address is ");
        address = new Address();
        address.input();
        this.setAddress(address);
    }

    /// Output
    public void output() {
        System.out.printf("%-20s%-20s",name,age);
        address.display();
    }
}
