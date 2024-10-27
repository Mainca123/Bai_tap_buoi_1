package Bai_tap_b2;

import java.util.Scanner;

public class Bai2 {
    public static final int N = 100005;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[N];
        int n = sc.nextInt(), k = sc.nextInt();
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            arr[i] = arr[i-1] + x;
        }
        int Max = Integer.MIN_VALUE;
        for(int i=k; i<=n; i++) {
            Max = Math.max(Max, arr[i] - arr[i - k]);
//            System.out.println(i + " " + (i-k) + " " + arr[i] );
        }
        System.out.println(Max);
    }
}
