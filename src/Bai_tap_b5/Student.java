package Bai_tap_b5;

import java.util.Scanner;

public class Student extends Person{
    private int id;
    private String nameClass;
    private float gpa;
    private final float criteria = 2;

    /// Constructor
    public Student(){}
    public Student(int id, String nameClass, float gpa) {
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }
    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    /// Getter Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getNameClass() {
        return nameClass;
    }
    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getCriteria() {
        return criteria;
    }

    /// Input
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        this.setId(sc.nextInt());
        super.input();
        System.out.print("Enter name class: ");
        this.setNameClass(sc.next());
        System.out.print("Enter gpa: ");
        this.setGpa(sc.nextFloat());
        System.out.println();
    }

    /// Output
    public void output() {
        System.out.printf("%-20s", id);
        super.output();
        System.out.printf("%-20s%-20s\n", nameClass, gpa);
    }

    /// checkFall
    public boolean checkFall() {
        return gpa < criteria;
    }
}
