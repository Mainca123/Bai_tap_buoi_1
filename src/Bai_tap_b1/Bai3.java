package Bai_tap_b1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] Mang = new long[10];
        for(int i=1; i<=5; i++)
            Mang[i] = sc.nextLong();

        long Max = Mang[1], Max_nhi = Max;
        for(int i=2; i<=5; i++)
            if(Mang[i] > Max) {
                Max_nhi = Max;
                Max = Mang[i];
            } else if(Mang[i] == Max) Max_nhi = Max;
        System.out.println(Max_nhi + " " + Max);
    }
}
