package Bai_tap_b5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ClassRoom {
    public static ArrayList<Student> students = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);
    public static ClassRoom classRoom = new ClassRoom();

    /// Main
    public static void main(String[] args) {
        int check = 0;
        while (check != 5) {
            classRoom.menu();
            check = scanner.nextInt();
            switch (check) {
                case 1: {
                    classRoom.inputStudent(students);
                    break;
                }
                case 2: {
                    classRoom.outputStudent(students);
                    break;
                }
                case 3: {
                    classRoom.sortByGpa(students);
                    break;
                }
                case 4: {
                    classRoom.removeStudent(students);
                    break;
                }
                case 5: {
                    return;
                }
            }
        }
    }

    /// SortByGpa
    public void sortByGpa(ArrayList<Student> students) {
        students.sort(Comparator.comparing(Student::getGpa));
    }

    /// InputStudent
    public void inputStudent(ArrayList<Student> students) {
        Student temp = new Student();
        do {
            temp = new Student();
            temp.input();
            students.add(temp);
        } while (temp.getId() != 555);
    }

    /// OutputStudent
    public void outputStudent(ArrayList<Student> students) {
        dauMuc();
        for (Student student : students) {
            student.output();
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    /// RemoveById
    public boolean removeStudent(Student students, int id) {
        return students.getId() == id;
    }
    public void removeStudent(ArrayList<Student> students) {
        System.out.print("Nhập ID muốn xóa: ");
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Đã xóa sinh viên có ID: " + id + "\n");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có ID: " + id + "\n");
    }

    /// Menu
    public void menu() {
        System.out.println("Nhập '1' để nhập thông tin các sinh viên (nhập đến khi nào mã sinh viên là 555 thì dừng không nhập nữa)");
        System.out.println("Nhập '2' để in ra thông tin các Sinh Viên");
        System.out.println("Nhập '3' để sắp xếp danh sách sinh viên theo điểm gpa");
        System.out.println("Nhập '4' để xóa sinh viên theo id");
        System.out.println("Nhập '5' Thoát chương trình)");
        System.out.println("Hãy nhập sự lựa chọn của bạn:");
    }

    /// Đầu mục
    public static void dauMuc() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("DANH SÁCH STUDENT");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", "STUDENT ID", "NAME", "AGE", "COMMUNE", "DISTRICT", "CITY", "CLASS NAME", "GPA");
    }
}
