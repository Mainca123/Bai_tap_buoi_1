package Bai_tap_b2;

import java.util.Scanner;

public class Bai1 {
    public static final int N = 10005;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[N];
        int n = sc.nextInt(), k = sc.nextInt();
        for(int i=1; i<=n; i++)
            nums[i] = sc.nextInt();
        int l=1, r = n, mid = 0;
        while(l < r) {
            mid = (l+r+1)/2;
            if(nums[mid] > k) r=mid-1;
            else l=mid;
//            System.out.println(l + " " + mid + " " + r);
        }
        if(nums[l] == k) System.out.println(l-1);
        else System.out.println(-1);
    }
}
