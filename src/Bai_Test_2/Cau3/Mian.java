package Bai_Test_2.Cau3;

import Bai_Test_2.Cau1.Account;
import Bai_Test_2.Cau1.Role;
import Bai_Test_2.Cau1.Status;
import Bai_Test_2.Cau2.impl.AccountServiceImpl;
import Bai_Test_2.Cau2.impl.AuthServiceImpl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Mian {

    public static Scanner scanner = new Scanner(System.in);
    public static AuthServiceImpl authService = new AuthServiceImpl();
    public static void main(String[] args) {
        while(true) {
            if(authService.getCurrent() == null) {
                authService.login(scanner);
            } else {
                if(authService.current.getRole().equals(Role.ADMIN))
                    admin(authService.current);
                else
                    user();
            }
        }
    }
    public static void user(){
        System.out.println("Chưa  làm!!!!");
        return;
    }

    public static void admin(Account account) {
        AccountServiceImpl accountService = new AccountServiceImpl();
        while(true) {
            System.out.println(" ===== HỆ THỐNG QUẢN LÝ TÀI KHOẢN =====");
            System.out.println("Xin chào ADMIN: ["+ account.getUserName() + "]");
            System.out.println("Chọn một trong các chức năng sau:");
            System.out.println("1. Xem danh sách tài khoản");
            System.out.println("2. Tạo tài khoản mới");
            System.out.println("3. Tìm tài khoản theo userName");
            System.out.println("4. Xóa tài khoản");
            System.out.println("5. Thay đổi trạng tháy tài khoản");
            System.out.println("6. Xem thông tin cá nhân");
            System.out.println("0. Đăng xuất");
            System.out.println("----------------------------------");
            System.out.print("Nhập lựa chọn của bạn: ");
            String chon = scanner.next();
            scanner.nextLine();
            if(chon.length()>1)
                chon = "7";
            switch (chon) {
                case "1":
                    accountService.getAllAccount();
                    break;
                case "2":
                    Account acconut = null;
                    accountService.createNewAccount(acconut);
                    break;
                case "3":
                    System.out.print("Nhập userName cần tìm:");
                    String name = scanner.next();
                    accountService.getAccountByUsername(name);
                    break;
                case "4":
                    System.out.print("Nhập userName cần xóa:");
                    name = scanner.next();
                    accountService.deleteAccount(name);
                    break;
                case "5":
                    System.out.print("Nhập userName cần thay đổi trạng thái: ");
                    name =scanner.next();
                    System.out.println("Enter 1 -> ACTIVE\n" +
                            "Enter 2 -> BAN;");
                    boolean check = false;
                    int chonSta = 0;
                    Status status = Status.BAN;
                    while (!check){
                        check = true;
                        try {
                            System.out.print("Enter your choice: ");
                            chonSta = scanner.nextInt();
                        }
                        catch (Exception e) {
                            System.out.println("NOT HAVE CHOICE!!!! ");
                            check = false;
                        }
                    }
                    status = switch (chonSta) {
                        case 1 -> Status.ACTIVE;
                        case 2 -> Status.BAN;
                        default -> status;
                    };
                    accountService.changeStatus(name,status);
                    break;
                case "6":
                    System.out.print("THÔNG TIN CÁ NHÂN: ");
                    System.out.println(accountService.current);
                case "0":
                    authService.logout();
                    return;
                default:
                    System.out.println("không tồn tại!!");
                    break;
            }

        }
    }
}
