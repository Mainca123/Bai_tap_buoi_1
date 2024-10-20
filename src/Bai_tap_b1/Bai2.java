package Bai_tap_b1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long Ket_qua = 1;
        while(n != 0) {
            Ket_qua *= n%10;
            n /= 10;
        }
        System.out.println(Ket_qua);
    }
}
