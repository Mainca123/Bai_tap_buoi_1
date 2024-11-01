package Bai_tap_b3;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Student {
    private String studentCode;
    private String fullName;
    private byte age;
    private String gender;
    private String phoneNumber;
    private String email;

    //Constructor
    public Student() {

    }
    public Student(String studentCode, String fullName, byte age, String gender, String phoneNumber, String email) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    //Display
    public void Display() {
        System.out.printf("%-11S| %-30s| %-4s| %-9s| %-19s| %-20s\n", studentCode, fullName, ((age<10) ? ("0"+age) : age), gender, phoneNumber, email);
    }

    //Getter
    public String getStudentCode() {
        return studentCode;
    }
    public String getFullName() {
        return fullName;
    }
    public byte getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }

    //Setter
    public Student setStudentCode(String studentCode) {
        this.studentCode = studentCode;
        return this;
    }
    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }
    public Student setAge(byte age) {
        this.age = age;
        return this;
    }
    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public Student setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public Student setEmail(String email) {
        this.email = email;
        return this;
    }
}

