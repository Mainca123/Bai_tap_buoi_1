package Nhap.service.impl;

import Nhap.model.PhysicalProduct;
import Nhap.model.Product;
import Nhap.model.Role;
import Nhap.model.User;
import Nhap.service.ProductManager;

import java.util.ArrayList;
import java.util.Scanner;

public class IUProductManager implements ProductManager {
    public static Scanner sc = new Scanner(System.in);
    private ArrayList<Product> listProduct = new ArrayList<>();
    private User currentUser;
    private ArrayList<User> listUser;

    public IUProductManager() {
        listProduct = new ArrayList<>();
        listUser = new ArrayList<>();
        listUser.add(new User("a1023", "Giàng Seo Chính", "main_ca", "main1231", Role.ADMIN));
        listUser.add(new User("b1023", "Nguyễn Văn A", "a123", "12345678", Role.CUSTOMER));
        currentUser = null;
    }

    public void addProduct() {
        PhysicalProduct product = new PhysicalProduct();
        System.out.print("Enter ID: ");
        product.setId(sc.next());
        sc.nextLine();
        System.out.print("Enter name: ");
        product.setName(sc.nextLine());
        System.out.print("Enter price: ");
        product.setPrice(sc.nextDouble());
        sc.nextLine();
        System.out.print("Enter quantity: ");
        product.setQuantity(sc.nextInt());
        sc.nextLine();
        listProduct.add(product);
    }

    public void writeProduct() {
        System.out.println("DANH SÁCH SẢN PHẨM");
        for (Product product : listProduct)
            System.out.println(product);
    }

    public boolean findProduct() {
        System.out.println("Enter product's name:");
        String name = sc.nextLine();
        for (Product product : listProduct)
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
                return true;
            }
        return false;
    }

    public boolean deleteProduct() {
        System.out.print("Enter product's ID: ");
        String id = sc.next();
        for (int i = 0; i < listProduct.size(); ++i)
            if (listProduct.get(i).getId().equals(id)) {
                listProduct.remove(i);
                return true;
            }
        return false;
    }

    public boolean updateProduct() {
        System.out.print("Enter product's ID update: ");
        String id = sc.next();
        sc.nextLine();
        for (Product product : listProduct) {
            if (product.getId().equals(id)) {
                System.out.print("Enter name: ");
                product.setName(sc.nextLine());
                System.out.print("Enter price: ");
                product.setPrice(sc.nextDouble());
                sc.nextLine();
                System.out.print("Enter quantity: ");
                product.setQuantity(sc.nextInt());
                sc.nextLine();
                return true;
            }
        }
        return false;
    }

    public String login() {
        System.out.print("Enter username: ");
        String name = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        for (User user : listUser) {
            if (user.getUserName().equals(name) && user.getPassword().equals(password)) {
                currentUser = user;
                if (user.getRole().equals(Role.ADMIN))
                    return "ADMIN";
                else return "CUSTOMER";
            }
        }
        return "ERROR";
    }

    public boolean logout() {
        if (currentUser != null) {
            currentUser = null;
            return true;
        }
        return false;
    }

}
