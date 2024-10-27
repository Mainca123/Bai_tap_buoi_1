package Bai_tap_b1;

import java.util.Scanner;

public class Bai1 {
    static String Doi_co_so(long Bien, long Co_so) {
        String Ket_qua ="";
        if(Bien>0) {
            while (Bien != 0) {
                long tam = Bien % Co_so;
                Ket_qua = ((tam < 10) ? (char) (tam + 48) : (char) (tam + 55)) + Ket_qua;
                Bien /= Co_so;
            }
        } else Ket_qua = "0";
        return Ket_qua;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long Bien = sc.nextLong(), Co_so = sc.nextLong();
        System.out.println(Doi_co_so(Bien, Co_so));
    }
}