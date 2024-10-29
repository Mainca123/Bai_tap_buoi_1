package Bai_test_1;

import java.util.Scanner;

public class Bai3 {
    public static double x;
    public static int y;

    public static double mu(double x, int y) {
        if(y==1) return x;
        double sum = mu(x,y/2);
        sum *= sum;
        if(y%2==0) return sum;
        else return sum*x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        y = sc.nextInt();
        System.out.println(mu(x,y));
    }
}
