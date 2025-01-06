package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Menu menu = new Menu();
        while(true) {
            System.out.println("1. Thêm Category.\n" +
                    "2. Xoá Category (=id).\n" +
                    "3. Sửa Category.\n" +
                    "4. Hiển thị danh sách Category theo dạng bảng.\n" +
                    "5. Thêm Product.\n" +
                    "6. Xoá Product (=id).\n" +
                    "7. Sửa Product. \n" +
                    "8. Tìm kiếm Product theo tên, hiển thị theo dạng bảng gộp.\n" +
                    "9. Thoát.\n");
            System.out.print("Chọn: ");
            char chioce = scanner.nextLine().charAt(0);
            switch (chioce) {
                case '1':
                    menu.addCategory();
                    System.out.println("ĐÃ THÊM");
                    break;
                case '2':
                    menu.deleteCategory();
                    System.out.println("ĐÃ XÓA");
                    break;
                case '3':
                    menu.updateCategory();
                    System.out.println("ĐÃ SỬA");
                    break;
                case '4':
                    menu.selectCategory();
                    break;
                case '5':
                    menu.addProduct();
                    System.out.println("ĐÃ THÊM SẢN PHẨM");
                    break;
                case '6':
                    menu.deleteProduct();
                    System.out.println("ĐÃ XÓA SẢN PHẨM");
                    break;
                case '7':
                    menu.updateProduct();
                    System.out.println("ĐÃ SỬA");
                    break;
                case '8':
                    menu.selectGop();
                    break;
                case '9':
                    System.out.println("\nĐÃ THOÁT!!!!!!!!!");
                    return;
                default:
                    System.out.println("không tồn tại !!!!!!!!!!!!!!");
                    break;
            }

        }
    }
}