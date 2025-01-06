package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    EntityManager entityManager = HibernateUtil.getEntityManager();
    public static Scanner scanner = new Scanner(System.in);

    // Thêm Category
    public void addCategory(){
        entityManager.getTransaction().begin();
        Category category = new Category();
        System.out.print("Nhập tên loại sản phẩm: ");
        category.setName(scanner.nextLine());
        System.out.print("Mô tả: ");
        category.setDescription(scanner.nextLine());
        entityManager.merge(category);
        entityManager.getTransaction().commit();
    }

    // Xóa Category (id)
    public void deleteCategory() {
        System.out.print("Nhập ID cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Category category = entityManager.find(Category.class, id);
        if(category != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(category);
            entityManager.getTransaction().commit();
        }
    }

    // Sửa Category
    public void updateCategory() {
        System.out.print("Nhập Id cần sửa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Category category = entityManager.find(Category.class, id);
        if(category != null){
            entityManager.getTransaction().begin();
            System.out.print("Nhập tên loại sản phẩm: ");
            category.setName(scanner.nextLine());
            System.out.print("Mô tả: ");
            category.setDescription(scanner.nextLine());
            entityManager.merge(category);
            entityManager.getTransaction().commit();
        }
    }

    // Hiển thị danh sách Category theo dạng bảng
    public void selectCategory() {
        TypedQuery<Category> query = entityManager.createQuery ("Select c From Category c" , Category.class);
        ArrayList<Category> categories = new ArrayList<>();
        categories = (ArrayList<Category>) query.getResultList();
        for(int i=1; i<=50; i++)
            System.out.print("=");
        System.out.println();
        System.out.printf("%16s\n","DANH SÁCH CATEGORY");
        for(int i=1; i<=50; i++)
            System.out.print("=");
        System.out.println();
        System.out.printf("%-5s%-20s%-20s\n", "ID", "NAME", "DESCRIPTION");
        for(Category category: categories)
            System.out.printf("%-5s%-20s%-20s\n", category.getId(), category.getName(), category.getDescription());
        for(int i=1; i<=50; i++)
            System.out.print("=");
        System.out.println();
    }

    // Thêm Product
    public void addProduct() {
        entityManager.getTransaction().begin();
        Product product = new Product();
        System.out.print("Nhập tên sản phẩm: ");
        product.setName(scanner.nextLine());
        System.out.print("Nhập giá: ");
        product.setPrice(scanner.nextDouble());
        System.out.print("Nhập số lượng: ");
        product.setQuantity(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Mô tả: ");
        product.setDescription(scanner.nextLine());
        entityManager.merge(product);
        entityManager.getTransaction().commit();
    }

    // Xoá Product (=id)
    public void deleteProduct() {
        System.out.print("Nhập id cần xóa: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product product = entityManager.find(Product.class, id);
        if(product != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(product);
            entityManager.getTransaction().commit();
        }
    }

    // Sửa Product
    public void updateProduct() {
        System.out.print("Nhập Id cần sửa:");
        int id = scanner.nextInt();
        scanner.nextLine();
        Product product = entityManager.find(Product.class, id);
        if(product != null) {
            entityManager.getTransaction().begin();
            System.out.print("Nhập tên sản phẩm: ");
            product.setName(scanner.nextLine());
            System.out.print("Nhập giá: ");
            product.setPrice(scanner.nextDouble());
            System.out.print("Nhập số lượng: ");
            product.setQuantity(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Mô tả: ");
            product.setDescription(scanner.nextLine());
            entityManager.merge(product);
            entityManager.getTransaction().commit();
        }
    }

    // Tìm kiếm Product theo tên, hiển thị theo dạng bảng gộp cả hai bảng
    public void selectGop() {
        List<Object[]> danhSach = null;
        System.out.print("Nhập tên cần tìm: ");
        String searchName = scanner.nextLine();
        try {
            entityManager.getTransaction().begin();
            danhSach = entityManager.createQuery(
                    "Select p.id, p.name, p.price, p.quantity, p.description, c.name From Product p join Category c Where p.name = :Name",
                    Object[].class).setParameter("Name", searchName).getResultList();
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }

        for(int i=1; i<=100; i++)
            System.out.print("=");
        System.out.println();
        System.out.printf("%35s\n","DANH SÁCH PRODUCT WITH CATEGORY");
        for(int i=1; i<=100; i++)
            System.out.print("=");
        System.out.println();
        System.out.printf("%-5s%-20s%-15s%-10s%-20s%-20s\n", "ID", "NAME PRODUCT", "PRICE", "QUANTITY", "DESCRIPTION", "NAME CATEGORY");
        for(Object[] object : danhSach)
            System.out.printf("%-5s%-20s%-15s%-10s%-20s%-20s\n", object[0], object[1], object[2], object[3], object[4], object[5]);
        for(int i=1; i<=100; i++)
            System.out.print("=");
        System.out.println();
    }
}
