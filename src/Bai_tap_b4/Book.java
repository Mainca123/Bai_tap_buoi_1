package Bai_tap_b4;

public class Book {
    private int maSach, namSanXuat;
    private String tenSach, tenTacGia, tomTatNoiDung;
    private double giaTien;

    //Constructor
    public Book() {}
    public Book(int maSach, String tenSach, String tenTacGia, int namSanXuat, String tomTatNoiDung, double giaTien) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.namSanXuat = namSanXuat;
        this.tomTatNoiDung = tomTatNoiDung;
        this.giaTien = giaTien;
    }

    //Getter and Setter
    public int getMaSach() {
        return maSach;
    }
    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }
    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTomTatNoiDung() {
        return tomTatNoiDung;
    }
    public void setTomTatNoiDung(String tomTatNoiDung) {
        this.tomTatNoiDung = tomTatNoiDung;
    }

    public double getGiaTien() {
        return giaTien;
    }
    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "Book{" + " maSach=" + maSach + ", tenSach='" + tenSach + "', tenTacGia='" + tenTacGia +
                "', tomTatNoiDung='" + tomTatNoiDung + "', namSanXuat=" + namSanXuat + ", giaTien=" + giaTien + '}';
    }

    public void display(){
        System.out.println(toString());
    }
}
