package Bai_tap_b3;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static int n;
    public static Student[] students;

    static void readStudent() {
        System.out.print("Enter number of students: ");
        n = sc.nextInt();
        students = new Student[n+1];
        for (int i = 1; i <= n; i++) {
            students[i] = new Student();
            System.out.println("Enter information for Student[" + i +  "]:");
            System.out.print("ID: ");
            String id = sc.next();
            sc.nextLine();
            System.out.print("Full name: ");
            String fullName = sc.nextLine();
            System.out.print("Age: ");
            byte age = sc.nextByte();
            sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Phone number: ");
            String phoneNumber = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            students[i].setStudentCode(id).setFullName(fullName).setAge(age).setGender(gender).setPhoneNumber(phoneNumber).setEmail(email);
        }
    }

    static void writeStudent() {
        System.out.print("--------------------------------------------------------------------------------------------\n");
        System.out.println("STUDENTS LIST");
        System.out.printf("%-10s %-30s %-5s %-10s %-20s %-20s \n", "ID", "| Full name", " | Age", "| Gender", "| Phone number", "| Email");
        for(int i=1; i<=n; i++) {
            students[i].Display();
        }
    }

    public static void main(String[] args) {
        readStudent();
        writeStudent();
    }
}
