package Bai_test_1;

import java.util.Scanner;

public class Bai4 {

    public static int n;
    public static long[] a = new long[100005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a[0]=0;
        for(int i=1; i<=n; i++){
            a[i] = sc.nextLong();
            a[i] += a[i-1];
        }

        int q = sc.nextInt();
        while(q>0) {
            int l = sc.nextInt(),  r = sc.nextInt();
            System.out.println(a[r]-a[l-1]);
            q--;
        }

    }
}
