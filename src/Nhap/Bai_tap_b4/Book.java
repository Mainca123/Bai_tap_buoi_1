package Nhap.Bai_tap_b4;

public class Book {
    private int maSach, namSanXuat;
    private String tenSach, tomTatNoiDung;
    private double giaTien;
    private TacGia tacGia;

    //Constructor
    public Book() {}
    public Book(int maSach,  String tenSach, TacGia tacGia, int namSanXuat, String tomTatNoiDung, double giaTien) {
        this.maSach = maSach;
        this.tacGia = tacGia;
        this.tenSach = tenSach;
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

    public TacGia getTacGia() {return tacGia;}
    public void setTacGia(TacGia tacGia) {this.tacGia = tacGia;}

    public void setTenSach(String tenSach) { this.tenSach = tenSach; }
    public String getTenSach() { return tenSach.toString();}

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
        return "Book{" + " maSach=" + maSach + ", tenSach='" + tenSach + "' " + tacGia +
                "', tomTatNoiDung='" + tomTatNoiDung + "', namSanXuat=" + namSanXuat + ", giaTien=" + giaTien + '}';
    }

    public void display(){
        System.out.println(toString());
    }
}
