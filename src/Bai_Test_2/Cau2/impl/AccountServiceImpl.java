package Bai_Test_2.Cau2.impl;

import Bai_Test_2.Cau1.Account;
import Bai_Test_2.Cau1.Role;
import Bai_Test_2.Cau1.Status;
import Bai_Test_2.Cau2.AccountService;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountServiceImpl extends AuthServiceImpl implements AccountService {
    public ArrayList<Account> accounts = super.accounts;
    public static Scanner scanner = new Scanner(System.in);

    //Constructor
    public AccountServiceImpl() {

    }

    public void createNewAccount(Account account){
        account = new Account();
        System.out.print("Enter new userName: ");
        account.setUsername(scanner.next());
        scanner.nextLine();
        System.out.print("Enter new password: ");
        account.setPassword(scanner.next());
        scanner.nextLine();
        System.out.println("Enter 1 -> ADMIN\n" +
                           "Enter 2 -> USER");

        boolean check = false;
        int chon = 0;
        while (!check){
            check = true;
            try {
                System.out.print("Enter your choice: ");
                chon = scanner.nextInt();
            }
            catch (Exception e) {
                System.out.println("NOT HAVE CHOICE!!!! ");
                check = false;
            }
        }
        switch (chon) {
            case 1:
                account.setRole(Role.ADMIN);
                break;
            case 2:
                account.setRole(Role.USER);
                break;
        }

        System.out.println("Enter 1 -> ACTIVE\n" +
                           "Enter 2 -> BAN;");
        check = false;
        chon = 0;
        while (!check){
            check = true;
            try {
                System.out.print("Enter your choice: ");
                chon = scanner.nextInt();
            }
            catch (Exception e) {
                System.out.println("NOT HAVE CHOICE!!!! ");
                check = false;
            }
        }
        switch (chon) {
            case 1:
                account.setStatus(Status.ACTIVE);
                break;
            case 2:
                account.setStatus(Status.BAN);
                break;
        }
    }
    public Account getAccountByUsername(String userName){
        for(Account account : accounts)
            if(account.getUserName().equals(userName))
                return account;
        return null;
    }

    public void deleteAccount(String userName){
        boolean check = false;
        for(int i=0; i<accounts.size(); i++)
            if(accounts.get(i).getUserName().equals(userName)){
                check =true;
                accounts.remove(i);
            }
        if(check) System.out.println("ĐÃ XÓA");
        else System.out.println("KHÔNG TỒN TẠI NGƯỜI DÙNG!!!");
    }

   public void changeStatus(String userName, Status status){
        boolean check = false;
        for(Account account : accounts)
            if(account.getUserName().equals(userName)){
                check =true;
                account.setStatus(status);
            }
        if(check) System.out.println("ĐÃ SỬA");
        else System.out.println("KHÔNG TỒN TẠI NGƯỜI DÙNG!!!");
    }

    public void  getAllAccount(){
        if(this.accounts.isEmpty()){
            System.out.println("--------- TRỐNG -----------");
            return;
        }
        for (Account account :accounts)
            System.out.println(account);
    }
}
