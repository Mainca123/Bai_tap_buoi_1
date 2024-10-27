package Nhap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[100005];
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextLong();
            a[i] += a[i-1];
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            System.out.println(a[r] - a[l-1]);
        }
    }
}
