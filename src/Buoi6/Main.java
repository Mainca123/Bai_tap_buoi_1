package Buoi6;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        Menu menu = new Menu();
        String id = "";
        while(true) {
            main.menus();
            System.out.print("Nhập lựa chọn: "); char chon = scanner.nextLine().charAt(0);
            switch (chon){
                case '1':
                    System.out.print("Nhập id:"); id = scanner.next(); scanner.nextLine();
                    System.out.print("Nhập tên:"); String name = scanner.nextLine();
                    menu.uppdate(id, name);
                    break;
                case '2':
                    System.out.print("Nhập id:"); id = scanner.next(); scanner.nextLine();
                    menu.select(id);
                    break;
                case '3':
                    System.out.println("ĐÃ DỪNG !!!");
                    return;
                default:
                    System.out.println("KHÔNG TỒN TẠI LỰA CHỌN !!!!");
                    break;
            }
        }
    }
    public void menus() {
        System.out.println("1. Update tên theo id");
        System.out.println("2. Select theo id");
        System.out.println("3. THOÁT");
    }
}
