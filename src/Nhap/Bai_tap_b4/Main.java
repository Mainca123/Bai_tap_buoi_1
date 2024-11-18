package Nhap.Bai_tap_b4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static ArrayList<Book> books = new ArrayList<>();
    public static TruyenCoTich truyenCoTich;
    public static Scanner scanner = new Scanner(System.in);

    /// Khởi tạo mảng sách
    public static void khoiTao() {
        TacGia tacGia1 = new TacGia("F. Scott Fitzgerald", 1000, 1070);
        books.add(new Book(1, "Đại Gia Gatsby", tacGia1, 1025, "Giấc mơ Mỹ", 300.0));

        TacGia tacGia2 = new TacGia("Harper Lee", 1920, 2000);
        books.add(new Book(2, "Giết Con Chim Nhại", tacGia2, 1960, "Bất công chủng tộc", 200.0));

        TacGia tacGia3 = new TacGia("George Orwell", 1900, 1980);
        books.add(new Book(3, "1984", tacGia3, 1949, "Xã hội toàn trị", 450.0));

        TacGia tacGia4 = new TacGia("Jane Austen", 1790, 1856);
        books.add(new Book(4, "Kiêu Hãnh & Định Kiến", tacGia4, 1813, "Tình yêu Regency", 150.0));

        TacGia tacGia5 = new TacGia("J.D. Salinger", 1910, 1996);
        books.add(new Book(5, "Kẻ Giữ Đồng Lửa", tacGia5, 1951, "Sự lạc lõng", 100.0));

        truyenCoTich = new TruyenCoTich(1, "Đại Gia Gatsby", tacGia1, 1025, "Giấc mơ Mỹ", 300.0);
        books.add(truyenCoTich);

    }

    /// Menu
    public static void menu() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("DANH SÁCH MENU BẠN CÓ THỂ CHỌN");
        System.out.println("Nhập 1 Thêm sách mới");
        System.out.println("Nhập 2 Chỉnh sửa thông tin sách");
        System.out.println("Nhập 3 In ra danh sách các cuốn sách có trong mảng");
        System.out.println("Nhập 4 In ra cuốn sách lâu đời cổ kính nhất");
        System.out.println("Nhập 5 In ra cuốn sách phù hợp với giá tiền người mua yêu cầu");
        System.out.println("Nhập 6 Sắp xếp lại danh sách các cuốn sách theo giá tiền");
        System.out.println("Nhập 0 để dừng");
        System.out.println("---------------------------------------------------------------");
    }

    /// 1. Thêm sách
    public static void addBook() {
        Book book = new Book();
        System.out.println("NHẬP THÔNG TIN SÁCH CẦN THÊM");
        System.out.print("Mã Sách: ");
        book.setMaSach(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Tên sách: ");
        book.setTenSach(scanner.nextLine());

        TacGia tacGia = new TacGia();
        System.out.print("Tên tác giả: ");
        tacGia.setName(scanner.nextLine());
        System.out.print("Năm sinh: ");
        tacGia.setYearBone(scanner.nextInt());
        System.out.print("Năm mất: ");
        tacGia.setYearDie(scanner.nextInt());
        book.setTacGia(tacGia);

        System.out.print("Năm sản xuât: ");
        book.setNamSanXuat(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Tóm tắt nội dung: ");
        book.setTomTatNoiDung(scanner.nextLine());
        System.out.print("Giá thành: ");
        book.setGiaTien(scanner.nextDouble());
        books.add(book);
    }

    /// 2. Chỉnh sửa sách
    public static void editBook() {
        System.out.println("DANH SÁCH CÁC SÁCH ĐANG CÓ");
        writeAllBook(books);
        System.out.print("\nNhập mã sách cần chỉnh: ");
        int id = scanner.nextInt();
        char check = '0';
        scanner.nextLine();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getMaSach() == id) {
                System.out.print("Nhập \"Y\" nếu bạn muốn đổi 'mã sách' hoặc nhập \"bất kỳ\" để bỏ qua:");
                check = scanner.next().charAt(0);
                if (check == 'Y' || check == 'y') {
                    System.out.print("Mã sach: ");
                    books.get(i).setMaSach(scanner.nextInt());
                    scanner.nextLine();
                }

                System.out.print("Nhập \"Y\" nếu bạn muốn đổi 'tên sách' hoặc nhập \"bất kỳ\" để bỏ qua:");
                check = scanner.next().charAt(0);
                scanner.nextLine();
                if (check == 'Y' || check == 'y') {
                    System.out.print("Tên sach: ");
                    books.get(i).setTenSach(scanner.nextLine());
                }

                System.out.print("Nhập \"Y\" nếu bạn muốn đổi 'tác giả' hoặc nhập \"bất kỳ\" để bỏ qua:");
                check = scanner.next().charAt(0);
                scanner.nextLine();
                if (check == 'Y' || check == 'y') {
                    TacGia tacGia = new TacGia();
                    System.out.print("Tên tác giả: ");
                    tacGia.setName(scanner.nextLine());
                    System.out.print("Năm sinh: ");
                    tacGia.setYearBone(scanner.nextInt());
                    System.out.print("Năm mất: ");
                    tacGia.setYearDie(scanner.nextInt());
                    books.get(i).setTacGia(tacGia);
                }

                System.out.print("Nhập \"Y\" nếu bạn muốn đổi 'năm sản xuất' hoặc nhập \"bất kỳ\" để bỏ qua:");
                check = scanner.next().charAt(0);
                if (check == 'Y' || check == 'y') {
                    System.out.print("Năm sản xuất: ");
                    books.get(i).setNamSanXuat(scanner.nextInt());
                    scanner.nextLine();
                }

                System.out.print("Nhập \"Y\" nếu bạn muốn đổi 'tóm tắt nội dung' hoặc nhập \"bất kỳ\" để bỏ qua:");
                check = scanner.next().charAt(0);
                scanner.nextLine();
                if (check == 'Y' || check == 'y') {
                    System.out.print("Nội dung tóm tắt: ");
                    books.get(i).setTomTatNoiDung(scanner.nextLine());
                }

                System.out.print("Nhập \"Y\" nếu bạn muốn đổi 'giá thành' hoặc nhập \"bất kỳ\" để bỏ qua:");
                check = scanner.next().charAt(0);
                if (check == 'Y' || check == 'y') {
                    System.out.print("Gía Thành: ");
                    books.get(i).setGiaTien(scanner.nextDouble());
                }

                System.out.println("\nDANH SÁCH TẤT CẢ CÁC SÁCH SAU KHI ĐÃ CHỈNH SỬA");
                writeAllBook(books);
                break;
            }
        }
        if (check == '0') {
            System.out.println("Sách đang tìm không tồn tại!!!");
        }
    }

    /// 3. In ra tất cả các sách
    public static void writeAllBook(ArrayList<Book> books) {
        for (Book book : books) {
            book.display();
        }
    }

    /// 4. In ra cuốn sách cổ kính nhất
    public static void writeBookMinYear() {
        int yearMin = Integer.MAX_VALUE;
        for (Book book : books) {
            yearMin = Math.min(yearMin, book.getNamSanXuat());
        }
        for (Book book : books) {
            if (book.getNamSanXuat() == yearMin) {
                book.display();
                break;
            }
        }
    }

    /// 5. In ra cuốn sách có thể mua
    public static void writeBookAffordable() {
        System.out.print("Nhập số tiền bạn có thể trả:");
        double money = scanner.nextDouble();
        scanner.nextLine();
        ArrayList<Book> bookAffordable = new ArrayList<>();
        for (Book book : books) {
            if (book.getGiaTien() <= money) {
                bookAffordable.add(book);
            }
        }
        System.out.println("CÁC CUỐN SÁCH CÓ THỂ MUA");
        if (bookAffordable.size() > 0)
            writeAllBook(bookAffordable);
        else System.out.println("Số tiền không đủ mua bất kỳ cuốn nào");

    }

    /// 6. Sắp xếp theo tên hoặc theo giá
    public static void sortBook() {
        System.out.println("Chọn cách 'sắp xếp theo tên' hãy nhập \"1\" - 'sắp xếp theo giá' hãy nhập bất kỳ");
        String check = scanner.next();
        if (check.equals("1"))
            books.sort(Comparator.comparing(Book::getTenSach));
        else
            books.sort(Comparator.comparing(Book::getGiaTien));
        System.out.println("DANH SÁCH SAU KHI SẮP XẾP");
        writeAllBook(books);
    }

    /// Main
    public static void main(String[] args) {
        khoiTao();
        System.out.println("DANH SÁCH CÁC SÁCH ĐANG CÓ");
        writeAllBook(books);
        String chonMenu;
        do {
            menu();
            System.out.println("Nhập sự lựa của bạn");
            chonMenu = scanner.next();
            switch (chonMenu) {
                case "1": {
                    addBook();
                    break;
                }
                case "2": {
                    editBook();
                    break;
                }
                case "3": {
                    System.out.println("DANH SÁCH TẤT CẢ CÁC SÁCH");
                    writeAllBook(books);
                    break;
                }
                case "4": {
                    System.out.println("CUỐN SÁCH SỔ KÍNH NHẤT LÀ");
                    writeBookMinYear();
                    break;
                }
                case "5": {
                    writeBookAffordable();
                    break;
                }
                case "6": {
                    sortBook();
                    break;
                }
                case "0": {
                    System.out.print("KẾT THÚC");
                    break;
                }
                default: {
                    System.out.println("---> ero ---> \" " + chonMenu + " không có trong menu \"");
                    break;
                }
            }
        } while (!chonMenu.equals("0"));
    }
}
