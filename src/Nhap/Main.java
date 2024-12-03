package Nhap;

import Nhap.service.impl.IUProductManager;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static IUProductManager productManager = new IUProductManager();

    public static void adminMenu() {
        while (true) {
            System.out.println("\n---- DANH SÁCH MENU ----\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Hiển thị danh sách sản phẩm\n" +
                    "3. Tìm kiếm sản phẩm theo tên\n" +
                    "4. Xóa sản phẩm theo mã\n" +
                    "5. Cập nhật thông tin sản phẩm\n" +
                    "6. Thoát\n");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.writeProduct();
                    break;
                case 3:
                    if (!productManager.findProduct())
                        System.out.println("Không tồn tại sản phẩm!!!");
                    break;
                case 4:
                    if (productManager.deleteProduct())
                        System.out.println("Xoa thành công");
                    else
                        System.out.println("không tìm được sản phẩm!!");
                    break;
                case 5:
                    if (productManager.updateProduct())
                        System.out.println("Cập nhập thành công");
                    else
                        System.out.println("không tìm được sản phẩm!!");
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Không tồn tại lựa chọn !!");
                    break;
            }
        }
    }

    public static void userMenu() {
        while (true) {
            System.out.println("\n---- DANH SÁCH MENU ----\n" +
                    "1. Hiển thị danh sách sản phẩm\n" +
                    "2. Tìm kiếm sản phẩm theo tên\n" +
                    "3. Thoát\n");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    productManager.writeProduct();
                    break;
                case 2:
                    if (!productManager.findProduct())
                        System.out.println("Không tồn tại sản phẩm!!!");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Không tồn tại lụa chọn !!");
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("----- LOGIN -----");
            String check = productManager.login();
            if (check.equals("ERROR"))
                System.out.println("Sai mật khẩu hoặc tên đăng nhập không đúng");
            else if (check.equals("ADMIN")) {
                adminMenu();
                System.out.println("----- LOGOUT -----");
                productManager.logout();
            } else {
                userMenu();
                System.out.println("----- LOGOUT -----");
                productManager.logout();
            }
        }
    }
}
