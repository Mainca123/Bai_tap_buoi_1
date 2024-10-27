package Nhap;

import java.util.Scanner;

public class bai1 {
    static Scanner sc = new Scanner(System.in);
    static final int N = 10005, A = 1000005;

    public static void main(String[] args) {

       int n=sc.nextInt();
       int[] a = new int[N];
       int[] id = new int[A];
       int Max = 0, Min = 0;
       for(int i=1;i<=n;i++) {
           a[i] = sc.nextInt();
           id[a[i]]++;
           Max = Math.max(Max, id[a[i]]);
           Min = Math.max(Min, a[i]);
       }

       for(int i=1;i<=n;i++)
           if(id[a[i]]==Max)
               Min = Math.min(Min, a[i]);
       System.out.println(Min + id[Min]);
    }
}
