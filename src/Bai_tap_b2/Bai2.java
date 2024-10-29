package Bai_tap_b2;

import java.util.Scanner;

public class Bai2 {
    public static Scanner sc = new Scanner(System.in);
    public static final int N = 100005;
    public static void main(String[] args) {
        int[] arr = new int[N];
        int n = sc.nextInt(), k = sc.nextInt();
        arr[0] = 0;
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            arr[i] = arr[i-1] + x;
        }
        int Max = Integer.MIN_VALUE;
        int[] Min = new int[N];
        Min[0] = 0;
        for(int i=1; i<=n; i++)
            Min[i] = Math.min(arr[i],Min[i-1]);
        for(int i=k; i<=n; i++)
            Max=Math.max(arr[i]-Min[i-k],Max);
        System.out.println(Max);
    }
}
