package Bai_Test_2.Cau2.impl;

import Bai_Test_2.Cau1.Account;
import Bai_Test_2.Cau1.Address;
import Bai_Test_2.Cau1.Role;
import Bai_Test_2.Cau1.Status;
import Bai_Test_2.Cau2.AuthService;

import java.util.ArrayList;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {
    public ArrayList<Account> accounts = new ArrayList<Account>();
    public Account current;
    //Constructor
    public AuthServiceImpl() {
        Address address = new Address("123 a","Hà Nội");
        accounts.add(new Account("1203","Nguyễn Văn A",18, address, "12/03/2005","A123","12345678", Role.ADMIN, Status.ACTIVE));
    }

    //getcurrent
    public Account getCurrent() {
        return current;
    }

    public void login(Scanner scanner){
        System.out.print("Enter userName: ");
        String name = scanner.next();
        scanner.nextLine();
        System.out.print("Enter password: ");
        String pass = scanner.next();
        scanner.nextLine();
        boolean check = false;
        for(Account account : accounts)
            if(account.getUserName().equals(name) && account.getPassword().equals(pass)){
                current = account;
                check = true;
                break;
            }

        if(check){
            if(current.getStatus().equals(Status.ACTIVE))
                System.out.println("ĐĂNG NHẬP THÀNH CÔNG");
            else{
                current = null;
                System.out.println("TÀI KHOẢN BỊ KHÓA!!!!");
            }
        }
        else System.out.println("ĐĂNG NHẬP THẤT BẠI");
    }

    public void logout(){
        if(current != null){
            System.out.println("ĐÃ ĐĂNG XUẤT");
            current = null;
        }
        else {
            System.out.println("CHƯA ĐĂNG NHẬP!!");
        }
    }

    public void changePassword(String userName, String oldPassword, String newPassword) {
        boolean check = false;
        for(Account account : accounts)
            if(account.getUserName().equals(userName) && account.getPassword().equals(oldPassword)){
                account.setPassword(newPassword);
                check = true;
                break;
            }
        if(check)
            System.out.println("ĐÃ THAY MẬT KHẨU");
        else
            System.out.println("KHÔNG THỂ THAY ĐƯỢC DO TÊN HOẶC MẬT KHẨU CŨ SAI!!!");
    }
}
